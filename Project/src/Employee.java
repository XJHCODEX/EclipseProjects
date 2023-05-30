
public class Employee extends Person {
private String deptName;
private static int numEmployees = 0;
private int employeeID = 0;
public Employee()
{
	super();
	deptName = "";
	numEmployees ++;
	//Increment value of numEmployees.
	employeeID = numEmployees;
	//Value of numEmployees will equal to the employeeID.
}
public Employee(String deptName)
{
	super();
	this.deptName = deptName;
	numEmployees ++;
	//Increment value of numEmployees.
	employeeID = numEmployees;
	//Whatever value of employee will equal to the employeeID.
}
public Employee (String name, int birthYear, String deptName)
{
	super(name,birthYear);
	this.deptName = deptName;
	numEmployees ++;
	employeeID = numEmployees;
}
//using methods to return our parameters.
public String getDeptName()
{
	return deptName;
}
public static int getNumEmployees()
{
	return numEmployees;
}
public int getEmployeeID()
{
	return employeeID;
}
public void setDeptName(String deptName)
{
	this.deptName = deptName;
}
public boolean equals(Object obj)
{
	if(obj instanceof Employee)
	{
		Employee e = (Employee)obj;
		if((this.getName().equals(e.getName())) 
				&& (this.getBirthYear() == e.getBirthYear())
				&& (this.getDeptName().equals(e.getDeptName())) 
				&& (this.getEmployeeID() == e.getEmployeeID()))
		{
		//Searching strings to see if it the characters exist (true / false)
		//Since boolean, return true or false.
			return true;
		}
	}
	return false;
}
public String toString()
{
	return String.format("%s Employee: Department: %20s | Employee Number: %3d",super.toString(),getDeptName(),getEmployeeID());
}
public int compareTo(Person p)
{
	if(p instanceof Employee)
	{
		Employee e = (Employee) p;
        if(this.getEmployeeID() > e.getEmployeeID()) {
            return 1;
         }
		if(this.getEmployeeID() < e.getEmployeeID())
		{
			return -1;
		}
	}
	else
	{
		return super.compareTo(p);
	}
	return 0;
}
}
