public class Main {

    public static void main(String[] args) {
        Person newPerson = new Person("Deepanshu Mehra", 21);
        newPerson.displayAge();
        newPerson.displayName();

        //  Create an employee
        Employee employee1 = new Employee("Deepanshu", 21, 260, 61_500.450);

        System.out.println("Employee name : " + employee1.name);
        System.out.println("Employee Id : " + employee1.employeeId);
    }
}