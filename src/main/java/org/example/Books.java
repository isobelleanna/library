package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Books{
    public Books() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("books_data.csv"));
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
