package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);
    private final TaskManager taskManager = new TaskManager();

    private static void setDeadline(Task task, Scanner scanner) {
        try {
            System.out.println("Enter the deadline (format: YYYY-MM-DD)");
            String deadlineInput = scanner.nextLine();
            LocalDate deadline = LocalDate.parse(deadlineInput);
            task.setDeadline(deadline);
        } catch (Exception e) {
            System.out.println("Incorrect date format!");
        }
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Select the number with the appropriate option");
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. Show all tasks");
            System.out.println("4. Set task as complete");
            System.out.println("5. Set a deadline for the task");
            System.out.println("0. Quit");
            System.out.println();
            String option = scanner.nextLine();
            switch (option) {
                case "1":

                    System.out.println("Enter a name for the task");
                    String name = scanner.nextLine();
                    Task task = new Task(name);
                    taskManager.addTask(task);

                    System.out.println("Would you like to add a deadline? Y/N");
                    option = scanner.nextLine();

                    if (option.equalsIgnoreCase("Y")) {
                        setDeadline(task, scanner);
                    }
                    break;

                case "2":
                    System.out.println("Which task do you want to delete");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    task = taskManager.getTaskbyIndex(index);
                    if (task != null) {
                        taskManager.removeTaskByIndex(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "3":
                    taskManager.listTasks();
                    break;

                case "4":
                    System.out.println("Which task would you like to mark as done?");
                    int indexDone = scanner.nextInt();
                    scanner.nextLine();
                    task = taskManager.getTaskbyIndex(indexDone);
                    if (task != null) {
                        task.markAsDone();
                    }

                    break;

                case "5":
                    System.out.println("Which task do you want to add a deadline to?");
                    int indexDeadline = scanner.nextInt();
                    scanner.nextLine();
                    task = taskManager.getTaskbyIndex(indexDeadline);
                    if (task != null) {
                        setDeadline(task, scanner);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case "0":
                    System.out.println("See you later!");
                    return;
            }
        }

    }
}
