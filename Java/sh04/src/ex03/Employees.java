package ex03;

import exeptions.IncorrectNifFormatExeption;

public class Employees {
    private static final String DNI_REGEX = "\\d-[A-z]{5}-\\d";
    private static final String CIF_REGEX = "\\d-[A-z]{7}-\\d";
    private String dni;
    private String name;
    private int age;
    private Department department;
    private boolean telecommuting;
    private String company;
    private  int baseSalary;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean isTelecommuting() {
        return telecommuting;
    }

    public void setTelecommuting(boolean telecommuting) {
        this.telecommuting = telecommuting;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public Employees(String dni, String name, int age, Department departament, boolean telecommuting, String company) {
        if(!dni.matches(DNI_REGEX)){
            System.out.println("incorrect DNI format");
        }
        if(!company.matches(CIF_REGEX)){
            throw new IncorrectNifFormatExeption();
        }
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.department = departament;
        this.telecommuting = telecommuting;
        this.company = company;
        this.baseSalary=1000;
    }

    public void calcSalary(){
        int salary = this.baseSalary+ department.getPremium();
        if(age>30){
            salary+=200;
        }
        if(telecommuting){
            salary+=30;
        }
        System.out.println("Salary of employee "+name+" is "+salary);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Employees object = (Employees) obj;
        return this.dni.equals(object.dni);
    }

    @Override
    public String toString() {
        return "DNI :"+dni
                +" name: "+name
                +" age "+age
                +" Department: "+department.getName()
                +" is telecommuting: "+telecommuting
                +" NIF of company "+company;
    }
}
