package org.collectionClasses.enums;


import org.exceptions.NotFoundEnum;

public enum OrganizationType {
    GOVERNMENT("government"),
    TRUST("trust"),
    OPEN_JOINT_STOCK_COMPANY("open_joint_stock_cmpany");

    private final String text;

    OrganizationType(String text){
        this.text = text;
    }

    public static OrganizationType fromString(String current) throws NotFoundEnum {
        for (OrganizationType tmp: OrganizationType.values()){
            if (tmp.toString().equals(current)){
                return tmp;
            }
        }
        throw new NotFoundEnum("Not found organization type!");
    }

    @Override
    public String toString(){
        return this.text;
    }
}