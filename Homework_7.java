/**
*Java1. Homework_7
*
*@author Lena
*@version 24.11.2021
*/

class Homework_7 {
    public static void main(String[] args){
        Cat[] cats = {
            new Cat("Barsic", 14), new Cat("Tom", 10), new Cat("Gav", 30)
        };
        Plate plate = new Plate (10, 5);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        
   
        System.out.println(plate);
        plate.add(5);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setSatiety(false);
            cat.eat(plate);
            System.out.println(cat);
        }
              
        System.out.println(plate);
    }
}

class Cat {
    String name;
    int appetite;
    boolean satiety;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    
    void setSatiety(boolean full) {
        satiety = full;
    }
    
   
    
    void eat(Plate plate) {
        if (!satiety)
           satiety = plate.decreaseFood(appetite);
    }
    
        
    @Override
    public String toString () {
        return "{name:" + name +", appetite:" + appetite + ", satiety" + satiety + "}";
    }
}

class Plate {
    int food;
    int max;
    
     Plate (int food, int max) {
        this.food = food;
        this.max = max;
    }
    
        
    boolean decreaseFood(int foodplate) {
        if (food < foodplate) return false;
        food -= foodplate;
        return true;
    }
    
    void add(int food) {
        if (this.food + food <= max)
            this.food += food;
    }
    
    @Override
    public String toString () {
        return "food:" + food;
    }
}