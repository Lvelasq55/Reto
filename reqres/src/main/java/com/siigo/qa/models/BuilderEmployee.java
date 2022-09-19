package com.siigo.qa.models;

public class BuilderEmployee {

    private String name;
    private String job;

    public BuilderEmployee() {
        this.name = "";
        this.job = "";
    }

    public static BuilderEmployee with() {
        return new BuilderEmployee();
    }

    public BuilderEmployee name(String nameUser) {
        this.name = nameUser;
        return this;
    }

    public BuilderEmployee job(String jobUser) {
        this.job = jobUser;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Employee build() {
        return new Employee(this);
    }
}
