package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<TodoList> todoLists = new ArrayList<>();

        boolean flag = false;
        while (!flag){
            int option = scanner.nextInt();
            scanner.nextLine();


            System.out.println("Choose: " +
                    "1 to create a Todo list" +
                    "2 to display the Todo lists" +
                    "3 to add a task to a Todolist" +
                    "4 to remove a task" +
                    "5 edit a task");

            switch (option){
                case 1: createTodoList(todoLists);
                case 2: display(todoLists);
                case 3:
                    System.out.println("Enter task name: ");
                    String task = scanner.nextLine();
                    System.out.println("Add " + task + " to which Todo list?");
                    int todoList = scanner.nextInt(); scanner.nextLine();
                    todoLists.get(todoList).createTask(task);
                case 4:
                    System.out.println("Which task do you want to be removed ?");
                    task = scanner.nextLine();
                    for (TodoList iterator : todoLists){
                        iterator.removeTask(task);
                    }
                case 5:
                    System.out.println("Which task do you want edited?");
                    task = scanner.nextLine();
                    Task taskEdit = null;
                    for (TodoList iterator : todoLists){
                        taskEdit = iterator.getTasks().get();
                    }
            }
        }


    }

    public static void createTodoList(ArrayList<TodoList> todoLists){
        String topic = scanner.nextLine();
        todoLists.add(new TodoList(topic));
    }

    public static void display(ArrayList<TodoList> todoLists){
        for (TodoList todoList : todoLists){
            System.out.println("Todolist " + todoLists.indexOf(todoList) + ": " + todoList.getTopic());
        }
    }

}
