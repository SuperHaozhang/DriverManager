package com.cheer.pojo;

public class Subject {
    private int id;
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String key;

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", key='" + key + '\'' +
                '}';
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getKey() {
        return key;
    }
}
