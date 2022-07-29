package Urok2_Operatori;

public class First {

    public static void main(String[] args) {
        Person teacher = new Person(33, "Дима");
        Person anotherTeacher = new Person();
        teacher.age = 33;
        teacher.name = "Dima";
        teacher.goToPension();
        teacher.sayName ();

    }

}