package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class MinByManufacturer extends Command{

    MinByManufacturer(CollectionHandler collectionHandler, CommandsType minByManufacturer, String s, boolean b){
        super(collectionHandler, CommandsType.MIN_BY_MANUFACTURER, "Выводит на экран элемент коллекции, значение поля manufacturer которого минимально.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
