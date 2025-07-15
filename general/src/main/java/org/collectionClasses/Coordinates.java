package org.collectionClasses;

import lombok.Data;

import java.io.Serializable;

@Data
class Coordinates implements Serializable {
    private int x;
    private double y;
}
