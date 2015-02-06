package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.*;
import com.deepnighttwo.eplbuilder.util.StringBuilderUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 15:43
 */
public class SelectContext extends Context {

    List<Part> annotations;

    ExpressionDeclarationPart expressionDeclaration;

    ContextPart contextPart;

    InsertPart insertPart;

    List<Part> selectFields;

    List<SelectFromPart> selectFroms;

    List<Part> whereConditions;

    List<Part> groupBys;

    List<Part> havingConditions;

    List<OutputPart> outputParts;

    OrderByPart orderBy;

    LimitPart limit;

    @Override
    public String genEPL() {
        StringBuilder epl = new StringBuilder();

        if (insertPart != null) {
            epl.append(insertPart.getPartString(this));
        }

        epl.append(" select ");


        for (Part selectField : selectFields) {
            epl.append(" ");
            epl.append(selectField.getPartString(this));
            epl.append(",");
        }

        StringBuilderUtils.deleteLast(epl);

        for (SelectFromPart selectFrom : selectFroms) {
            epl.append(selectFrom.getPartString(this));
        }

        return epl.toString();
    }

    public void addAnnotation(Part part) {
        if (annotations == null) {
            annotations = new ArrayList<>();
        }
        annotations.add(part);
    }

    public void addSelectField(Part selectField) {
        if (selectFields == null) {
            selectFields = new ArrayList<>();
        }
        selectFields.add(selectField);
    }


    public void addSelectFrom(SelectFromPart select) {
        if (selectFroms == null) {
            selectFroms = new ArrayList<>();
        }
        selectFroms.add(select);
    }

    public static void main(String[] args) {

    }

    public List<Part> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Part> annotations) {
        this.annotations = annotations;
    }

    public ExpressionDeclarationPart getExpressionDeclaration() {
        return expressionDeclaration;
    }

    public void setExpressionDeclaration(ExpressionDeclarationPart expressionDeclaration) {
        this.expressionDeclaration = expressionDeclaration;
    }

    public ContextPart getContextPart() {
        return contextPart;
    }

    public void setContextPart(ContextPart contextPart) {
        this.contextPart = contextPart;
    }

    public InsertPart getInsertPart() {
        return insertPart;
    }

    public void setInsertPart(InsertPart insertPart) {
        this.insertPart = insertPart;
    }

    public List<Part> getSelectFields() {
        return selectFields;
    }

    public void setSelectFields(List<Part> selectFields) {
        this.selectFields = selectFields;
    }

    public List<SelectFromPart> getSelectFroms() {
        return selectFroms;
    }

    public void setSelectFroms(List<SelectFromPart> selectFroms) {
        this.selectFroms = selectFroms;
    }

    public List<Part> getWhereConditions() {
        return whereConditions;
    }

    public void setWhereConditions(List<Part> whereConditions) {
        this.whereConditions = whereConditions;
    }

    public List<Part> getGroupBys() {
        return groupBys;
    }

    public void setGroupBys(List<Part> groupBys) {
        this.groupBys = groupBys;
    }

    public List<Part> getHavingConditions() {
        return havingConditions;
    }

    public void setHavingConditions(List<Part> havingConditions) {
        this.havingConditions = havingConditions;
    }

    public List<OutputPart> getOutputParts() {
        return outputParts;
    }

    public void setOutputParts(List<OutputPart> outputParts) {
        this.outputParts = outputParts;
    }

    public OrderByPart getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByPart orderBy) {
        this.orderBy = orderBy;
    }

    public LimitPart getLimit() {
        return limit;
    }

    public void setLimit(LimitPart limit) {
        this.limit = limit;
    }
}
