package za.ac.cput.domain;

public class Employee {
    String firstName;
    String lastName;
    long studentNumber;
    double salary;

    public Employee() {
    }

    public Employee(long studentNumber, String firstName, String lastName, double salary) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
