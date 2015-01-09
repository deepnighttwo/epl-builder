package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

/**
 * User: mzang
 * Date: 2015-01-07
 * Time: 15:49
 */
public class PriorityPart implements Part {

    int priority;

    public PriorityPart() {

    }

    public PriorityPart(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String getPartString(Context context) {
        return " @Priority(" + priority + ") ";
    }
}
