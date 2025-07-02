package Preparation.Tests;

public class Employee {

    public int id;
    public String name;
    public String gender;
    public int salary;

    public Employee(int id,String name, String gender,int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
