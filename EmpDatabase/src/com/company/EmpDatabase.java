package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmpDatabase {
	List<Employee> l1 = new LinkedList<Employee>();
	Employee e;
	int id = 1;
	Scanner sc = new Scanner(System.in);

	public void addEmp() {
			System.out.println("Enter Name:");
			String name = sc.next().toUpperCase();
			System.out.println("Enter Age:");
			int age = sc.nextInt();
			System.out.println("Enter Salary:");
			double salary = sc.nextDouble();
			System.out.println("Select Department number: (1).10 (2).20 (3).30 (4).40");
			int deptno = 0;
			switch (sc.nextInt()) {
			case 1: {
				deptno = 10;
				break;
			}
			case 2: {
				deptno = 20;
				break;
			}
			case 3: {
				deptno = 30;
				break;
			}
			case 4: {
				deptno = 40;
				break;
			}
			default: {
				System.err.println("Choose correct option.");
				return;
			}
			}
			System.out.println("Select Job: 1.CLERK 2.SALESMAN 3.MANAGER 4.ANALYST");
			String job = null;
			switch (sc.nextInt()) {
			case 1: {
				job = "CLERK";
				break;
			}
			case 2: {
				job = "SALESMAN";
				break;
			}
			case 3: {
				job = "MANAGER";
				break;
			}
			case 4: {
				job = "ANALYST";
				break;
			}
			default: {
				System.err.println("Choose correct option.");
				return;
			}
			}
			e = new Employee(id, name, age, salary, deptno, job);
			if (l1.add(e)) {
				System.out.println("Employee added.");
				System.out.println("Your Employee ID is " + id++);
			} else {
				System.err.println("Employee is not added added.");
			}
	}

	public void removeEmp() {
			System.out.println("Enter Employee ID:");
			int id = sc.nextInt();
			for (int i = 0; i < l1.size(); i++) {
				if (l1.get(i).id == id) {
					l1.remove(i);
					System.err.println("Employee Removed.");
					return;
				}
			}
			System.err.println("ID is not found.");
	}

	public void searchEmp() {
			System.out.println("Enter Employee ID:");
			int id = sc.nextInt();
			for (int i = 0; i < l1.size(); i++) {
				if (l1.get(i).id == id) {
					System.out.println("____________________________________________________________________________________");
					System.out.print("Emp_ID");
					space("Emp_ID");
					System.out.print("Name");
					space("Name");
					System.out.print("Age");
					space("Age");
					System.out.print("Salary");
					space("Salary");
					System.out.print("Deptno.");
					space("Deptno.");
					System.out.println("Job");
					System.out.println("____________________________________________________________________________________");
					System.out.print(l1.get(i).id);
					space(isString(l1.get(i).id));
					System.out.print(l1.get(i).name);
					space(l1.get(i).name);
					System.out.print(l1.get(i).age);
					space(isString(l1.get(i).age));
					System.out.print(l1.get(i).salary);
					space(isStringD(l1.get(i).salary));
					System.out.print(l1.get(i).deptno);
					space(isString(l1.get(i).deptno));
					System.out.println(l1.get(i).job);
					System.out.println("____________________________________________________________________________________");
					return;
				}
			}
			System.err.println("ID is not found.");
	}

	public void updateEmp() {
		System.out.println("Enter Employee ID:");
		int id = sc.nextInt();
		for (int i = 0; i < l1.size(); i++) {
			if(l1.get(i).id==id){
				System.out.println("1.Name 2.Age 3.Salary 4.Deptno 5.Job");
				switch (sc.nextInt()) {
				case 1:{
					System.out.println("Current Name: "+l1.get(i).name);
					System.out.println("Enter new Name:");
					String name=sc.next().toUpperCase();
					l1.get(i).name=name;
					System.out.println("Name changed Successfully.");
				break;
				}
				case 2:{
					System.out.println("Current Age: "+l1.get(i).age);
					System.out.println("Enter new Age:");
					int age=sc.nextInt();
					l1.get(i).age=age;
					System.out.println("Age changed Successfully.");
				break;
				}
				case 3:{
					System.out.println("Current Salary: "+l1.get(i).salary);
					System.out.println("Enter new Salary:");
					double salary=sc.nextDouble();
					l1.get(i).salary=salary;
					System.out.println("Salary changed Successfully.");
				break;
				}
				case 4:{
					System.out.println("Current Department number: "+l1.get(i).deptno);
					System.out.println("Select new Department number: (1).10 (2).20 (3).30 (4).40");
					switch (sc.nextInt()) {
					case 1: {
						l1.get(i).deptno = 10;
						System.out.println("Department number changed Successfully.");
						break;
					}
					case 2: {
						l1.get(i).deptno = 20;
						System.out.println("Department number changed Successfully.");
						break;
					}
					case 3: {
						l1.get(i).deptno = 30;
						System.out.println("Department number changed Successfully.");
						break;
					}
					case 4: {
						l1.get(i).deptno = 40;
						System.out.println("Department number changed Successfully.");
						break;
					}
					default: {
						System.err.println("Choose correct option.");
						return;
					}
				  }
				break;
				}
				case 5:{
					System.out.println("Current Job: "+l1.get(i).job);
					System.out.println("Select new Job: 1.CLERK 2.SALESMAN 3.MANAGER 4.ANALYST");
					switch (sc.nextInt()) {
					case 1: {
						l1.get(i).job = "CLERK";
						System.out.println("Job changed Successfully.");
						break;
					}
					case 2: {
						l1.get(i).job = "SALESMAN";
						System.out.println("Job changed Successfully.");
						break;
					}
					case 3: {
						l1.get(i).job = "MANAGER";
						System.out.println("Job changed Successfully.");
						break;
					}
					case 4: {
						l1.get(i).job = "ANALYST";
						System.out.println("Job changed Successfully.");
						break;
					}
					default: {
						System.err.println("Choose correct option.");
						return;
					}
					}
				break;
				}
				default: {
					System.err.println("Choose correct option.");
					return;
				}
				}
				return;
			}
		}
		System.err.println("ID is not found.");
	}

	public void displayEmp() {
		System.out.println("____________________________________________________________________________________");
		System.out.print("Emp_ID");
		space("Emp_ID");
		System.out.print("Name");
		space("Name");
		System.out.print("Age");
		space("Age");
		System.out.print("Salary");
		space("Salary");
		System.out.print("Deptno.");
		space("Deptno.");
		System.out.println("Job");
		System.out.println("____________________________________________________________________________________");
		for (int i = 0; i < l1.size(); i++) {
				System.out.print(l1.get(i).id);
				space(isString(l1.get(i).id));
				System.out.print(l1.get(i).name);
				space(l1.get(i).name);
				System.out.print(l1.get(i).age);
				space(isString(l1.get(i).age));
				System.out.print(l1.get(i).salary);
				space(isStringD(l1.get(i).salary));
				System.out.print(l1.get(i).deptno);
				space(isString(l1.get(i).deptno));
				System.out.println(l1.get(i).job);
				System.out.println("____________________________________________________________________________________");
		}
	}
	public void filterEmp() {
		System.out.println("1.Name 2.Age 3.Salary 4.Deptno 5.Job");
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Enter Name:");
			String name = sc.next().toUpperCase();
			System.out.println("____________________________________________________________________________________");
			System.out.print("Emp_ID");
			space("Emp_ID");
			System.out.print("Name");
			space("Name");
			System.out.print("Age");
			space("Age");
			System.out.print("Salary");
			space("Salary");
			System.out.print("Deptno.");
			space("Deptno.");
			System.out.println("Job");
			System.out.println("____________________________________________________________________________________");
			for (int i = 0; i < l1.size(); i++) {
				if(l1.get(i).name.equals(name)) {
					System.out.print(l1.get(i).id);
					space(isString(l1.get(i).id));
					System.out.print(l1.get(i).name);
					space(l1.get(i).name);
					System.out.print(l1.get(i).age);
					space(isString(l1.get(i).age));
					System.out.print(l1.get(i).salary);
					space(isStringD(l1.get(i).salary));
					System.out.print(l1.get(i).deptno);
					space(isString(l1.get(i).deptno));
					System.out.println(l1.get(i).job);
					System.out.println("____________________________________________________________________________________");
				}
			}
			break;
		}
		case 2: {
			System.out.println("Enter Age:");
			int age=sc.nextInt();
			System.out.println("____________________________________________________________________________________");
			System.out.print("Emp_ID");
			space("Emp_ID");
			System.out.print("Name");
			space("Name");
			System.out.print("Age");
			space("Age");
			System.out.print("Salary");
			space("Salary");
			System.out.print("Deptno.");
			space("Deptno.");
			System.out.println("Job");
			System.out.println("____________________________________________________________________________________");
			for (int i = 0; i < l1.size(); i++) {
				if(l1.get(i).age==age) {
					System.out.print(l1.get(i).id);
					space(isString(l1.get(i).id));
					System.out.print(l1.get(i).name);
					space(l1.get(i).name);
					System.out.print(l1.get(i).age);
					space(isString(l1.get(i).age));
					System.out.print(l1.get(i).salary);
					space(isStringD(l1.get(i).salary));
					System.out.print(l1.get(i).deptno);
					space(isString(l1.get(i).deptno));
					System.out.println(l1.get(i).job);
					System.out.println("____________________________________________________________________________________");
				}
			}
			break;
		}
		case 3: {
			System.out.println("Enter Salary:");
			double salary=sc.nextDouble();
			System.out.println("____________________________________________________________________________________");
			System.out.print("Emp_ID");
			space("Emp_ID");
			System.out.print("Name");
			space("Name");
			System.out.print("Age");
			space("Age");
			System.out.print("Salary");
			space("Salary");
			System.out.print("Deptno.");
			space("Deptno.");
			System.out.println("Job");
			System.out.println("____________________________________________________________________________________");
			for (int i = 0; i < l1.size(); i++) {
				if(l1.get(i).salary==salary) {
					System.out.print(l1.get(i).id);
					space(isString(l1.get(i).id));
					System.out.print(l1.get(i).name);
					space(l1.get(i).name);
					System.out.print(l1.get(i).age);
					space(isString(l1.get(i).age));
					System.out.print(l1.get(i).salary);
					space(isStringD(l1.get(i).salary));
					System.out.print(l1.get(i).deptno);
					space(isString(l1.get(i).deptno));
					System.out.println(l1.get(i).job);
					System.out.println("____________________________________________________________________________________");
				}
			}
			break;
		}
		case 4: {
			System.out.println("Enter Department number:");
			int deptno=sc.nextInt();
			System.out.println("____________________________________________________________________________________");
			System.out.print("Emp_ID");
			space("Emp_ID");
			System.out.print("Name");
			space("Name");
			System.out.print("Age");
			space("Age");
			System.out.print("Salary");
			space("Salary");
			System.out.print("Deptno.");
			space("Deptno.");
			System.out.println("Job");
			System.out.println("____________________________________________________________________________________");
			for (int i = 0; i < l1.size(); i++) {
				if(l1.get(i).deptno==deptno) {
					System.out.print(l1.get(i).id);
					space(isString(l1.get(i).id));
					System.out.print(l1.get(i).name);
					space(l1.get(i).name);
					System.out.print(l1.get(i).age);
					space(isString(l1.get(i).age));
					System.out.print(l1.get(i).salary);
					space(isStringD(l1.get(i).salary));
					System.out.print(l1.get(i).deptno);
					space(isString(l1.get(i).deptno));
					System.out.println(l1.get(i).job);
					System.out.println("____________________________________________________________________________________");
				}
			}
			break;
		}
		case 5: {
			System.out.println("Enter Job:");
			String job=sc.next().toUpperCase();
			System.out.println("____________________________________________________________________________________");
			System.out.print("Emp_ID");
			space("Emp_ID");
			System.out.print("Name");
			space("Name");
			System.out.print("Age");
			space("Age");
			System.out.print("Salary");
			space("Salary");
			System.out.print("Deptno.");
			space("Deptno.");
			System.out.println("Job");
			System.out.println("____________________________________________________________________________________");
			for (int i = 0; i < l1.size(); i++) {
				if(l1.get(i).job.equals(job)) {
					System.out.print(l1.get(i).id);
					space(isString(l1.get(i).id));
					System.out.print(l1.get(i).name);
					space(l1.get(i).name);
					System.out.print(l1.get(i).age);
					space(isString(l1.get(i).age));
					System.out.print(l1.get(i).salary);
					space(isStringD(l1.get(i).salary));
					System.out.print(l1.get(i).deptno);
					space(isString(l1.get(i).deptno));
					System.out.println(l1.get(i).job);
					System.out.println("____________________________________________________________________________________");
				}
			}
			break;
		}
		default: {
			System.err.println("Choose correct option.");
			return;
		}
		}
	}
	public static void space(String blank) {
		for (int i = 0; i < 14 - blank.length(); i++) {
			System.out.print(" ");
		}
	}
	public static String isString(int number) {
		return number+"";
	}
	public static String isStringD(double db) {
		return db+"";
	}
}
