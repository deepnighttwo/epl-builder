package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 15:45
 */
public class InsertPart implements Part {

    StreamTypePart streamTypePart;

    String streamName;

    public InsertPart() {

    }

    public InsertPart(String streamName) {
        this.streamName = streamName;
    }

    public InsertPart(StreamTypePart streamTypePart, String streamName) {
        this.streamTypePart = streamTypePart;
        this.streamName = streamName;
    }

    public StreamTypePart getStreamTypePart() {
        return streamTypePart;
    }

    public void setStreamTypePart(StreamTypePart streamTypePart) {
        this.streamTypePart = streamTypePart;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    @Override
    public String getPartString(Context context) {

        String ret = " insert ";
        if (streamTypePart != null) {
            ret = ret + (streamTypePart.getPartString(context));
        }

        ret = ret + " into " + streamName + " ";

        return ret;
    }
}
