package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

import java.util.List;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 16:45
 */
public class SelectPart implements Part {

    VariationPart prevVariationPart;

    JoinPart joinPart;

    VariationPart variationPart;

    List<Part> onConditions;

    @Override
    public String getPartString(Context context) {
        return null;
    }

}
