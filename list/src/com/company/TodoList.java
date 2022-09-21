package com.company;

import java.util.ArrayList;
import java.util.Date;

public class TodoList {
    private String topic;
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public TodoList(String topic) {
        this.topic = topic;
    }

    public void display(){
        for(Task task : tasks){
            System.out.println("Task " + tasks.indexOf(task) + ": " + task.getName());
        }
    }

    public void createTask(String name){
        tasks.add(new Task(name));
    }

    public void removeTask(String taskName){
        tasks.remove(findTask(taskName));
    }

    public void renameTask(String oldName, String newName){
        tasks.get(findTask(oldName)).setName(newName);
    }

    public void assignDeadline(String taskName, Date dueDate){
        tasks.get(findTask(taskName)).setDeadline(dueDate);
    }

    public void assignTask(String taskName, String employee){
        tasks.get(findTask(taskName)).setEmployee(employee);
    }

    public void markAsDone(String taskName){
        System.out.println("Task " + taskName + " is done.");
    }

    public int findTask(String name){
        for(Task task : tasks){
            if(task.getName().equals(name)){
                return tasks.indexOf(task);
            }
        }
        return -1;
    }

    public String getTopic() {
        return topic;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
