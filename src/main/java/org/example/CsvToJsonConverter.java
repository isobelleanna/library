package org.example;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.csv.*;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class CsvToJsonConverter {

   public void run() throws Exception{
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
}
