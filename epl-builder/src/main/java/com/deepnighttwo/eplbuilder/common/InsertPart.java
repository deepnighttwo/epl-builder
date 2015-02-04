package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 15:45
 */
public class InsertPart implements Part {

    String streamName;

    public InsertPart() {

    }

    public InsertPart(String streamName) {
        this.streamName = streamName;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    @Override
    public String getPartString(Context context) {
        return " insert into " + streamName + " ";
    }
}
