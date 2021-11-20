/**
*Java1. Homework_6
*
*@author Lena
*@version 20.11.2021
*/

class Homework_6 {
    public static void main(String[] args){
        Cat cat = new Cat("Barsik");                    
        Dog dog = new Dog("Sharik");
        
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.swim());
            System.out.println(animal.run());
        }
    }
}

abstract class Animal {
    protected String name;
       
    Animal(String name) {
        this.name = name;
    }
    
    String run() {
        return "run(unknow)";
    }
    
    String swim() {
        return "swim(unknow)";
    }
    
}

class Dog extends Animal{
        
    Dog(String name) {
        super (name);
    }
    
    @Override
    String run() {
        return "run(500 m)";
    }
    
    @Override
    String swim() {
        return "swim(10 m)";
    }
    
    @Override
    public String toString () {
        return "Name:" + name;
    }
}

class Cat extends Animal{
        
    Cat(String name) {
        super (name);
    }
    
    @Override
    String run() {
        return "run(200 m)";
    }
    
    @Override
    String swim() {
        return "can't swim";
    }
    
    @Override
    public String toString () {
        return "Name:" + name;
    }
}