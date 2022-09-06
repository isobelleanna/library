package org.example;


import org.json.CDL;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.csv.*;

public class Main {
    public static void main(String[] args) throws Exception{
        File input = new File("books_data.csv");
        try {
            CsvSchema csv = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();
            MappingIterator<Map<?, ?>> mappingIterator =  csvMapper.reader().forType(Map.class).with(csv).readValues(input);
            List<Map<?, ?>> list = mappingIterator.readAll();
            System.out.println(list);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Paths.get("books.json").toFile(), list);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


//        CreateUser createUser = new CreateUser();
//        Commands currentCommands = createUser;
//        boolean isLoopActive = true;
//        while(isLoopActive){
//            if ("create".equals(currentCommands.getNextCommands())) {
//                currentCommands = new CreateUser();
//                currentCommands.run();
//            }
//            else if ("home".equals(currentCommands.getNextCommands())) {
//                currentCommands = new HomeCommands();
//                currentCommands.run();
//            } else {
//                isLoopActive = false;
//            }
//        }}


    }

