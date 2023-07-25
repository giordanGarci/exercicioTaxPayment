package entities;

public class CompanyPerson extends Person {
	private int employeeNumber;

	public CompanyPerson() {
	}

	public CompanyPerson(String name, Double annualIncome, int employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double payTax() {
		double taxMultiplier = (employeeNumber < 10) ? 0.16 : 0.14;
		return getAnnualIncome() * taxMultiplier;
	}

}
