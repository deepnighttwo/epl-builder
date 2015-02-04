package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

import java.util.List;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 16:45
 */
public class SelectPart implements Part {

    JoinPart joinPart;

    VariationPart variationPart;

    List<Part> onConditions;

    public SelectPart() {
    }

    public SelectPart(JoinPart joinPart, VariationPart variationPart, List<Part> onConditions) {
        this.joinPart = joinPart;
        this.variationPart = variationPart;
        this.onConditions = onConditions;
    }

    public JoinPart getJoinPart() {
        return joinPart;
    }

    public void setJoinPart(JoinPart joinPart) {
        this.joinPart = joinPart;
    }

    public VariationPart getVariationPart() {
        return variationPart;
    }

    public void setVariationPart(VariationPart variationPart) {
        this.variationPart = variationPart;
    }

    public List<Part> getOnConditions() {
        return onConditions;
    }

    public void setOnConditions(List<Part> onConditions) {
        this.onConditions = onConditions;
    }

    @Override
    public String getPartString(Context context) {
        return null;
    }

}
