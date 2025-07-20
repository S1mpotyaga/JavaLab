package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

import java.util.SortedSet;

public class MaxByCoordinates extends Command {

    MaxByCoordinates() {
        super(CommandsType.MAX_BY_COORDINATES, "Выводит на экран элемент коллекции, значение поля coordinates которого максимально.", true);
    }

    @Override
    public Message execute(Message msg) {
        SortedSet<Product> collection = CollectionHandler.getCollection();
        Product mx = null;
        for (Product current: collection){
            if ((mx == null) || (current.getCoordinates().compareTo(mx.getCoordinates()) > 0)){
                mx = current;
            }
        }
        Message result = new Message();
        result.setArgs(new Object[]{mx});
        return result;
    }
}