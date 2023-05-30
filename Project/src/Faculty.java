public class Faculty extends Employee {
   private Course[] coursesTaught;
   /*private varaible array storing maximum number of courses a faculty has.
    cannot exceed 100.
    */
   private int numCoursesTaught;
   private boolean isTenured;
   
   public Faculty(){
      super();
      coursesTaught = new Course[100];
      numCoursesTaught = 0;
      isTenured = false;
   }
   
   public Faculty(boolean isTenured){
      super();
      coursesTaught = new Course[100];
      numCoursesTaught = 0;
      this.isTenured = isTenured;
   }
   
   public Faculty(String deptName, boolean isTenured){
      super(deptName);
      coursesTaught = new Course[100];
      numCoursesTaught = 0;
      this.isTenured = isTenured;
   }
   
   public Faculty(String name, int birthYear, String deptName, boolean isTenured){
      super(name, birthYear, deptName);
      coursesTaught = new Course[100];
      numCoursesTaught = 0;
      this.isTenured = isTenured;
   }
 //using methods to return our parameters.
   public boolean isTenured() {
      return this.isTenured;
   }
   
   public int getNumCoursesTaught() {
      return numCoursesTaught;
   }
   
   public void setIsTenured(boolean isTenured) {
      this.isTenured = isTenured;
   }
   
   public void addCourseTaught(Course course) {
	   if(numCoursesTaught>=100)
	   	{

           System.out.println("course can not be added");
	   	}
	   else 
    	{
          this.coursesTaught[numCoursesTaught++] = course;
         //increment value of numCoursesTaught
         //appends course to the end of the existing array
    	}  
   }
   
   public void addCoursesTaught(Course [] course) {
       for(int i=0;i<course.length;i++){

           if(numCoursesTaught >= 100)

                return ;
           this.addCourseTaught(course[i]);
       }
         //Loop that adds 1 to numCourses until the length of the course is reached.
         //appends courses to the end of the existing array
   }
   
   public Course getCourseTaught(int index) {
      if ((index < 0) || (index > numCoursesTaught - 1)) {
         return null;
      }
      return coursesTaught[index];
      //return index value of coursesTaught
   }
   
   public String getCourseTaughtAsString(int index) {
      if ((index < 0) || (index > numCoursesTaught - 1)) {
         return "";
      }
      return coursesTaught[index].getCourseDept() + "-"  + coursesTaught[index].getCourseNum();
      //returns courseDept-courseNum
   }
   
   public String getAllCoursesTaughtAsString() {
      String value = "";
      for (int index = 0; index < numCoursesTaught; index++) {
         value = value + getCourseTaughtAsString(index) + ", ";
      }
      return value;
   }
   
   
   public boolean equals(Object obj) {
      if(obj instanceof Faculty) {
         Faculty f = (Faculty)obj;
         if((this.getDeptName().equals(f.getDeptName()))   
        		 && (this.getEmployeeID() == f.getEmployeeID()) 
        		 && (this.getAllCoursesTaughtAsString().equals(f.getAllCoursesTaughtAsString()))  
        		 && (this.getNumCoursesTaught() == f.getNumCoursesTaught())
        		 && (this.isTenured() == f.isTenured())) 
         {
        	 //return true if parameter is exactly equal to String. Other-wise false.
        	 //invoking string contains same string.
            return true;
         }
      }
      return false;
   }
   
 
   public String toString() 
   {
      String tenuredString = "";
      if(isTenured) {
         tenuredString = "Is Tenured";
      }
      else {
         tenuredString = "Not Tenured";
      }
      
      return super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", tenuredString, getNumCoursesTaught(), getAllCoursesTaughtAsString());
     
   }
   
   public int compareTo(Person p) {
      if(p instanceof Faculty) {
         Faculty f = (Faculty)p;
         if(this.getNumCoursesTaught() > f.getNumCoursesTaught()) 
         {
            return 1;
         }
         if(this.getNumCoursesTaught() < f.getNumCoursesTaught()) 
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