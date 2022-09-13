package org.example;

public class Main {
    public static void main(String[] args) throws Exception {


        CreateUser createUser = new CreateUser();
        Commands currentCommands = createUser;
        boolean isLoopActive = true;
        while (isLoopActive) {
            if ("create".equals(currentCommands.getNextCommands())) {
                currentCommands = new CreateUser();
                currentCommands.run();
            } else if ("home".equals(currentCommands.getNextCommands())) {
                currentCommands = new HomeCommands();
                currentCommands.run();
            } else if ("admin".equals(currentCommands.getNextCommands())) {
                currentCommands = new AdminCommands();
                currentCommands.run();
            }else {
                isLoopActive = false;
            }
        }
    }
}




