package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.*;

import java.util.List;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 15:43
 */
public class SelectContext extends Context {

    AnnotationPart annotation;

    ExpressionDeclaraionPart expressionDeclaraion;

    ContextPart contextPart;

    InsertPart insertPart;

    List<Part> selectFields;

    List<SelectPart> selectFroms;

    List<Part> whereConditions;

    List<Part> groupBys;

    List<Part> havingConditions;

    List<OutputPart> outputParts;

    OrderByPart orderBy;

    LimitPart limit;


    public static void main(String[] args) {

    }

    @Override
    public String genEPL() {
        return null;
    }
}
