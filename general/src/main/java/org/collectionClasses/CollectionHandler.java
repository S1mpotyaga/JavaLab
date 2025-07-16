package org.collectionClasses;

import java.util.SortedSet;
import lombok.Getter;

@Getter
public class CollectionHandler {

    private static CollectionHandler collectionHandler;
    private static SortedSet<Product> collection;

    private CollectionHandler(){
        collection = CSVFile.readCSV();
    }

    public static CollectionHandler getInstance(){
        if (collectionHandler == null){
            collectionHandler = new CollectionHandler();
        }
        return collectionHandler;
    }

    public static String[][] convertToCSV() throws IllegalAccessException{
        String[][] result = new String[collection.size()][];
        int ind = 0;
        for (Product current: collection){
            result[ind++] = current.toCSVString().split("\\.");
        }
        return result;
    }
}