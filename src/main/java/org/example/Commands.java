package org.example;

import java.util.Scanner;

public abstract class Commands {
    private final Scanner scanner = new Scanner(System.in);
    private String[] commands;
    private String nextCommands;
    public Commands(String[] commands, String nextCommands) {
        this.commands = commands;
        this.nextCommands = nextCommands;
    }
    abstract public void run() throws Exception;

    public String getNextCommands() {
        return nextCommands;
    }

    public void setNextCommands(String nextCommands) {
        this.nextCommands = nextCommands;
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printGreeting(String message){
        System.out.println("Welcome to " + message);
    }

    public void printCommands(){
        for (int i = 0; i < commands.length; i++) {
            printMessage((i + 1) + ": " + commands[i]);
        }
    }

    public int getCommandInput(){
        boolean isActive = true;
        int input = 0;
        while (isActive){
            printMessage("Enter a number: ");
            int userInput = scanner.nextInt();
            if(userInput > 0 && userInput <= commands.length){
                isActive = false;
                input = userInput;
            }else {
                printMessage("Error, please try again.");
            }
        }
        scanner.nextLine();
        return input;
    }
}
