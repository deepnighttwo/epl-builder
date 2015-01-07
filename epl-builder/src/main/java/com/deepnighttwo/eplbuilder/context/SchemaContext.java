package com.deepnighttwo.eplbuilder.context;

import com.deepnighttwo.eplbuilder.common.SchemaField;
import com.deepnighttwo.eplbuilder.util.IllegalContextException;
import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mzang
 * Date: 2015-01-07
 * Time: 11:52
 */
public class SchemaContext implements Context {
    String schemaName;

    List<SchemaField> fields = new ArrayList<SchemaField>();

    public String getSchemaName() {
        return schemaName;
    }

    public SchemaContext setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    public List<SchemaField> getFields() {
        return fields;
    }

    public void setFields(List<SchemaField> fields) {
        this.fields = fields;
    }

    public SchemaContext addField(String name, String type) {
        fields.add(new SchemaField(name, type));
        return this;
    }


    @Override
    public String genEPL() {
        if (Strings.isNullOrEmpty(schemaName) == true) {
            throw new IllegalContextException("No schema name defined");
        }
        if (fields.size() == 0) {
            throw new IllegalContextException("No schema field defined");
        }
        StringBuilder epl = new StringBuilder();
        epl.append("create schema " + schemaName + " as (");
        for (SchemaField field : fields) {
            epl.append(field.getPartString(this));
            epl.append(",");
        }
        epl.setCharAt(epl.length() - 1, ')');
        return epl.toString();
    }
}
