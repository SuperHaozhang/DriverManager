package com.cheer.pojo;

public class Xueyuan {
    private int id;
    private String name;
    private String pwd;
    private int yes;
    private int no;
    private int nul;
    private int result;

    public Xueyuan() {
    }

    public Xueyuan(int id, String name, String pwd, int yes, int no, int nul, int result) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.yes = yes;
        this.no = no;
        this.nul = nul;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getYes() {
        return yes;
    }

    public void setYes(int yes) {
        this.yes = yes;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNul() {
        return nul;
    }

    public void setNul(int nul) {
        this.nul = nul;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Xueyuan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", yes=" + yes +
                ", no=" + no +
                ", nul=" + nul +
                ", result=" + result +
                '}';
    }
}
