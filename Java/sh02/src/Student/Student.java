package Student;

import Person.Person;

public class Student extends Person {
    private String degree;
    public Student(String name, int age, String degree) {
        super(name, age);
        this.degree=degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public void printDetails() {
        System.out.println("name: "+getName()+" age: "+getAge()+" degree :"+this.degree);
    }

    public static void main(String[] args) {
        Student student = new Student("Ana",20,"Engineering");
        student.printDetails();
    }
}
