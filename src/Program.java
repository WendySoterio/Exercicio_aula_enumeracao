import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities_enum.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter department's name:");
		String nameDepartament = sc.nextLine();
		System.out.print("Enter worker data:");
		System.out.print("Name:");
		String workerName = sc.nextLine();
		System.out.print("Level:");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary:");
		Double workerBaseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(nameDepartament));
		
		System.out.print("How many contracts to this worker:");
		int nContract = sc.nextInt();
		
		for (int i=1; i<nContract; i++) {
			System.out.print("Enter contract # " + i + "data:");
			System.out.print("Date (DD/MM/YYYY):");
			
		}
		
		
		
		sc.close();
	}

}
