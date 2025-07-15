package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class RemoveGreaterKey extends Command{

    RemoveGreaterKey(CollectionHandler collectionHandler, CommandsType removeGreaterKey, String s, boolean b){
        super(collectionHandler, CommandsType.REMOVE_GREATER_KEY, "Удалаяет все элементы коллекции, которые больше введенного.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
