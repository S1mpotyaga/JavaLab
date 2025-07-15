package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class Insert extends Command {

    Insert(CollectionHandler collectionHandler, CommandsType insert, String s, boolean b) {
        super(collectionHandler, CommandsType.INSERT, "Вставляет объект Product в коллекцию. Поля объекта вводится по отдельности в каждой строке.", true);
    }

    @Override
    public Message execute(Message msg) {
        return null;
    }
}
