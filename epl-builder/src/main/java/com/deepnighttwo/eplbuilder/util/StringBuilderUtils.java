package com.deepnighttwo.eplbuilder.util;

/**
 * User: mzang
 * Date: 2015-01-09
 * Time: 14:08
 */
public class StringBuilderUtils {

    public static void replaceLast(StringBuilder sb, char newLastChar) {
        sb.setCharAt(sb.length() - 1, newLastChar);
    }

    public static void replaceLastString(StringBuilder sb, String newTails) {
        deleteLast(sb);
        sb.append(newTails);
    }

    public static void deleteLast(StringBuilder sb) {
        sb.setLength(sb.length() - 1);
    }

}
