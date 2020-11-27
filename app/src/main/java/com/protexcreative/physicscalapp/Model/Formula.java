package com.protexcreative.physicscalapp.Model;

import java.util.HashMap;

public class Formula {
    private String fid;
    private String name;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Formula(HashMap<String, String> hashMap){
        this.fid = hashMap.get("fid");
        this.name = hashMap.get("name");
    }

}
