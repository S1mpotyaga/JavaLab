package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Update extends Command {

    Update(CollectionHandler collectionHandler, CommandsType updateId, String s, boolean b){
        super(collectionHandler, CommandsType.UPDATE_ID, "Изменяет поля объекта, задаваемого его id.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}