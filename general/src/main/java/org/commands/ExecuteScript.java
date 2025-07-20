package org.commands;

import org.Message;

public class ExecuteScript extends Command{

    ExecuteScript(){
        super(CommandsType.EXECUTE_SCRIPT, "Выполняет команды из файлы.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
