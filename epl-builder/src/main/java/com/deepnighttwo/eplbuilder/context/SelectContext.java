package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.*;

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

    StreamTypePart streamTypePart;

    List<Part> selectFields;

    List<SelectPart> selectFroms;

    List<Part> whereConditions;

    List<Part> groupBys;

    List<Part> havingConditions;

    List<OutputPart> outputParts;

    OrderByPart orderBy;

    LimitPart limit;

    public StreamTypePart getStreamTypePart() {
        return streamTypePart;
    }

    public void setStreamTypePart(StreamTypePart streamTypePart) {
        this.streamTypePart = streamTypePart;
    }

    public void addAnnotation(Part part) {
        if (annotations == null) {
            annotations = new ArrayList<>();
        }
        annotations.add(part);
    }

    public void addSelectPart(Part selectField) {
        if (selectFields == null) {
            selectFields = new ArrayList<>();
        }
        selectFields.add(selectField);
    }

    public void addSelectFrom(SelectPart select) {
        if (selectFroms == null) {
            selectFroms = new ArrayList<>();
        }
        selectFroms.add(select);
    }


    public static void main(String[] args) {

    }

    @Override
    public String genEPL() {
        StringBuilder epl = new StringBuilder();

        if (insertPart != null) {
            epl.append(insertPart.getPartString(this));
        }

        epl.append("");


        return epl.toString();
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

    public List<SelectPart> getSelectFroms() {
        return selectFroms;
    }

    public void setSelectFroms(List<SelectPart> selectFroms) {
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
