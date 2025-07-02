package java.lambda.FuncIntf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise1 {
    public static void main(String[] args) {
        filterByAge(25);
        filterByCity("LA");
    }

    public static List<java.lambda.FuncIntf.Person> filterByAge(int age) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));
        return filter(persons, p -> p.getAge() > age);
    }

    public static List<Person> filterByCity(String city) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));
        // Write your code below
        return filter(persons, p -> p.getCity().equals(city));
    }


    public static List<Person> filter(List<Person> persons, Predicate<Person> predicate) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.test(person)) {
                filteredPersons.add(person);
            }
        }
        System.out.println(filteredPersons);
        return filteredPersons;
    }

}