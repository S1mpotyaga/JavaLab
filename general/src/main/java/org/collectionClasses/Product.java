package org.collectionClasses;

import lombok.Data;
import org.collectionClasses.enums.UnitOfMeasure;

import java.io.Serializable;
import java.lang.reflect.Field;

@Data
public class Product implements Serializable, Comparable, CSVConvert {
    private Long id;
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDateTime creationDate;
    private double price;
    private UnitOfMeasure unitOfMeasure;
    private Organization organization;

    private static long countProduct = 0;

    Product() {
        this.id = ++countProduct;
        this.creationDate = java.time.LocalDateTime.now();
    }

    Product(long id) {
        this.id = id;
        this.creationDate = java.time.LocalDateTime.now();
    }

    @Override
    public String toCSVString() throws IllegalAccessException {
        StringBuilder result = new StringBuilder();
        Class<?> clazz = this.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(this);
            if (!result.isEmpty()) {
                result.append(".");
            }
            result.append(convertFieldToCSVString(value));
        }
        return result.toString();
    }

    private String convertFieldToCSVString(Object obj) {
        if (obj == null) {
            return "null";
        } else if (obj instanceof Coordinates) {
            return ((Coordinates) obj).toCSVString();
        } else if (obj instanceof Organization) {
            return ((Organization) obj).toCSVString();
        } else {
            return obj.toString();
        }
    }

    @Override
    public int compareTo(Object o) {
        Product other = (Product) o;
        if (this.getPrice() != other.price) {
            double res = this.getPrice() - other.getPrice();
            if (res < 0) return -1;
            else if (res == 0) return 0;
            else return 1;
        }
        int res = coordinates.compareTo(other.getCoordinates());
        if (res == 0)
            return creationDate.compareTo(other.getCreationDate());
        return res;
    }
}