package org.example;

public class AdminCommands extends Commands{
    public AdminCommands()  {
        super(new String[]{"Reports", "Quit"}, "admin");
    }


    @Override
    public void run() throws Exception {
        printGreeting("the library");
        printCommands();
        int userInput = getCommandInput();
        if(userInput == 1){
            runReport();
            setNextCommands("home");
        }
    }

    public void runReport() throws Exception {
        CsvToJsonConverter csvToJsonConverter = new CsvToJsonConverter();
        csvToJsonConverter.run();
    }
}
