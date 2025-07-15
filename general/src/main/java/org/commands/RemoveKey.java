package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class RemoveKey extends Command {

    RemoveKey(CollectionHandler collectionHandler, CommandsType removeKey, String s, boolean b){
        super(collectionHandler, CommandsType.REMOVE_KEY, "Удаляет элемент коллекции по его id.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
