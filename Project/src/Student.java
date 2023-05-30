
public class Student extends Person
{
	private static int numStudents = 0;
	private int studentID = 0;
	private Course [] coursesTaken;
	private int numCoursesTaken;
	private boolean isGraduate;
	private String major = "undeclared";
	
	public Student()
	{
		++numStudents;
		studentID = numStudents;
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		isGraduate = false;
		major = "undeclared";
	}
	public Student(boolean isGraduate)
	{
		++numStudents;
		studentID = numStudents;
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		major = "undeclared";
	}
	public Student(String major, boolean isGraduate)
	{
		++numStudents;
		studentID = numStudents;
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = major;
	}
	public Student(String name, int birthYear, String major, boolean isGraduate)
	{
		super(name, birthYear);
		++numStudents;
		studentID = numStudents;
		coursesTaken = new Course[50];
		numCoursesTaken = 0;
		this.isGraduate = isGraduate;
		this.major = major;
	}
	//using methods to return our parameters.
	public boolean isGraduate()
	{
	return isGraduate;
	}
	public int getNumCoursesTaken()
	{
		return numCoursesTaken;
	}
	public static int getNumStudents()
	{
		return numStudents;
	}
	public int getStudentID()
	{
		return studentID;
	}
	public String getMajor()
	{
		return major;
	}
	public void setIsGraduate(boolean isGraduate)
	{
		this.isGraduate = isGraduate;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	public void addCourseTaken(Course course)
	{
		   if(numCoursesTaken>=50)
		   	{

	           System.out.println("course can not be added");
		   	}
		   else 
	    	{
	          this.coursesTaken[numCoursesTaken++] = course;
	          //increment value of numCoursesTaken
	          //appends course to the end of the existing array
	      }
	}
	public void addCoursesTaken(Course [] course)
	{
	       for(int i=0;i<course.length;i++){

	           if(numCoursesTaken >= 50)

	                return ;
	           this.addCourseTaken(course[i]);
	       }
	          //Loop that adds 1 to numCourses until the length of the course is reached.
	          //appends courses to the end of the existing array
	}
	public Course getCourseTaken(int index)
	{
	      if ((index < 0) || (index > numCoursesTaken - 1)) {
	          return null;
	       }
	       return coursesTaken[index];
	       //return index value of coursesTaught
	}
	public String getCourseTakenAsString(int index)
	{
	      if ((index < 0) || (index > numCoursesTaken - 1)) {
	          return "";
	       }
	       return coursesTaken[index].getCourseDept() + "-"  + coursesTaken[index].getCourseNum();
	       //returns courseDept-courseNum
	}
	   public String getAllCoursesTakenAsString() {
		      String value = "";
		      for (int index = 0; index < numCoursesTaken; index++) {
		         value = value + getCourseTakenAsString(index) + ", ";
		      }
		      return value;
		   }
	   public boolean equals(Object obj) {
		      if(obj instanceof Student) {
		         Student s = (Student)obj;
		         if((super.equals(s)) && (this.getNumStudents() == s.getNumStudents())   
		         && (this.getStudentID() == s.getStudentID()) 
		         && (this.getAllCoursesTakenAsString().equals(s.getAllCoursesTakenAsString()))  
		         && (this.getNumCoursesTaken() == s.getNumCoursesTaken())
		         && (this.isGraduate == s.isGraduate())) 
		         {
		            return true;
		         }
		      }
		      return false;
		   }
	   public String toString()
	   {
		   String graduateStatus = "";
		      if (isGraduate) {
		         graduateStatus = "Graduate";
		      }
		      else {
		         graduateStatus = "Undergraduate";
		      }
		      
		      return super.toString() + " " + String.format("Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s", getStudentID(), getMajor(), graduateStatus, getNumCoursesTaken(), getAllCoursesTakenAsString());
		   
	   }
	   public int compareTo(Person p) {
		      if(p instanceof Student) {
		         Student s = (Student)p;
		         if(this.getNumCoursesTaken() > s.getNumCoursesTaken()) 
		         {
		            return 1;
		         }
		         if(this.getNumCoursesTaken() < s.getNumCoursesTaken()) 
		         {
		            return -1;
		         }
		      }
		      else {
		          return super.compareTo(p);
		      }
		      return 0;
		   }
}
