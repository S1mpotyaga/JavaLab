package org.commands;

import org.Message;
import org.collectionClasses.CSVFile;

import java.io.IOException;

public class Save extends Command {

    Save(){
        super(CommandsType.SAVE, "Сохраняет коллекцию в файл csv.", true);
    }

    @Override
    public Message execute(Message msg){
        Message result = new Message();
        try {
            CSVFile.writeCSV((String) msg.getArgs()[0]);
        } catch (IOException e) {
            result.setCommand(CommandsType.ERROR);
            result.setArgs(new Object[]{e});
        }
        return result;
    }
}
