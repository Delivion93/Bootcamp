package Person;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println("name: "+this.name+" age: "+age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Artem", 31);
        person.printDetails();
        person.setName("Carlos");
        person.setAge(30);
        person.printDetails();
    }
}
