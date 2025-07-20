package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Info extends Command{

    Info(){
        super(CommandsType.INFO, "Выводит информацию о коллекции: дату создания, количество элементов, тип коллекции.", true);
    }

    @Override
    public Message execute(Message msg){
        CollectionHandler.info();
        return new Message();
    }
}
