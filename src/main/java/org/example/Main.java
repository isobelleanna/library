package org.example;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HomeCommands homeCommands = new HomeCommands();
        Commands currentCommands = homeCommands;
        boolean isLoopActive = true;
        while(isLoopActive){
            if ("home".equals(currentCommands.getNextCommands())) {
                currentCommands = new HomeCommands();
                currentCommands.run();
            } else {
                isLoopActive = false;
            }
        }
    }

}