package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

/**
 * User: mzang
 * Date: 2015-02-04
 * Time: 16:05
 */
public class StreamTypePart implements Part {

    public StreamTypePart() {
    }

    public StreamTypePart(String streamType) {
        this.streamType = streamType;
    }

    String streamType;

    @Override
    public String getPartString(Context context) {
        return streamType;
    }
}
