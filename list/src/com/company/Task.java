package com.company;

import java.util.Date;

public class Task {
    private String name;
    private Date deadline;
    private String employee;

    public Task(String name){
        this.name = name;
    }

    public Task(){
        this.name = "New Task";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void display(){

    }
}
