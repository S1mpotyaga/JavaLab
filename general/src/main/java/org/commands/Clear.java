package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Clear extends Command{

    Clear(){
        super(CommandsType.CLEAR, "Удаляет все элементы коллекции.", true);
    }

    @Override
    public Message execute(Message msg){
        CollectionHandler.clear();
        return new Message();
    }
}
