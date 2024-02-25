public class Person {
    String name;
    int age = 18;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayName(){
        System.out.println("Perosn name : " + this.name);
    }

    void displayAge(){
        System.out.println("Person age : " + this.age);
    }

//    @Override
//    public String toString(){
//        return "Deepanshu";
//    }
}
