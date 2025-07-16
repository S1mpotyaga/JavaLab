package org.collectionClasses;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import org.collectionClasses.enums.OrganizationType;
import org.collectionClasses.enums.UnitOfMeasure;
import org.exceptions.NotFoundEnum;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

public class CSVFile {

    public static SortedSet<Product> readCSV(String path) throws IOException {
        SortedSet<Product> result = new TreeSet<>();
        try (FileReader file = new FileReader(path)) {
            CSVReader reader = new CSVReader(file);
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                try {
                    result.add(parseLineProduct(nextLine));
                } catch (NumberFormatException | NotFoundEnum e) {
                    System.err.println("Error parsing csv data. Collection is empty.");
                    result.clear();
                    return null;
                }
            }
        } catch (IOException e) {
            throw new IOException();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private static Product parseLineProduct(String[] line) throws NumberFormatException, NotFoundEnum {
        Product res = new Product();
        res.setName(line[0]);
        res.setPrice(Double.parseDouble(line[1]));
        res.setCoordinates(parseLineCoordinates(line));
        res.setUnitOfMeasure(UnitOfMeasure.fromString(line[4]));
        res.setOrganization(parseLineOrganization(line));
        return res;
    }

    private static Coordinates parseLineCoordinates(String[] line) throws NumberFormatException {
        Coordinates result = new Coordinates();
        result.setX(Integer.parseInt(line[2]));
        result.setY(Double.parseDouble(line[3]));
        return result;
    }

    private static Organization parseLineOrganization(String[] line) throws NotFoundEnum {
        Organization result = new Organization();
        result.setName(line[5]);
        result.setFullName(line[6]);
        result.setOrganizationType(OrganizationType.fromString(line[7]));
        return result;
    }

    public static void writeCSV(String path) throws IOException{
        try (FileWriter writer = new FileWriter(path)){
            CSVWriter csvWriter =  new CSVWriter(writer);
            try {
                String[][] csvStrings = CollectionHandler.convertToCSV();
                for (int i = 0; i < csvStrings.length; ++i) {
                    csvWriter.writeNext(csvStrings[i]);
                }
            } catch (IllegalAccessException e) {
                System.err.println("Error convert data to csv file.");
            }
        } catch (IOException e){
            throw new IOException();
        }
    }
}