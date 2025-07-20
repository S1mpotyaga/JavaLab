package org.commands;

import org.Message;

public class Exit extends Command{

    Exit(){
        super(CommandsType.EXIT, "Завершает выполнение программы.", true);
    }

    @Override
    public Message execute(Message msg){
        System.exit(0);
        return new Message();
    }
}
