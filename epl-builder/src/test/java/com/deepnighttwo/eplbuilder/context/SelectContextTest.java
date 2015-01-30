package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.HintPart;
import com.deepnighttwo.eplbuilder.common.PriorityPart;
import org.junit.Test;

/**
 * User: mzang
 * Date: 2015-01-30
 * Time: 14:36
 */
public class SelectContextTest {

    @Test
    public void test() {
        SelectContext selectContext = new SelectContext();
        PriorityPart annotationPart = new PriorityPart();
        annotationPart.setPriority(5);

        HintPart hintPart  = new HintPart();

    }
}
