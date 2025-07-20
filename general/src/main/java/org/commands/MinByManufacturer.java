package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

import java.util.SortedSet;

public class MinByManufacturer extends Command{

    MinByManufacturer(){
        super(CommandsType.MIN_BY_MANUFACTURER, "Выводит на экран элемент коллекции, значение поля manufacturer которого минимально.", true);
    }

    @Override
    public Message execute(Message msg){
        SortedSet<Product> collection = CollectionHandler.getCollection();
        Product mn = null;
        for (Product current: collection){
            if ((mn == null) || (current.getOrganization().compareTo(mn.getOrganization()) < 0)){
                mn = current;
            }
        }
        Message result = new Message();
        result.setArgs(new Object[]{mn});
        return result;
    }
}
