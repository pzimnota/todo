package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> taskList = new ArrayList<>();

    public void addTask(Task task){
        taskList.add(task);
    }

    public void removeTask(Task task){
        taskList.remove(task);
    }

    public void listTasks(){
        int i=1;
        for (Task task : taskList){
            System.out.println(i+". Task: "+task.getName()+" |Status: "+(task.isDone()?"Done":"Pending")+
                    " |Added "+task.getWhenAdded() + (task.getDeadline()!=null ? "|Deadline:" + task.getDeadline() : ""));
            i++;
        }
    }

    public void removeTaskByIndex(int index){
        if(index > 0 && index <= taskList.size()){
            taskList.remove(index - 1);
        }
        else{
            System.out.println("Invalid index");
        }
    }

    public Task getTaskbyIndex(int index){
        if (index > 0 && index <= taskList.size()){
            return taskList.get(index-1);
        }
        System.out.println("Invalid index");
        return null;
    }
}
