package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

import java.util.Iterator;

public class RemoveGreaterKey extends Command {

    RemoveGreaterKey() {
        super(CommandsType.REMOVE_GREATER_KEY, "Удалаяет все элементы коллекции, которые больше введенного.", true);
    }

    @Override
    public Message execute(Message msg) {
        Product arg = (Product) msg.getArgs()[0];
        Iterator<Product> it = CollectionHandler.getCollection().iterator();
        while (it.hasNext()) {
            Product tmp = it.next();
            if (arg.compareTo(arg) < 0) {
                it.remove();
            }
        }
        return new Message();
    }
}
