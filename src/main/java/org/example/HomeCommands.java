package org.example;


public class HomeCommands extends Commands{
    public HomeCommands()  {
        super(new String[]{"Books available", "Loan", "Quit"}, "home");
    }

    @Override
    public void run()  {
        printGreeting("the library");
        printCommands();
        int userInput = getCommandInput();
        if(userInput == 1){
           printMessage("books available");
        } else if (userInput == 2) {
            printMessage("Loan");
        } else {
            setNextCommands("");
        }

    }
}
