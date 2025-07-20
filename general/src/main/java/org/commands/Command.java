package org.commands;

import lombok.Getter;
import lombok.ToString;
import org.Message;

@Getter
@ToString
public abstract class Command {

    private CommandsType commandsType;
    private String description;
    private boolean isOutput;

    Command(CommandsType commandsType, String description, boolean isOutput) {
        this.commandsType = commandsType;
        this.description = description;
        this.isOutput = isOutput;
    }

    abstract Message execute(Message msg);
}