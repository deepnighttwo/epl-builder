package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.HintPart;
import com.deepnighttwo.eplbuilder.common.PriorityPart;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 16:21
 */
public abstract class Context {

    public PriorityPart priorityPart;

    public HintPart hintPart;


    public abstract String genEPL();

    public PriorityPart getPriorityPart() {
        return priorityPart;
    }

    public Context setPriorityPart(PriorityPart priorityPart) {
        this.priorityPart = priorityPart;
        return this;
    }

    public HintPart getHintPart() {
        return hintPart;
    }

    public Context setHintPart(HintPart hintPart) {
        this.hintPart = hintPart;
        return this;
    }

    public Context setPriority(int priority) {
        this.priorityPart = new PriorityPart(priority);
        return this;
    }
}
