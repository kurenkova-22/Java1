/**
*Java1. Homework_6
*
*@author Lena
*@version 22.11.2021
*/

class Homework_6 {
    public static void main(String[] args){
        Cat cat = new Cat("Barsik");                    
        Dog dog = new Dog("Sharik");
        
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.swim(5));
            System.out.println(animal.run(250));
        }
    }
}

abstract class Animal {
    protected String name;
       
    Animal(String name) {
        this.name = name;
    }
    
    String run(int length) {
        return "run" + length;
    }
    
    String swim(int length) {
        return "swim " + length;
    }
    
}

class Dog extends Animal{
        
    Dog(String name) {
        super (name);
    }
    
    @Override
    String run(int length) {
        if (length > 500)
            length = 500;
        return name + " run " + length;
    }
    
    @Override
    String swim(int length) {
        if (length > 10)
            length = 10;
        return name + " swim " + length;
    }
    
    @Override
    public String toString () {
        return "Dog's name:" + name;
    }
}

class Cat extends Animal{
        
    Cat(String name) {
        super (name);
    }
    
    @Override
    String run(int length) {
        if (length > 200)
            length = 200;
        return name + " run " + length;
/*      if (length <= 200)
            return name + " run " + length;
        else 
            return name + " can't run " + "> 200 m"; */
    }
    
    @Override
    String swim(int length) {
        return name + " can't swim";
    }
    
    @Override
    public String toString () {
        return "Cat's name:" + name;
    }
}