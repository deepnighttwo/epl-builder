package com.deepnighttwo.eplbuilder.common;

import com.deepnighttwo.eplbuilder.context.Context;
import com.deepnighttwo.eplbuilder.util.StringBuilderUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * User: mzang
 * Date: 2015-01-09
 * Time: 13:59
 */
public class HintPart implements Part {

    Map<String, String> hints = new HashMap<String, String>();

    public HintPart() {

    }

    @Override
    public String getPartString(Context context) {

        if (hints.size() == 0) {
            return "";
        }

        StringBuilder hintStr = new StringBuilder();

        hintStr.append(" @Hint('");

        for (Map.Entry<String, String> entry : hints.entrySet()) {
            hintStr.append(entry.getKey() + "=" + entry.getValue() + ",");
        }

        StringBuilderUtils.replaceLastString(hintStr, "') ");

        return hintStr.toString();
    }
}
