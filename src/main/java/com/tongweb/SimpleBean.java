package com.tongweb;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A Simple Java Bean 
 */
public class SimpleBean implements Serializable {
	
    private static final long serialVersionUID = 3106794440626457441L;
    
    private long number1;
	private long number2;
	private long number3;
	private long number4;
	private long number5;
	private long number6;
	
	private String value1 = null;
	private String value2 = null;
	private String value3 = null;
	private String value4 = null;
	private String value5 = null;
	private String value6 = null;
    
    private HashMap<String, String> datas = new HashMap<String, String>();

	public SimpleBean() {
	    number1 = 111111;
	    number2 = 222222;
	    number3 = 333333;
	    number4 = 444444;
	    number5 = 444555;
	    number6 = 666666;
	    
	    value1 = "string value 1";
	    value2 = "string value 2";
	    value3 = "string value 3";
	    value4 = "string value 4";
	    value5 = "string value 5";
	    value6 = "string value 6";
	    
        for (int i = 0; i < 10; i++) {
            this.datas.put("attribute " + i, "values" + i);
        }
	}

    public long getNumber1() {
        return number1;
    }

    public void setNumber1(long number1) {
        this.number1 = number1;
    }

    public long getNumber2() {
        return number2;
    }

    public void setNumber2(long number2) {
        this.number2 = number2;
    }

    public long getNumber3() {
        return number3;
    }

    public void setNumber3(long number3) {
        this.number3 = number3;
    }

    public long getNumber4() {
        return number4;
    }

    public void setNumber4(long number4) {
        this.number4 = number4;
    }

    public long getNumber5() {
        return number5;
    }

    public void setNumber5(long number5) {
        this.number5 = number5;
    }

    public long getNumber6() {
        return number6;
    }

    public void setNumber6(long number6) {
        this.number6 = number6;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

    public HashMap<String, String> getDatas() {
        return datas;
    }

    public void setDatas(HashMap<String, String> datas) {
        this.datas = datas;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SimpleBean:\n")
                .append(" [number1:" + number1 + "]\n") 
                .append(" [number2:" + number2 + "]\n")
                .append(" [number3:" + number3 + "]\n")
                .append(" [number4:" + number4 + "]\n")
                .append(" [number5:" + number5 + "]\n")
                .append(" [number6:" + number6 + "]\n")
                .append(" [value1:" + value1 + "]\n")
                .append(" [value2:" + value2 + "]\n")
                .append(" [value3:" + value3 + "]\n")
                .append(" [value4:" + value4 + "]\n")
                .append(" [value5:" + value5 + "]\n")
                .append(" [value6:" + value6 + "]\n");
        
        Iterator<Map.Entry<String, String>> entryIte = datas.entrySet().iterator();
        while (entryIte.hasNext()) {
            Map.Entry<String, String> entry = entryIte.next();
            builder.append(" [" + entry.getKey() + ":" + entry.getValue() + "]\n");
        }
        
        return builder.toString();
    }

    public void print(PrintStream out) {
        out.print(toString());
    }
    
    public void print() {
        print(System.out);
    }
}
