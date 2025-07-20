package org.commands;

import org.Message;
import org.collectionClasses.CollectionHandler;
import org.collectionClasses.Product;

public class Update extends Command {

    Update() {
        super(CommandsType.UPDATE_ID, "Изменяет поля объекта, задаваемого его id.", true);
    }

    @Override
    public Message execute(Message msg) {
        Message result = new Message();
        try {
            boolean flag = CollectionHandler.updateId((Product) msg.getArgs()[0]);
            if (!flag) {
                result.setArgs(new Object[]{"Элемент с таким id не был найден."});
            }
        } catch (Exception e) {
            result.setCommand(CommandsType.ERROR);
            result.setArgs(new Object[]{e});
        }
        return result;
    }
}