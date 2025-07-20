package org.commands;

import org.exceptions.NotFoundEnum;

public enum CommandsType {
    HELP("help"),
    INFO("info"),
    SHOW("show"),
    INSERT("insert"),
    UPDATE_ID("update_id"),
    REMOVE_KEY("remove_key"),
    CLEAR("clear"),
    SAVE("save"),
    EXECUTE_SCRIPT("execute_script"),
    EXIT("exit"),
    REPLACE_IF_GREATER("replace_if_greater"),
    REPLACE_IF_LOWER("replace_if_lower"),
    REMOVE_GREATER_KEY("remove_greater_key"),
    MIN_BY_MANUFACTURER("min_by_manufacturer"),
    MAX_BY_COORDINATES("max_by_coordinates"),
    PRINT_FIELD_ASCENDING_PRICE("print_field_ascending_price"),

    ALL_DONE("all_done"),
    ERROR("error");

    private String text;

    CommandsType(String text){
        this.text = text;
    }

    public static CommandsType fromString(String current) throws NotFoundEnum{
        for (CommandsType tmp: CommandsType.values()){
            if (tmp.toString().equals(current)){
                return tmp;
            }
        }
        throw new NotFoundEnum("Not found commands.");
    }

    @Override
    public String toString(){
        return this.text;
    }
}
