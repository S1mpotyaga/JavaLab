package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class ReplaceIfGreater extends Command{

    ReplaceIfGreater(CollectionHandler collectionHandler, CommandsType replaceIfGreater, String s, boolean b){
        super(collectionHandler, CommandsType.REPLACE_IF_GREATER, "Заменяет значение элемента по id, если новое значение коллекции больше старого.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
