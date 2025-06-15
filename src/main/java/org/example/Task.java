package org.example;

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate whenAdded;
    private boolean done;
    private LocalDate deadline;

    public  Task() {}

    public Task(String name, LocalDate deadline){
    this.name = name;
    this.deadline = deadline;
    this.whenAdded = LocalDate.now();
    this.done = false;
    }

    public Task(String name){
        this.name = name;
        this.whenAdded = LocalDate.now();
        this.done = false;
    }

    public String getName() {
        return name;
    }

    public LocalDate getWhenAdded() {
        return whenAdded;
    }

    public boolean isDone() {
        return done;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline){
        this.deadline = deadline;
    }

    public void markAsDone() {
        this.done = true;
        System.out.println("Task "+getName()+" has been completed");
    }

}

