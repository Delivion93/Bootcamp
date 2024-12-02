package Employee;

import Person.Person;

public class Employee extends Person {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void printDetails() {
        System.out.println("name: "+getName()+" age: "+getAge()+" salary: "+this.salary);
    }

}
