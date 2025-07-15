package org.collectionClasses;

import lombok.Data;
import org.collectionClasses.enums.UnitOfMeasure;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private Long id;
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDateTime creationDate;
    private UnitOfMeasure unitOfMeasure;
    private Organization organization;
}
