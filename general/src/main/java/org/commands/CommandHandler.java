package org.commands;

import lombok.Getter;
import org.collectionClasses.CollectionHandler;

import java.util.ArrayList;

@Getter
public class CommandHandler {

    private static CommandHandler commandHandler;
    private static ArrayList<Command> commands = new ArrayList<>();

    private CommandHandler() {
        CollectionHandler collectionHandler = CollectionHandler.getInstance();
        commands.add(new Clear(collectionHandler, CommandsType.CLEAR, "Очищает коллецию.", true));
        commands.add(new ExecuteScript(collectionHandler, CommandsType.EXECUTE_SCRIPT, "Выполняет команды из файла. Имя файла задается либо на этой же строке, либо на следующей.", true));
        commands.add(new Exit(collectionHandler, CommandsType.EXIT, "Завершает выполнение работы программы.", true));
        commands.add(new Help(collectionHandler, CommandsType.HELP, "Выводит информацию о доступных командах.", true));
        commands.add(new Info(collectionHandler, CommandsType.INFO, "Выводит информацию о коллекции: тип, дату создания, количество элементов.", true));
        commands.add(new Insert(collectionHandler, CommandsType.INSERT, "Добавляет элемент в коллекцию. Поля нового объекта вводятся по отдельности в каждой строке.", true));
        commands.add(new MaxByCoordinates(collectionHandler, CommandsType.MAX_BY_COORDINATES, "Выводит объект коллекции, который наиболее удален от начала координат.", true));
        commands.add(new MinByManufacturer(collectionHandler, CommandsType.MIN_BY_MANUFACTURER, "Выводит объект коллекии, значение organization минимально.", true));
        commands.add(new PrintFieldAscendingPrice(collectionHandler, CommandsType.PRINT_FIELD_ASCENDING_PRICE, "Выводит id элементов коллекции и значения их цен в отсортированном порядке.", true));
        commands.add(new RemoveGreaterKey(collectionHandler, CommandsType.REMOVE_GREATER_KEY, "Удаляет все элементы коллекции, больше заданного элемента X. Поля элемента X задаются по отдельности в каждой строке.", true));
        commands.add(new RemoveKey(collectionHandler, CommandsType.REMOVE_KEY, "Удаялет элемент коллекции по его id.", true));
        commands.add(new ReplaceIfGreater(collectionHandler, CommandsType.REPLACE_IF_GREATER, "Заменяет элемент коллекции, если значение нового больше старого.", true));
        commands.add(new ReplaceIfLower(collectionHandler, CommandsType.REPLACE_IF_LOWER, "Заменяет элемент коллекции, если новый элемент меньше старого.", true));
        commands.add(new Save(collectionHandler, CommandsType.SAVE,"Сохраняет элементы коллекции в csv файл.", true));
        commands.add(new Show(collectionHandler, CommandsType.SHOW, "Выводит все элементы коллекции.", true));
        commands.add(new Update(collectionHandler, CommandsType.UPDATE_ID, "Меняет значение элемента коллекции по id. Новые значения задаются по отдельности в новой строке.", true));
    }

    public CommandHandler getInstance(){
        if (commandHandler == null){
            commandHandler = new CommandHandler();
        }
        return commandHandler;
    }

    public void callCommand(){
    }
}
