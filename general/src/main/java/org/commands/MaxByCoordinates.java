package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class MaxByCoordinates extends Command {

    MaxByCoordinates(CollectionHandler collectionHandler, CommandsType maxByCoordinates, String s, boolean b) {
        super(collectionHandler, CommandsType.MAX_BY_COORDINATES, "Выводит на экран элемент коллекции, значение поля coordinates которого максимально.", true);
    }

    @Override
    public Message execute(Message msg) {
        return null;
    }
}
