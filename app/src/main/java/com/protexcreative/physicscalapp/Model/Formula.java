package com.protexcreative.physicscalapp.Model;

public class Formula {
    private String fid;
    private String fname;
    private String fcat;
    private String fdesc;
    private String fimg;
    private Boolean isFav;
    private Boolean isNew;

    public Formula(String fid, String fcat, String fname,  String fdesc, String fimg, Boolean isFav, Boolean isNew) {
        this.fid = fid;
        this.fname = fname;
        this.fcat = fcat;
        this.fdesc = fdesc;
        this.fimg = fimg;
        this.isFav = isFav;
        this.isNew = isNew;
    }

    public Formula() {
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFcat() {
        return fcat;
    }

    public void setFcat(String fcat) {
        this.fcat = fcat;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc;
    }

    public String getFimg() {
        return fimg;
    }

    public void setFimg(String fimg) {
        this.fimg = fimg;
    }

    public Boolean getFav() {
        return isFav;
    }

    public void setFav(Boolean fav) {
        isFav = fav;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Formula{" +
                "fid='" + fid + '\'' +
                ", fcat='" + fcat + '\'' +
                ", fname='" + fname + '\'' +
                ", fdesc='" + fdesc + '\'' +
                ", fimg='" + fimg + '\'' +
                ", isFav=" + isFav +
                ", isNew=" + isNew +
                '}';
    }
}
