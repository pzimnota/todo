package org.example;

import java.time.LocalDate;

public class Task {
    private final String name;
    private final LocalDate whenAdded = LocalDate.now();
    private boolean done = false;

    private LocalDate deadline;

    public Task(String name, LocalDate deadline){
    this.name = name;
    this.deadline = deadline;
    }

    public Task(String name){
        this.name = name;
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

    public void markAsDone() {
        this.done = true;
        System.out.println("Task "+getName()+" has been completed");
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

}

