package org.example;


public class HomeCommands extends Commands{


    public HomeCommands()  {
        super(new String[]{"Books available", "Loan", "Reports", "Quit"}, "home");
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
        }
        else if (userInput == 3) {
            printMessage("Reports");
        }else {
            setNextCommands("");
        }

    }
}
