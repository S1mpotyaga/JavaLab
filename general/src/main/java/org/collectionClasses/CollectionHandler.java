package org.collectionClasses;

import java.util.SortedSet;
import lombok.Getter;

@Getter
public class CollectionHandler {

    private static CollectionHandler collectionHandler;
    private static SortedSet<Product> collection;

    private CollectionHandler(){

    }

    public static CollectionHandler getInstance(){
        if (collectionHandler == null){
            collectionHandler = new CollectionHandler();
        }
        return collectionHandler;
    }
}