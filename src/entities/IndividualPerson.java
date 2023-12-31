package entities;

public class IndividualPerson extends Person {
	private Double healthExpenditures;

	public IndividualPerson() {
	}

	public IndividualPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double payTax() {
		double taxMultiplier = (getAnnualIncome() < 20000.0) ? 0.15 : 0.25;
		double deductTax = (healthExpenditures > 0) ? 0.5 : 0.0;
		double tax = getAnnualIncome() * taxMultiplier - (healthExpenditures * deductTax);
		return (tax > 0) ? tax : 0;
	}

}
