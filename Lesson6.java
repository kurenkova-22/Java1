class Lesson6 {
    public static void main(String[] args){
        Cat cat = new Cat("Barsik", "white", 4);
        System.out.println(cat);
        System.out.println(cat.voice());
        
        Dog dog = new Dog("Sharik", "black", 7);
        System.out.println(dog);
        System.out.println(dog.voice());
    }
}

class Animal {
    String name;
    String color;
    int age;
    
    Animal(String name, String color, int age) {
        this.name = name;
        this. color = color;
        this.age = age;
    }
    
    String voice() {
        return "unknow";
    }
    
    @Override
    public String toString () {
        return "Name:" + name + ", color:" + color + ", age:" + age;
    }
}

class Dog extends Animal{
        
    Dog(String name, String color, int age) {
        super (name, color,age);
    }
    
    @Override
    String voice() {
        return "gaf";
    }

}

class Cat extends Animal{
        
    Cat(String name, String color, int age) {
        super (name, color,age);
    }
    
    @Override
    String voice() {
        return "meow";
    }
}