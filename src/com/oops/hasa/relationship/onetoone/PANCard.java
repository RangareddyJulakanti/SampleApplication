package com.oops.hasa.relationship.onetoone;

public class PANCard {
    private String id;
    private String name;
    private String DOB;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return " PANID = "+getId()+" NAME= "+getName()+" DOB= "+getDOB();
    }
}
