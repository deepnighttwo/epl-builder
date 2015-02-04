package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.*;
import com.deepnighttwo.eplbuilder.util.DataTypeConstance;
import org.junit.Test;

/**
 * User: mzang
 * Date: 2015-01-30
 * Time: 14:36
 */
public class SelectContextTest {

    public void testasdfasdf() {
        SelectContext selectContext = new SelectContext();
        PriorityPart annotationPart = new PriorityPart();
        annotationPart.setPriority(5);

        HintPart hintPart = new HintPart();

    }

    @Test
    public void test() {
        SchemaContext saleItem = new SchemaContext();

        saleItem.setSchemaName("saleitem");

        saleItem.addField("id", DataTypeConstance.inttp);
        saleItem.addField("amount", DataTypeConstance.inttp);
        saleItem.addField("ts", DataTypeConstance.longtp);

        System.out.println(saleItem.genEPL());

        SelectContext filterSaleItem = new SelectContext();
        filterSaleItem.setInsertPart(new InsertPart("bigitems"));

        VariationPart filterVariation = new VariationPart("saleitem", "s");

        FieldPart id = new FieldPart(filterVariation, "id", "id", null);
        FieldPart amount = new FieldPart(filterVariation, "amount", "amount", null);
        FieldPart ts = new FieldPart(filterVariation, "ts", "ts", null);

        filterSaleItem.addSelectPart(id);
        filterSaleItem.addSelectPart(amount);
        filterSaleItem.addSelectPart(ts);

        SelectPart selectPart = new SelectPart(null, filterVariation, null);

        filterSaleItem.addSelectPart(selectPart);




    }

}
