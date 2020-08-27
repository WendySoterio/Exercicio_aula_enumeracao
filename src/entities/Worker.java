package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities_enum.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//As associações que o Worker possue:
	public Department department;
	public List<HourContrat> contrats = new ArrayList<>();
	
	//Construtor SEM 'contrats'
	
	public Worker () {
		
	}
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContrat> getContrats() {
		return contrats;
	}
	//public void setContrats(List<HourContrat> contrats) { // não pode trocar essa lista de contrato por outra
	//	this.contrats = contrats;
	//}
	public void addContrat(HourContrat contract) {
		contrats.add(contract);
	}
	public void removeContrat ( HourContrat contract) {
		contrats.remove(contract);
	}
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContrat c : contrats) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);		
			if (year == c_year && month == c_month) {
				sum = sum + c.totalValue();
			}
		}return sum;
	}
		
}
