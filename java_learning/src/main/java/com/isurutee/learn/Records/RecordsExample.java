package com.isurutee.learn.Records;

import com.isurutee.learn.common.IExample;

import java.awt.*;

public class RecordsExample implements IExample {
    @Override
    public void runExample() {
        System.out.println("---------------------------Records Example--------------------------");
        createBasicRecord();
        createRecordWithValidation();
    }

    private static void createBasicRecord() {
        record GrapeRecord(Color color, int nbrOfPits) {}
        GrapeRecord grape1 = new GrapeRecord(Color.BLUE, 1);
        GrapeRecord grape2 = new GrapeRecord(Color.WHITE, 2);
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeRecord grape1Copy = new GrapeRecord(grape1.color(), grape1.nbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy));
    }

    private static void createRecordWithValidation() {
        record GrapeRecord(Color color, int nbrOfPits) {
            GrapeRecord {
                System.out.println("Parameter color=" + color + ", Field color=" + this.color());
                System.out.println("Parameter nbrOfPits=" + nbrOfPits + ", Field nbrOfPits=" + this.nbrOfPits());
                if (color == null) {
                    System.out.println("COLOR CANNOT BE NULL");
                }
            }
        }
        GrapeRecord grape1 = new GrapeRecord(Color.BLUE, 1);
        System.out.println("Grape 1 is " + grape1);
        GrapeRecord grapeNull = new GrapeRecord(null, 2);
    }
}
