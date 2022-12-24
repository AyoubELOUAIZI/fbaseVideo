package com.elouaizi.ayoub.fbasevideo;

public class MainModel {
    String name,surl,cours,email;

    public MainModel() {
    }

    public MainModel(String name, String surl, String cours, String email) {
        this.name = name;
        this.surl = surl;
        this.cours = cours;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String turl) {
        this.surl = turl;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
