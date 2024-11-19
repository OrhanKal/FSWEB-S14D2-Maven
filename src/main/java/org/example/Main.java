package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Lamp lamp = new Lamp(LampType.NEON, true, 100);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("double", 3,3,3,3);
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall southWall = new Wall("South");

        Wall[] walls = new Wall[]{northWall, eastWall, westWall, southWall};

        Bedroom bedroom = new Bedroom(northWall, eastWall, westWall, southWall, ceiling, lamp, new Carpet(10,5,PaintColor.WHITE), "myBedroom",bed, new Wardrobe(2,4,200));

        bedroom.createBedroom();
    }
}