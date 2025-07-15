package org.collectionClasses;

import lombok.Data;
import org.collectionClasses.enums.OrganizationType;

import java.io.Serializable;


@Data
public class Organization implements Serializable {
    private int id;
    private String name;
    private String fullName;
    private OrganizationType organizationType;
}
