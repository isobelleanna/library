package org.example;

import java.util.Objects;
import java.util.Scanner;

public class CreateUser extends Commands{
    User user;
    Scanner scanner = new Scanner(System.in);

    public CreateUser() {
        super( new String[]{"Yes", "No"}, "create");
    }

    @Override
    public void run() {
        printMessage("Are you a new user");
        printCommands();
        int userInput = getCommandInput();
        if (userInput == 1) {
            printMessage("What is your username?");
            String username = scanner.next();
            printMessage("What is your password?");
            String password = scanner.next();
            printMessage("Are you a Student? [y/n] ");
            String isStudent = scanner.next();
            if (Objects.equals(isStudent, "y")) {
                user = new User(username, UserStatus.STUDENT, password);
                printMessage(user + "");
                setNextCommands("home");
            } else {
                user = new User(username, UserStatus.ADMIN, password);
                printMessage(user + "");
                setNextCommands("admin");
            }


        } else {
            setNextCommands("home");
        }
    }

}
