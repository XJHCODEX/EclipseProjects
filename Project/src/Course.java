public class Course implements Comparable<Course>{
  //We want to implement comparable to be able to sort our strings and objects.
   private boolean isGraduateCourse;
   private int courseNum;
   private String courseDept;
   private int numCredits;
   public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
       this.isGraduateCourse = isGraduateCourse;
       this.courseNum = courseNum;
       this.courseDept = courseDept;
       this.numCredits = numCredits;
   }
 //using methods to return our parameters.
   public boolean isGraduateCourse() 
   {
       return isGraduateCourse;
   }

   public int getCourseNum() 
   {
       return courseNum;
   }

   public String getCourseDept() 
   {
       return courseDept;
   }

   public int getNumCredits() 
   {
       return numCredits;
   }
   public String getCourseName() 
   {
       if(isGraduateCourse)
       {
       return "G" + courseDept + courseNum;
       //if isGraduateCourse. return G
       }
       else if(!isGraduateCourse)
       {
       return "U" + courseDept + courseNum;
       //if not isGraduateCourse. return U
       }
       return null;
       //Other-wise return null
   }

       public boolean equals(Object obj) {
       Course c = (Course) obj;
      
       if(this.isGraduateCourse != c.isGraduateCourse)
       {
       return false;
       //if our isGraduateCourse is not equal to our instance of isGraduateCourse. return false.
       }
       if(this.courseNum != c.courseNum)
       {
    	   return false;
    	   //if our courseNum is not equal to our instance of courseNum. return false.
       }
       if(this.courseDept != c.courseDept)
       {
    	   return false;
    	   //if our courseDept is not equal to our instance of courseDept. return false.
       }
       if(this.numCredits != c.numCredits)
	   {
	       return false;
	       //if our numCredits is not equal to our instance of numCredits. return false.
	   }
	   else
	   {
		   	return true;
		   	//other-wise true.
	   }
   }

       @Override
       public String toString() {

    	   /*toString will be used to display our methods or values of 
    	    * isGraduateCourse
    	    * courseNum
    	    * courseDept
    	    * numCredits
    	    * if isGraduateCourse or if its not a GraduateCourse.
    	    */
       if (isGraduateCourse)
       return String.format("Course: %3s-%3d | Number of Credits: %02d | Graduate",getCourseDept(), getCourseNum(), getNumCredits(),isGraduateCourse());
       else if(!isGraduateCourse)
       return String.format("Course: %3s-%3d | Number of Credits: %02d | Undergraduate",getCourseDept(), getCourseNum(), getNumCredits(),isGraduateCourse());
       return null;
       }

      

       @Override
       //We are using compareTo to compare methods.
       public int compareTo(Course c) {
          
           if(courseNum == c.courseNum)
           	{
               return 0;
               //if courseNum equals our instance of courseNum. return 0.
           	}
           else if(courseNum > c.courseNum)
           	{
               return 1;
             //if courseNum is greater then our instance of courseNum. return 1.
           	}
               else
               {
               return -1;
               //other-wise return -1.
               }
          
       }

}