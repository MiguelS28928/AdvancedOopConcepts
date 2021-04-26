package Insurance;

import javax.swing.JOptionPane;

public class Health extends Insurance
{
	
	private final double HEALTH_INSURANCE_COST = 196;

	public Health()
	{
		super("Health Insurance");
		setCost();
	}

	public void setCost()
	{
		monthlyCost = HEALTH_INSURANCE_COST;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null, "Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + getMonthlyCost());
	}
}
