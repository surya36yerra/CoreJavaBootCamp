package Udemy;

import java.util.Objects;

public class Person implements Cloneable  {

    public  String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int ssn, int age) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
    }

    private int ssn;

    public Person(String name) {
        this.name= name;
    }

    @Override
   public int hashCode() {
      return   Objects.hash(name,ssn,age);

    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {return false;
        }

        Person person = (Person) obj;//downcasting
        return Objects.equals(name,person.getName()) && ssn==person.getSsn() && age==person.getAge();


    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
