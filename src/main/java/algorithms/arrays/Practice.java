package main.java.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {


    public static class Employee {
        public String id;
        public String name;

        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String... args){
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(new Employee("1", "siddhi"),
                new Employee("2", "asha")));


        System.out.println(employeeList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                return -o1.name.compareTo(o2.name);
            }
        }).collect(Collectors.toList()));

    }
}
