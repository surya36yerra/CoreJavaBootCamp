package Preparation.Tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalaryTest {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(123,"surya","male",1000),
                new Employee(456,"alekhya","female",8000),
                new Employee(786,"krithi","female",5000),
                new Employee(999,"test","female",10000)
                );

        Collections.sort(employeeList, SalaryTest::myComparator);




        System.out.println(employeeList.stream().filter(t -> t.gender.equals("female"))
                .sorted((e1,e2)->Integer.compare(e2.getSalary(),e1.getSalary()))
//                .sorted((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary()))
                .skip(1)
                .map(Employee::getName)
                .findFirst()
                .orElse("no second lowest salary"));
    }


    static int myComparator(Employee e1,Employee e2){
        if(e1.salary> e2.salary){
            return 1;
        } else if(e1.salary < e2.salary){
            return -1;
        } else {
            return 0;
        }
    }


}
