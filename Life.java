package Insurance;

import javax.swing.JOptionPane;

public class Life extends Insurance
{
	
	private final double LIFE_INSURANCE_COST = 36;

	public Life()
	{
		super("Life Insurance");
		setCost();
	}

	public void setCost()
	{
		monthlyCost = LIFE_INSURANCE_COST;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null, "Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + getMonthlyCost());
	}
}