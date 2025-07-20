package org;

import lombok.Data;
import org.commands.CommandsType;

@Data
public class Message {

    private CommandsType command;
    private Object[] args;

    public Message(){
        command = CommandsType.ALL_DONE;
    }
}