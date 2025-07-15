package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class ReplaceIfLower extends Command{

    ReplaceIfLower(CollectionHandler collectionHandler, CommandsType replaceIfLower, String s, boolean b){
        super(collectionHandler, CommandsType.REPLACE_IF_LOWER, "Заменяет значение по id, если новое значение больше старого.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
