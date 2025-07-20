package org.commands;

import org.Message;

public class Help extends Command{

    Help() {
        super(CommandsType.HELP, "Выводит все команды приложения.", true);
    }

    @Override
    public Message execute(Message msg) {
        CommandHandler.printCommands();
        return new Message();
    }
}
