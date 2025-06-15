package org.example;

import java.io.IOException;
import java.util.List;

public class Main {

    private static final String FILE_PATH = "tasks.json";
    private static final TaskStorage storage = new TaskStorage();
    private static final TaskManager manager = new TaskManager();

    public static void main(String[] args) {
        System.out.println("Welcome in console version of the ToDo");
        try{
            List<Task> loadedTasks = storage.loadTasks(FILE_PATH);
            loadedTasks.forEach(manager::addTask);
            System.out.println("Tasks loaded successfully");
        }
        catch (IOException e) {
            System.out.println("Could not load tasks" + e.getMessage());
        }



        ConsoleUI consoleUI = new ConsoleUI(manager, storage, FILE_PATH);
        consoleUI.start();
    }
}

