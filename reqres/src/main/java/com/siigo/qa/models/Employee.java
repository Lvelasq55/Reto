package com.siigo.qa.models;

public class Employee {

    private String name;
    private String job;

    public Employee(BuilderEmployee information) {
        this.name = information.getName();
        this.job = information.getJob();
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}

