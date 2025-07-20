package org.commands;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class CommandHandler {

    private static CommandHandler commandHandler;
    private static ArrayList<Command> commands = new ArrayList<>();

    private CommandHandler() {
        commands.add(new Clear());
        commands.add(new ExecuteScript());
        commands.add(new Exit());
        commands.add(new Help());
        commands.add(new Info());
        commands.add(new Insert());
        commands.add(new MaxByCoordinates());
        commands.add(new MinByManufacturer());
        commands.add(new PrintFieldAscendingPrice());
        commands.add(new RemoveGreaterKey());
        commands.add(new RemoveKey());
        commands.add(new ReplaceIfGreater());
        commands.add(new ReplaceIfLower());
        commands.add(new Save());
        commands.add(new Show());
        commands.add(new Update());
    }

    public CommandHandler getInstance(){
        if (commandHandler == null){
            commandHandler = new CommandHandler();
        }
        return commandHandler;
    }

    public void callCommand(){
    }

    public static void printCommands(){
        for (Command current: commands){
            if (current.isOutput()){
                System.out.println(current.toString());
            }
        }
    }
}
