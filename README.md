
package com.javarush.task.task21.task2113;


import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

  static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

         public void run (){
try {
    for (int i =0; i< 100; i++){
        move();
        print();
        Thread.sleep(200);
    }
}
catch (InterruptedException e){
    e.printStackTrace();
}
    }

    public void move (){
for (int i =0; i< horses.size(); i++){
    horses.get(i).move();
}
    }

    public void print (){
        for (int i =0; i< horses.size(); i++){
            horses.get(i).print();
        }
        for (int i =0; i< 10; i++){
           System.out.println();
        }
    }

    public Horse getWinner(){
        Horse horse = null;
        double dist =0;
        for (int i=0; i < horses.size(); i++){
            if (dist <  horses.get(i).distance){
                dist = horses.get(i).distance;
            }
        }
        for (int i=0; i < horses.size(); i++){
            if (dist == horses.get(i).distance)
               horse = horses.get(i);
        }
        return horse;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name + "!");
    }

    public static void main(String[] args){

        Horse snowflake = new Horse("Снежинка", 3.00, 0);
        Horse fuzz = new Horse("Пушинка", 3.00, 0);
        Horse icicle = new Horse("Льдинка", 3.00, 0);

        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(snowflake);
        game.getHorses().add(fuzz);
        game.getHorses().add(icicle);

        game.run();
        game.printWinner();

        //  game = null;

//        try {
//
//            Class clazz = Class.forName(Hippodrome.class.getName());
//            Class[] params = {List.class};
//            game = (Hippodrome) clazz.getConstructor(params).newInstance(horses2);
//
//            Field horses = clazz.getDeclaredField("horses");
//            horses.setAccessible(true);
//            horses.set(game, horses2);
//        }
//        catch (NoSuchFieldException |ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
       // System.out.println(game.getHorses());


    }
}
