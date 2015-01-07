package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.InsertPart;
import com.deepnighttwo.eplbuilder.common.Part;
import com.deepnighttwo.eplbuilder.common.SelectPart;

import java.util.List;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 15:43
 */
public class SelectContext implements Context {

    private InsertPart insertPart;

    private List<Part> selectFields;

    private List<SelectPart> selectFroms;

    private List<Part> whereConditions;

    public static void main(String[] args) {

    }

    @Override
    public String genEPL() {
        return null;
    }
}
