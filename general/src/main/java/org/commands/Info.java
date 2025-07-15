package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Info extends Command{

    Info(CollectionHandler collectionHandler, CommandsType info, String s, boolean b){
        super(collectionHandler, CommandsType.INFO, "Выводит информацию о коллекции: дату создания, количество элементов, тип коллекции.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
