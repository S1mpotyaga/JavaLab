package org.collectionClasses;

import lombok.Getter;
import lombok.Setter;
import org.Message;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.SortedSet;

public class CollectionHandler {

    @Getter
    private static SortedSet<Product> collection;
    private static java.time.LocalDateTime creationDate;
    @Setter
    private static String path;

    public static void getInstance() {
        if (collection == null) {
            try {
                collection = CSVFile.readCSV(path);
                creationDate = LocalDateTime.now();
            } catch (IOException e) {
                System.err.println("Error reading csv file.");
            }
        }
    }

    public static String[][] convertToCSV() throws IllegalAccessException {
        String[][] result = new String[collection.size()][];
        int ind = 0;
        for (Product current : collection) {
            result[ind++] = current.toCSVString().split("\\.");
        }
        return result;
    }

    public static void show() {
        for (Product current : collection) {
            System.out.println(current.toString());
        }
    }

    public static void clear(){
        collection.clear();
    }

    public static void info(){
        System.out.println("Collection creation date: " + creationDate);
        System.out.println("Collection type: " + collection.getClass().toString());
        System.out.println("Count elements in collection: " + collection.size());
    }

    public static void insertProduct(Product pr){
        collection.add(pr);
    }

    public static boolean updateId(Product arg) throws Exception{
        boolean result = false;
        Iterator<Product> it = CollectionHandler.getCollection().iterator();
        while (it.hasNext()) {
            Product cur = it.next();
            if (cur.getId().equals(arg.getId())) {
                result = true;
                it.remove();
                insertProduct(arg);
                break;
            }
        }
        return result;
    }
}