package com.deepnighttwo.eplbuilder.common.condition;

import com.deepnighttwo.eplbuilder.common.Part;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 16:49
 */
public abstract class Condition implements Part {
    protected Condition preCondition;
    protected String preConditionConnect;


}
