package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

import java.util.SortedSet;

public class PrintFieldAscendingPrice extends Command{

    PrintFieldAscendingPrice(){
        super(CommandsType.PRINT_FIELD_ASCENDING_PRICE, "Выводит на экран значения price всех элементов в порядке возрастания.", true);
    }

    @Override
    public Message execute(Message msg){
        SortedSet<Product> collection = CollectionHandler.getCollection();
        for (Product current: collection){
            System.out.println(current.getId() + ":" + current.getPrice());
        }
        return new Message();
    }
}
