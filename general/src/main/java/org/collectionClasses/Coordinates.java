package org.collectionClasses;

import lombok.Data;

import java.io.Serializable;

@Data
public class Coordinates implements Serializable {
    private int x;
    private double y;
}
