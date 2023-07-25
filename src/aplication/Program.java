package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.Person;

public class Program {
	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payer: ");
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char p = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Annual income: ");
			Double annualIncome = scan.nextDouble();
			if (p == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = scan.nextDouble();
				list.add(new IndividualPerson(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer employeeNumber = scan.nextInt();
				list.add(new CompanyPerson(name, annualIncome, employeeNumber));
			}
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Person p : list) {
			double tax = p.payTax();
			System.out.println(p.getName() + ": $ " + String.format("%.2f", tax));
			sum+=tax;
		}
		System.out.println();
		
		System.out.println("TOTAL TAX: $ " + sum);
	}
}