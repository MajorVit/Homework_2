package Urok2_Operatori;

public class Person {
    int age;
    String name;


//конструктор (альт+инсерт)
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    //ручками
    void goToPension() {
        if(age>65) {
            System.out.println("Я на пенсии");
        } else {
            System.out.println("Я еще молод");
        }
    }
    void sayName(){
        System.out.println("Мое имя: " + name);
    }
}
