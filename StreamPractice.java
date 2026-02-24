package com.dailyPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee emp1 = new Employee("mark", 19, "IT");
		Employee emp2 = new Employee("aark", 20, "Sales");
		Employee emp3 = new Employee("bark", 21, "IT");
		Employee emp4 = new Employee("cark", 22, "Sales");
		Employee emp5 = new Employee("dark", 23, "IT");
		Employee emp6 = new Employee("ark", 25, "Sales");
		
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
	}

}
