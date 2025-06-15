package org.example;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class TaskStorage {

    private final ObjectMapper mapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public void saveTasks(List<Task> tasks, String filepath) throws IOException {
        mapper.writeValue(new File(filepath), tasks);
    }

    public List<Task> loadTasks(String filepath) throws IOException {
        File file = new File(filepath);
        if (!file.exists()){
            System.out.println("File does not exist- empty list returned");
            return List.of();
        }
        return mapper.readValue(file,
                new TypeReference<>() {});
    }
}
