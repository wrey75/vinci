package com.oxande.vinci.util;

public final class VinciUtils {

	public static String fromJava(CharSequence str){
		Assert.notNull(str, "str");
		int len = str.length();
		StringBuilder buf = new StringBuilder(len);
		Assert.isTrue(str.charAt(0) == '"');
		Assert.isTrue(str.charAt(len-1) == '"');
		int i = 1;
		while( i < len - 1){
			char c = str.charAt(i++);
			if(c == '\\'){
				switch(str.charAt(i++)){
	            case 'b':
	                buf.append("\b");
	                break;
	            case 'f':
	                buf.append("\f");
	                break;
	            case 'n':
	                buf.append("\n");
	                break;
	            case 'r':
	                buf.append("\r");
	                break;
	            case 't':
	                buf.append("\t");
	                break;
	            case '\'':
	                buf.append("'");
	                break;
	            case '\"':
	                buf.append("\"");
	                break;
	            case '\\':
	                buf.append("\\");
	                break;
	            case 'u':
	            	String unicode = "";
	            	for(int j = 0; j < 3; j++){
	            		if( i < len ){
	            			char hexa = Character.toLowerCase(str.charAt(i++));
	            			if( (hexa >= '0' && hexa <= '9') || (hexa >= 'a' && hexa <= 'f')){
	            				unicode = unicode + hexa;
	            			}
	            		}
	            	}
	            	buf.append((char)Integer.parseInt(unicode,16));
	            	break;
				}
			}
			else {
				buf.append(c);
			}
		}
		return buf.toString();
	}
	
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
