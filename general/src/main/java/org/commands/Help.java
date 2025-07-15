package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Help extends Command{

    Help(CollectionHandler collectionHandler, CommandsType help, String s, boolean b) {
        super(collectionHandler, CommandsType.HELP, "Выводит все команды приложения.", true);
    }

    @Override
    public Message execute(Message msg) {
        return null;
    }
}
