package com.example.RestAPIStartwithJAVA.Controller;

public class Course {
    private String name;
    private int chepterCount;

    public Course(String name, int chepterCount) {
        this.name = name;
        this.chepterCount = chepterCount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChepterCount() {
        return chepterCount;
    }

    public void setChepterCount(int chepterCount) {
        this.chepterCount = chepterCount;
    }
}
