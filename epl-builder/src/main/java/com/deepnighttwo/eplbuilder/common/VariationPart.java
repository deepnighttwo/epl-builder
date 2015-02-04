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

    boolean isUnidirectional = false;

    int winLenMin = -1;

    String stdUniqueFieldname = null;


    public VariationPart() {
    }

    public VariationPart(String streamId, String streamAlias) {
        this.streamId = streamId;
        this.streamAlias = streamAlias;
    }

    public boolean isUnidirectional() {
        return isUnidirectional;
    }

    public void setUnidirectional(boolean isUnidirectional) {
        this.isUnidirectional = isUnidirectional;
    }

    public int getWinLenMin() {
        return winLenMin;
    }

    public void setWinLenMin(int winLenMin) {
        this.winLenMin = winLenMin;
    }

    public String getStdUniqueFieldname() {
        return stdUniqueFieldname;
    }

    public void setStdUniqueFieldname(String stdUniqueFieldname) {
        this.stdUniqueFieldname = stdUniqueFieldname;
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
        String ret = streamId;
        if (isUnidirectional == true) {
            ret = ret + " unidirectional as `" + streamAlias + "`";
        } else {
            if (winLenMin > 0) {
                ret = ret + ".win:time(" + winLenMin + " min)";
            }
            if (stdUniqueFieldname != null) {
                ret = ret + "std:unique(`" + stdUniqueFieldname + "`)";
            }
        }
        return ret;
    }
}
