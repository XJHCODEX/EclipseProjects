public class Person implements Comparable<Person>
	{
	private String name;
	private int birthYear;
	public Person() 
	{
		name = "";
		birthYear = 0;
	}
	public Person(String name, int birthYear)
	{
		this.name = name;
		this.birthYear = birthYear;
	}
	//using methods to return our parameters.
	public String getName()
	{
		return name;
	}
	public int getBirthYear()
	{
		return birthYear;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBirthYear(int year)
	{
		this.birthYear = year;
	}
	public boolean equals(Object obj)
	{
		Person p = (Person) obj;
		if(this.name != p.name) {
			return false;
		}
		if(this.birthYear != p.birthYear) {
			return false;
		}
		else {
			return true;
		}
	}
	public String toString()
	{
		return String.format("Person: Name: %30s | Birth Year: %4d",getName(), getBirthYear());
		//for our string.format we are using our methods getName() and getBirthYear() to get our name and birthyear.
	}
	public int compareTo(Person p)
	{
		if(birthYear == p.birthYear)
		{
			return 0;
			//if birthYear equals our instance of birthYear. return 0.
		}
		else if(birthYear > p.birthYear)
		{
			return 1;
			//if birthYear is greater then our instance of birthYear. return 1.
		}
		else
		{
			return -1;
			//other-wise return -1.
		}
	}
}
