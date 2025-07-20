package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

import java.util.Iterator;

public class RemoveKey extends Command {

    RemoveKey() {
        super(CommandsType.REMOVE_KEY, "Удаляет элемент коллекции по его id.", true);
    }

    @Override
    public Message execute(Message msg) {
        int id = (Integer) msg.getArgs()[0];
        Iterator<Product> it = CollectionHandler.getCollection().iterator();
        while (it.hasNext()){
            Product cur = it.next();
            if (cur.getId() == id){
                it.remove();
                break;
            }
        }
        return new Message();
    }
}
