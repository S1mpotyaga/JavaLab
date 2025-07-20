package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

import java.util.Iterator;

public class ReplaceIfLower extends Command{

    ReplaceIfLower(){
        super(CommandsType.REPLACE_IF_LOWER, "Заменяет значение по id, если новое значение больше старого.", true);
    }

    @Override
    public Message execute(Message msg){
        Product arg = (Product) msg.getArgs()[0];
        Iterator<Product> it = CollectionHandler.getCollection().iterator();
        while (it.hasNext()) {
            Product cur = it.next();
            if (cur.getId().equals(arg.getId()) && cur.compareTo(arg) > 0){
                it.remove();
                CollectionHandler.getCollection().add(arg);
                break;
            }
        }
        return new Message();
    }
}
