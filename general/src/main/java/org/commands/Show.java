package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Show extends Command{

    Show(CollectionHandler collectionHandler, CommandsType show, String s, boolean b){
        super(collectionHandler, CommandsType.SHOW, "Выводит на экран все элементы коллекции.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}