package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Exit extends Command{

    Exit(CollectionHandler collectionHandler, CommandsType exit, String s, boolean b){
        super(collectionHandler, CommandsType.EXIT, "Завершает выполнение программы.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
