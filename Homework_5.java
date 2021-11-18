/**
*Java1. Homework_5
*
*@author Lena
*@version 18.11.2021
*/

class Homework_5 {
    public static void main(String[] args){
            //Employee employee = new Employee("Ivanov Ivan Ivanovich", "manager", "ivanov@mail.ru", 798877, 50000, 33);
            //System.out.println(employee);
            
            Employee[] persArray = new Employee [5]; 
                persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312, 30000, 30); 
                persArray[1] = new Employee("Petrov Ivan", "manager", "ivanov@mail.ru", 798877, 50000, 41);
                persArray[2] = new Employee("Sidorov Gleb", "programmer", "sid@mail.ru", 221133, 100000, 28);
                persArray[3] = new Employee("Osin Oleg", "tester", "osn@mail.ru", 221133, 70000, 34);
                persArray[4] = new Employee("Smirina Mariya", "designer", "mmm@mail.ru", 556655, 80000, 31);
            //System.out.println(persArray[2]);
                       
            for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40)persArray[i].print(); 
            
    }
}

class Employee {
    String name;
    String position;
    String email;
    int phone;
    int salaries;
    int age;
    
    Employee(String name, String position, String email, int phone, int salaries, int age) {
        this.name = name;
        this. position = position;
        this.email = email;
        this.phone = phone;
        this.salaries = salaries;
        this.age = age;
    }
    
    @Override
    public String toString () {
        return "name:" + name + ", position:" + position + ", email:" + email + ", phone" + phone + ", salaries" +  salaries + ", age" + age ;
    }
    public void print() {
                System.out.println(this);
    }
}