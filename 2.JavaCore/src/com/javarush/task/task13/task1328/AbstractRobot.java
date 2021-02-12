package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable,Defensable {
    private static int hitCount;
    private String name;
    private BodyPart bodyPart;

    public void Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public BodyPart attack() {
        return bodyPart;
    }

    @Override
    public BodyPart defense() {
        return bodyPart;
    }
}
