package org.collectionClasses;

import lombok.Data;
import org.collectionClasses.enums.OrganizationType;

import java.io.Serializable;


@Data
public class Organization implements Serializable, Comparable, CSVConvert {
    private long id;
    private String name;
    private String fullName;
    private OrganizationType organizationType;

    private static long countOrg = 0;

    Organization() {
        this.id = ++countOrg;
    }

    Organization(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Organization other = (Organization) o;
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toCSVString() {
        return ((Long)id).toString() + "." + name + "." + fullName + "." + organizationType.toString();
    }
}
