package org.commands;

import lombok.Getter;
import org.Message;
import org.collectionClasses.CollectionHandler;

@Getter
public abstract class Command {

    private CollectionHandler collectionHandler;
    private CommandsType commandsType;
    private String description;
    private boolean isOutput;

    Command(CollectionHandler collectionHandler, CommandsType commandsType, String description, boolean isOutput) {
        this.collectionHandler = collectionHandler;
        this.commandsType = commandsType;
        this.description = description;
        this.isOutput = isOutput;
    }

    abstract Message execute(Message msg);
}