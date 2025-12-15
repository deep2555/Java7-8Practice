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
			
			if (assigned) {
                System.out.println("Status: Assigned");
            } else {
                System.out.println("Status: Unassigned");
            }
			
		}
	}

	// testing
	public static void main(String[] args) {
		    Employee e1 = new Employee(1, "Deepanshu", "Europe");
		    Employee e2 = new Employee(2, "Amit", "India");
		    Employee e3 = new Employee(3, "Sarah", "USA");
		    
		    CoroporateManager cm = new CoroporateManager();
		    
		    cm.addEmployee(e1);
		    cm.addEmployee(e2);
		    cm.addEmployee(e3);
		    
		    // Assets (4: Laptop + Vehicle)
		    Laptop l1 = new Laptop("A1", "Dell", 2022, 16);
		    Laptop l2 = new Laptop("A2", "HP", 2021, 32);
		    Vehicle v1 = new Vehicle("V1", "Tesla", 2023, "Electric");
		    Vehicle v2 = new Vehicle("V2", "BMW", 2020, "Petrol");
		
		    cm.addAsset(l1);
		    cm.addAsset(l2);
		    cm.addAsset(v1);
		    cm.addAsset(v2);
		    
		 // Assignment attempts
		    cm.assignAssetToEmployees(1, "A1"); // ✅ success
		    cm.assignAssetToEmployees(2, "A1"); // ❌ asset already assigned
		    cm.assignAssetToEmployees(1, "A2"); // ❌ employee already has asset
		    cm.assignAssetToEmployees(2, "V1"); // ✅ success
		     
		    cm.generateAssestReport();

//		Employee result = cm.findEmployee(1);
//		if (result != null) {
//			result.displayDetails();
//		} else {
//			System.out.println("employee not found");
//		}
	}

}
