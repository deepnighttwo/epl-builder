package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.util.DataTypeConstance;
import com.deepnighttwo.eplbuilder.util.IllegalContextException;
import org.junit.Test;

/**
 * User: mzang
 * Date: 2015-01-07
 * Time: 12:26
 */
public class SchemaContextTest extends EsperTestBase {

    @Test
    public void testSpaceCharAtFieldName() {

        SchemaContext context = new SchemaContext();

        context.setSchemaName("testschemaname");

        context.addField("field 0", DataTypeConstance.booltp);
        context.addField("field 1", DataTypeConstance.stringtp);
        context.addField("field 2", DataTypeConstance.bytetp);
        context.addField("field 3", DataTypeConstance.inttp);
        context.addField("field 4", DataTypeConstance.longtp);
        context.addField("field 5", DataTypeConstance.floattp);
        context.addField("field 6", DataTypeConstance.doublety);

        System.out.println(context.genEPL());

        esperAdmin.createEPL(context.genEPL());

    }

    @Test
    public void testNormal() {

        SchemaContext context = new SchemaContext();

        context.setSchemaName("testschemaname");

        context.addField("field0", DataTypeConstance.booltp);
        context.addField("field1", DataTypeConstance.stringtp);
        context.addField("field2", DataTypeConstance.bytetp);
        context.addField("field3", DataTypeConstance.inttp);
        context.addField("field4", DataTypeConstance.longtp);
        context.addField("field5", DataTypeConstance.floattp);
        context.addField("field6", DataTypeConstance.doublety);

        System.out.println(context.genEPL());

        esperAdmin.createEPL(context.genEPL());

    }

    @Test(expected = IllegalContextException.class)
    public void testNoSchemaName() {
        SchemaContext context = new SchemaContext();
        context.addField("field 0", DataTypeConstance.booltp);
        context.addField("field 1", DataTypeConstance.stringtp);
        context.addField("field 2", DataTypeConstance.bytetp);
        context.addField("field 3", DataTypeConstance.inttp);
        context.addField("field 4", DataTypeConstance.longtp);
        context.addField("field 5", DataTypeConstance.floattp);
        context.addField("field 6", DataTypeConstance.doublety);
        context.genEPL();

    }

    @Test(expected = IllegalContextException.class)
    public void testNoSchemaField() {
        SchemaContext context = new SchemaContext();
        context.setSchemaName("testschemaname");
        context.genEPL();
    }
}
