package com.qapitol.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qapitol.model.Books;
import com.qapitol.model.Student;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonUtilityBOOK {

    static File file;
    static ObjectMapper mapper;

    public static void writeDataFromJsonFile(List<Books> bookDetails ) throws IOException {

        File file1 = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\Book_Management\\src\\test\\java\\com\\qapitol\\utils\\Book.json");

        // Create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
      //  mapper.writeValue(file1,studentDetails );
        mapper.writerWithDefaultPrettyPrinter().writeValue(file1,bookDetails);


    }
    public static List<Books> readDataFromJsonFile() throws IOException {


        /*READ THE DATA FROM JSON FILE */
        File file2 = new File("C:\\Users\\Qapitol QA\\IdeaProjects\\Book_Management\\src\\test\\java\\com\\qapitol\\utils\\Book.json");

        // Create ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        List<Books> data = mapper.readValue(file2, new TypeReference<List<Books>>() {});
        return data;


    }
}
