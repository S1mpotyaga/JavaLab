package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Show extends Command{

    Show(){
        super(CommandsType.SHOW, "Выводит на экран все элементы коллекции.", true);
    }

    @Override
    public Message execute(Message msg){
        CollectionHandler.show();
        return new Message();
    }
}