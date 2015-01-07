package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

/**
 * User: mzang
 * Date: 2015-01-07
 * Time: 11:53
 */
public class SchemaField implements Part {
    String fieldName;
    String fieldType;

    public SchemaField() {
    }

    public SchemaField(String fieldName, String fieldType) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    @Override
    public String getPartString(Context context) {
        return " `" + fieldName + "` " + fieldType;
    }
}
