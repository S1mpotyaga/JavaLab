package org.collectionClasses.enums;

import org.exceptions.NotFoundEnum;

public enum UnitOfMeasure {
    KILOGRAMS("kilograms"),
    CENTIMETERS("centimeters"),
    SQUARE_METERS("square_meters"),
    PCS("pcs");

    private final String text;

    UnitOfMeasure(String text) {
        this.text = text;
    }

    public static UnitOfMeasure fromString(String current) throws NotFoundEnum {
        for (UnitOfMeasure tmp : UnitOfMeasure.values()) {
            if (tmp.toString().equals(current)) {
                return tmp;
            }
        }
        throw new NotFoundEnum("Not found unit of measure.");
    }

    @Override
    public String toString() {
        return this.text;
    }
}