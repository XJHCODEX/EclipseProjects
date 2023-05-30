public class GeneralStaff extends Employee 
{
	private String duty;
	public GeneralStaff()
	{
		duty = "";
	}
	public GeneralStaff(String duty)
	{
		this.duty = duty;
	}
	public GeneralStaff(String deptName, String duty)
	{
		super(deptName);
		this.duty = duty;
	}
	public GeneralStaff(String name, int birthYear, String deptName, String duty)
	{
		super(name, birthYear,deptName);
		this.duty = duty;
	}
	//using methods to return our parameters.
	public String getDuty()
	{
		return duty;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof GeneralStaff)
		{
			GeneralStaff g = (GeneralStaff)obj;
			if(super.equals(g) && this.duty.equals(g.getDuty()))
			{
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
	
		return super.toString() + " " + String.format("GeneralStaff: Duty: %10s", getDuty());
	}
}
