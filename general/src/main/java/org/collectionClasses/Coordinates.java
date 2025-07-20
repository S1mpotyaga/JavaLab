package org.collectionClasses;

import lombok.Data;

import java.io.Serializable;

import static java.lang.Math.sqrt;

@Data
public class Coordinates implements Serializable, Comparable, CSVConvert {
    private int x;
    private double y;

    private double distFromStart() {
        return sqrt(x * x + y * y);
    }

    @Override
    public int compareTo(Object o) {
        Coordinates other = (Coordinates) o;
        double res = (this.distFromStart() - other.distFromStart());
        if (res < 0) {
            return -1;
        } else if (res == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toCSVString(){
        return ((Integer)this.getX()).toString() + "." + ((Double)this.getY()).toString();
    }
}
