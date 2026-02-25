package com.dailyPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee emp1 = new Employee("mark", 19, "IT", "M");
		Employee emp2 = new Employee("aark", 20, "Sales", "F");
		Employee emp3 = new Employee("bark", 21, "IT", "M");
		Employee emp4 = new Employee("cark", 22, "Sales", "F");
		Employee emp5 = new Employee("dark", 23, "IT", "M");
		Employee emp6 = new Employee("ark", 25, "Sales", "F");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		//Find List of employees whose name start with A
		List<Employee> nameListA = empList.stream().filter(emp -> emp.getName().startsWith("a")).collect(Collectors.toList());
		
		//group the employees by department name
		Map<String, List<Employee>> departmentMap = empList.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		
		//total count of employes
		long count = empList.stream().count();
		
		//max age of employes
		int age = empList.stream().mapToInt(emp -> emp.getAge()).max().getAsInt();
		
		//find all department names
		List<String> department = empList.stream().map(emp -> emp.getDepartment()).collect(Collectors.toList());
		
		//Find the count of employee in each department
		Map<String, Long> departmentCount = empList.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
		
		//Find the list of employees whose age is less than 30
		List<Employee> ageLessThan30 = empList.stream().filter(emp -> emp.getAge() < 30).collect(Collectors.toList());
		
		//Find the list of employees whose age is in between 26 and 31
		List<Employee> ageBetween26And31 = empList.stream().filter(emp -> emp.getAge()>=26 && emp.getAge() <=31).collect(Collectors.toList());
		
		//Find the average age of male and female employee
		Map<String, Double> avgMandF = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
	}

}
