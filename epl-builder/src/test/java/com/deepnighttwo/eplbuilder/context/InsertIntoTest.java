package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.util.DataTypeConstance;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.client.time.CurrentTimeEvent;
import org.junit.Test;

import java.util.Random;

/**
 * User: mzang
 * Date: 2015-01-07
 * Time: 12:26
 */
public class InsertIntoTest extends EsperTestBase {

    @Test
    public void testSpaceCharAtFieldName() throws InterruptedException {

        SchemaContext context = new SchemaContext();

        context.setSchemaName("orderevent");

        context.addField("orderId", DataTypeConstance.stringtp);
        context.addField("price", DataTypeConstance.inttp);

        System.out.println(context.genEPL());

        String win = "create window orderamount.win:time(1 hour).std:unique(orderId) (orderId string, amount int) ";

        String insert = "insert into normalorder select orderId, price from orderevent where price > 0 ";

        // output snapshot every 10 seconds

        String insert2 = "insert into orderamount select orderId as orderId, sum(price) as amount from normalorder.win:time(30 min) group by orderId";


//        String output = "select * from orderamount output snapshot every 10 seconds";


        esperAdmin.createEPL("@EventRepresentation(array=true) " + context.genEPL());
        esperAdmin.createEPL(win);
        esperAdmin.createEPL(insert);
        esperAdmin.createEPL(insert2);
//        EPStatement outputEPL = esperAdmin.createEPL(output);


//        outputEPL.addListener(new UpdateListener() {
//            @Override
//            public void update(EventBean[] newEvents, EventBean[] oldEvents) {
//
//                if (newEvents == null) {
//                    return;
//                }
//                for (EventBean bean : newEvents) {
////                    System.out.println("orderId:" + bean.get("orderId") + "\t amount:" + bean.get("amount"));
//
//                }
//            }
//        });

        esperRuntime.sendEvent(new CurrentTimeEvent(System.currentTimeMillis()));

        Random rand = new Random();
        long start = System.currentTimeMillis();
        int count = 200000;
        for (int i = 0; i < count; i++) {
            esperRuntime.sendEvent(new Object[]{String.valueOf(Math.abs(rand.nextInt())), i}, "orderevent");
        }
        System.out.println("message per sec=" + count * 1000.0 / (System.currentTimeMillis() - start));

        esperRuntime.sendEvent(new CurrentTimeEvent(System.currentTimeMillis() + 11 * 1000));

    }

}
