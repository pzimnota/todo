# ToDo Console Application

A simple console-based ToDo application written in Java.
## Table of Contents
- [Features](#features)
- [Dependencies](#dependencies)
- [How to Run](#how-to-run)
- [Usage](#usage)
- [Project Structure](#project-structure)


## Features

- Add tasks with optional deadlines
- Remove tasks by index
- List all tasks with their status and deadlines
- Mark tasks as done
- Set or update deadlines for tasks
- Automatically saves and loads tasks from a `.json` file

## Dependencies

This project uses the following dependencies (via Maven):

- **Jackson Databind** — for reading and writing JSON files
- **Jackson JSR310 Module** — for handling Java 8 date/time types like `LocalDate`

### Maven Configuration

Make sure to include the following in your `pom.xml`:

   ```xml
<dependencies>
    <!-- Jackson Databind -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.17.0</version>
    </dependency>

    <!-- Jackson Module for Java 8 Date/Time (e.g., LocalDate) -->
    <dependency>
        <groupId>com.fasterxml.jackson.datatype</groupId>
        <artifactId>jackson-datatype-jsr310</artifactId>
        <version>2.17.0</version>
    </dependency>
</dependencies>
   ```
## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/pzimnota/todo.git

2. Open the project in your favorite IDE (e.g., IntelliJ IDEA).

3. Build and run the Main class located in org.example.

## Usage
When you run the program, you will be presented with a simple menu to manage your tasks.

Follow the on-screen instructions to:

- Add a new task
- Mark a task as done
- Set or update a deadline
- Remove a task
- List all tasks

Tasks are automatically saved to a tasks.json file in the working directory.

## Project Structure
Main.java — Entry point of the application

ConsoleUI.java — Handles user input and interaction

TaskManager.java — Manages the list of tasks

Task.java — Represents a task object with properties like name, deadline, and status

TaskStorage.java — Responsible for saving/loading tasks from a JSON file
