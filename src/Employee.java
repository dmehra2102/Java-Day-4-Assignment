public class Employee extends Person {
    int employeeId;
    double salary;
    Employee(String name, int age,int employeeId, double salary){
        super(name,age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
}
