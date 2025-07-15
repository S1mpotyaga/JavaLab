package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Clear extends Command{

    Clear(CollectionHandler collectionHandler, CommandsType clear, String s, boolean b){
        super(collectionHandler, CommandsType.CLEAR, "Удаляет все элементы коллекции.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
