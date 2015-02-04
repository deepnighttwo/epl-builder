package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;

/**
 * User: mzang
 * Date: 2014-12-30
 * Time: 15:45
 */
public class VariationPart implements Part {

    String streamId;

    String streamAlias;

    public VariationPart() {
    }

    public VariationPart(String streamId, String streamAlias) {
        this.streamId = streamId;
        this.streamAlias = streamAlias;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getStreamAlias() {
        return streamAlias;
    }

    public void setStreamAlias(String streamAlias) {
        this.streamAlias = streamAlias;
    }

    @Override
    public String getPartString(Context context) {
        return null;
    }
}
