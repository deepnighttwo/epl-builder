package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.*;
import com.deepnighttwo.eplbuilder.util.DataTypeConstance;
import com.deepnighttwo.eplbuilder.util.StreamTypeConstants;
import org.junit.Test;

/**
 * User: mzang
 * Date: 2015-01-30
 * Time: 14:36
 */
public class SelectContextTest {

    @Test
    public void test() {
        SchemaContext saleItem = new SchemaContext();

        saleItem.setSchemaName("saleitem");

        saleItem.addField("id", DataTypeConstance.inttp);
        saleItem.addField("amount", DataTypeConstance.inttp);
        saleItem.addField("ts", DataTypeConstance.longtp);

        System.out.println(saleItem.genEPL());

        SelectContext filterSaleItem = new SelectContext();
        filterSaleItem.setInsertPart(new InsertPart(
                new StreamTypePart(StreamTypeConstants.istream),
                "bigitems"));

        VariationPart filterVariation = new VariationPart("saleitem", "s");
        filterVariation.setUnidirectional(true);

        FieldPart id = new FieldPart(filterVariation, "id", "id", null);
        FieldPart amount = new FieldPart(filterVariation, "amount", "amount", null);
        FieldPart ts = new FieldPart(filterVariation, "ts", "ts", null);

        filterSaleItem.addSelectField(id);
        filterSaleItem.addSelectField(amount);
        filterSaleItem.addSelectField(ts);

        SelectFromPart selectFrom = new SelectFromPart(null, filterVariation, null);

        filterSaleItem.addSelectFrom(selectFrom);

        System.out.println(filterSaleItem.genEPL().replace("`",""));


    }

}
