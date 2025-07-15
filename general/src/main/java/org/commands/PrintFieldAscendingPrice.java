package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class PrintFieldAscendingPrice extends Command{

    PrintFieldAscendingPrice(CollectionHandler collectionHandler, CommandsType printFieldAscendingPrice, String s, boolean b){
        super(collectionHandler, CommandsType.PRINT_FIELD_ASCENDING_PRICE, "Выводит на экран значения price всех элементов в порядке возрастания.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
