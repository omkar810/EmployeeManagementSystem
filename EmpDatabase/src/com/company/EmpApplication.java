package com.company;

public class EmpApplication {
	public static void main(String[] args) {
		EmpDatabase ed=new EmpDatabase();
		for(;;) {
			System.out.println("1.Add Employee 2.Remove Employee 3.Search 4.Update 5.Display 6.Filter 7.Exit");
			switch (ed.sc.nextInt()) {
			case 1: {
				ed.addEmp();
				break;
			}
			case 2: {
				ed.removeEmp();
				break;
			}
			case 3: {
				ed.searchEmp();
				break;
			}
			case 4: {
				ed.updateEmp();
				break;
			}
			case 5: {
				ed.displayEmp();
				break;
			}
			case 6: {
				ed.filterEmp();
				break;
			}
			default:{
				System.out.println("Appliction is Closed...");
				return;
			}
			}
		}

	}

}
