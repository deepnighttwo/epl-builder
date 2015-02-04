package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;
import com.google.common.base.Strings;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 15:45
 */
public class FieldPart implements Part {

    public FieldPart() {

    }

    public FieldPart(VariationPart variationPart, String fieldName, String fieldAlias, String func) {
        this.variationPart = variationPart;
        this.fieldName = fieldName;
        this.fieldAlais = fieldAlias;
        this.func = func;
    }

    VariationPart variationPart;

    String fieldName;

    String fieldAlais;

    String func;

    @Override
    public String getPartString(Context context) {
        String ret = " `" + variationPart.getStreamAlias() + "`.`" + fieldName + "` ";
        if (Strings.isNullOrEmpty(func) == false) {
            ret = func + "(" + ret + ") ";
        }

        ret = ret + " as `" + fieldAlais + "`";
        return ret;
    }
}
