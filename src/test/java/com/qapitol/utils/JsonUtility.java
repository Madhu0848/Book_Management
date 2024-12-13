package com.qapitol.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qapitol.model.Student;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonUtility {

    static File file;
    static ObjectMapper mapper;

    public static void writeDataFromJsonFile(List<Student> studentDetails ) throws IOException {

        File file1 = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\Book_Management\\src\\test\\java\\com\\qapitol\\utils\\Student.json");

        // Create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
      //  mapper.writeValue(file1,studentDetails );
        mapper.writerWithDefaultPrettyPrinter().writeValue(file1,studentDetails);
    }

    public static List<Student> readDataFromJsonFile() throws IOException {

        /*READ THE DATA FROM JSON FILE */
        File file2 = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\Book_Management\\src\\test\\java\\com\\qapitol\\utils\\Student.json");

        // Create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        List<Student> data = mapper.readValue(file2, new TypeReference<List<Student>>() {});
        return data;


    }
}
