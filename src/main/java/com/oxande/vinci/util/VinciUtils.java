package com.oxande.vinci.util;

public final class VinciUtils {

    public static String toJava(CharSequence str){
        if( str == null ) return "null";
        int len = str.length();
        StringBuilder buf = new StringBuilder(len + 10);
        buf.append("\"");
        for(int i = 0; i < len; i++){
            char c = str.charAt(i);
            switch( c ){
            case '\b':
                buf.append("\\b");
                break;
            case '\f':
                buf.append("\\f");
                break;
            case '\n':
                buf.append("\\n");
                break;
            case '\r':
                buf.append("\\r");
                break;
            case '\t':
                buf.append("\\t");
                break;
//            case '\'':
//                buf.append("\\\'");
//                break;
            case '\"':
                buf.append("\\\"");
                break;
            case '\\':
                buf.append("\\\\");
                break;
            default :
                if( c >= ' ' && c < 128 ){
                    // ASCII
                    buf.append(c);
                }
                else {
                    // Unicode
                    buf.append(String.format("\\u%04x", (int)c));
                }
            }
        }
        buf.append("\"");
        return buf.toString();
    }

    public static String quote(CharSequence str){
        if( str == null ) return "null";
        int len = str.length();
        StringBuilder buf = new StringBuilder(len + 10);
        buf.append("\"");
        for(int i = 0; i < len; i++){
            char c = str.charAt(i);
            switch( c ){
            case '\n':
            case '\r':
                buf.append(c);
            case '\t':
                buf.append("\\t");
                break;
            case '\"':
                buf.append("\\\"");
                break;
            case '\\':
                buf.append("\\\\");
                break;
            default :
                if( c >= ' ' && c < 65000 ){
                    // ASCII
                    buf.append(c);
                }
                else {
                    // Unicode
                    buf.append(String.format("\\u%04x", (int)c));
                }
            }
        }
        buf.append("\"");
        return buf.toString();
    }

}
