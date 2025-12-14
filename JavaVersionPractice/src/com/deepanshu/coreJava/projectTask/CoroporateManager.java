package com.deepanshu.coreJava.projectTask;

public class CoroporateManager {

	// make an array for the employee and asset
	private Employee[] employeeArray = new Employee[10];
	private Assets[] assetArray = new Assets[10];

	// management systems using loops and arrays
	// utility methods
	public void addEmployee(Employee employe) {
		// check the array condition
		for (int i = 0; i < employeeArray.length; i++) {
			if (employeeArray[i] == null) {
				employeeArray[i] = employe;
				System.out.println("the employee added to the list");
			} else {
				System.out.println("cannot add employee ");
			}
		}
	}

	public void addAsset(Assets asset) {
		for (int i = 0; i < assetArray.length; i++) {
			if (assetArray[i] == null) {
				assetArray[i] = asset;
				System.out.println("the assest is added to the list");
			} else {
				System.out.println("cannot added assest");
			}
		}
	}

	public Employee findEmployee(int id) {
		// fetch all the employee from the list
		for (Employee emp : employeeArray) {
			if (emp != null && emp.getPersonID() == id) {
				return emp;
			}
		}

		return null;

	}

	public Assets findAsset(String id) {
		// fetch all the employee from the list
		for (Assets ast : assetArray) {
			if (ast != null && ast.getAssetID() == id) {
				return ast;
			}
		}

		return null;

	}

	// business logic
	public void assignAssetToEmployees(int employeeID, String assetID) {
		Employee employeDetail = findEmployee(employeeID);
		Assets assetDetails = findAsset(assetID);
		
		// logical conditions 
		//1) does the employee exist
		if(employeDetail == null) {
			System.out.println("the employee does not exist");
			return;
		}
		// 2) does the asset exist
		if(assetDetails == null) {
			System.out.println("the asset does not exist");
			return;
		}
		// 3) is the asset already assigned to another employee
		for(Employee ep : employeeArray) {
			if(ep!=null && ep.isAssetAssigned()&& ep.getAssignAssest().equals(assetDetails)) {
				System.out.println("assest is assigned to any employee");
				return;
			}
		}
		// 4️ Does target employee already have an asset?
		if(employeDetail.isAssetAssigned()) {
			System.out.println("asset is assigned to the employee");
			return;
		}
			
		employeDetail.setAssignAssest(assetDetails);
		System.out.println("the asset is assign to the employee");
		
	}
	
	// reporting and Logic
	public void generateAssestReport() {
		for(Assets assetDetails : assetArray) {
			if(assetDetails!= null) {
				assetDetails.displayDetails();
			}
			boolean assigned = false;
			for(Employee empDetail : employeeArray) {
				if(empDetail!= null &&empDetail.isAssetAssigned() && empDetail.getAssignAssest().equals(assetDetails)) {
					assigned = true;
					break;
				}
			}
			
		}
	}

	// testing
	public static void main(String[] args) {
		Employee emp = new Employee(1, "deepansu", "europe");
		Laptop lap = new Laptop("22", "dell", 2022, 16);

		CoroporateManager cm = new CoroporateManager();
		cm.addEmployee(emp);
		cm.addAsset(lap);
		
		cm.assignAssetToEmployees(1, "22");
		cm.generateAssestReport();

		Employee result = cm.findEmployee(1);
		if (result != null) {
			result.displayDetails();
		} else {
			System.out.println("employee not found");
		}
	}

}
