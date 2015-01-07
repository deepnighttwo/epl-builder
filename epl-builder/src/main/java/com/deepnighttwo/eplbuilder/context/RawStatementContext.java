package com.deepnighttwo.eplbuilder.context;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 17:34
 */
public class RawStatementContext implements Context {

    private String epl;

    @Override
    public String genEPL() {
        return epl;
    }
}
