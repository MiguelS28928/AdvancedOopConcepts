package Insurance;
import javax.swing.JOptionPane;

public class UseInsurance
{
	public static void main(String[] args)
	
	{
		String Input;
		int selection;

		Input = JOptionPane.showInputDialog(null, "What Insurance type do you want to see?\n 1 = Life Insurance \n 2 = Health Insurance");
		selection = Integer.parseInt(Input);

		if(selection == 1)
		{
			Life lifeInsurance = new Life();
			lifeInsurance.display();
		}
		if(selection == 2)
		{
			Health healthInsurance = new Health();
			healthInsurance.display();
		}
	}
}