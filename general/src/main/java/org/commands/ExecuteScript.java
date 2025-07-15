package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;

public class ExecuteScript extends Command{

    ExecuteScript(CollectionHandler collectionHandler, CommandsType executeScript, String s, boolean b){
        super(collectionHandler, CommandsType.EXECUTE_SCRIPT, "Выполняет команды из файлы.", true);
    }

    @Override
    public Message execute(Message msg){
        return null;
    }
}
