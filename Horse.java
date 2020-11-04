package com.javarush.task.task21.task2113;

public class Horse {
    String name;
    double speed, distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void move (){
        distance += speed*Math.random();
    }
    public void print (){
int num = (int)Math.floor(distance);
for (int i = 0; i< num; i++){
    System.out.print(".");
}
        System.out.println(name);
    }

}
