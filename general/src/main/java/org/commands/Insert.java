package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

public class Insert extends Command {

    Insert() {
        super(CommandsType.INSERT, "Вставляет объект Product в коллекцию. Поля объекта вводится по отдельности в каждой строке.", true);
    }

    @Override
    public Message execute(Message msg) {
        CollectionHandler.insertProduct((Product)msg.getArgs()[0]);
        return new Message();
    }
}
