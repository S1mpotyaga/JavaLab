package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Save extends Command {

    Save(CollectionHandler collectionHandler, CommandsType save, String s, boolean b){
        super(collectionHandler, CommandsType.SAVE, "Сохраняет коллекцию в файл xml или txt.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
