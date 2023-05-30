//Driver_SchoolDB class video
//https://youtu.be/lEnTH4LeP4Y
//Other classes video
//https://youtu.be/raVFb9soJak
import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileInputStream;
public class Driver_SchoolDB 
{
	public static void main(String [] args)
	{
        
		//locates file / if it exists
		File file = new File("SchoolDB_Initial.txt");
		/*Since our SchoolDB_Initial.txt file is in the project folder, 
		we don't have to indicate a specific path.*/
		if(file.exists())
		{
			try {
				FileReader reader = new FileReader("SchoolDB_Initial.txt");
				int word = reader.read();
				while(word != -1) {
					System.out.print((char)word);
					word = reader.read();
					/*while our word doesn't equal -1, continue. Since our file doesn't contain the value
					 * -1, it continues to read until file reader closes.
					 */
				}
				reader.close();
			}
			//if file not found, we catch the exception with FileNotFoundException.
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			//if we have a IOException, we catch the exception with IOException.
			catch(IOException e){
				e.printStackTrace();
			}
			try {
				//objects and array for our courses.
				Course course1 = new Course(true, 771, "MAT", 04);
				Course course2 = new Course(true, 777, "CMP", 04);
				Course course3 = new Course(true, 711, "CMP", 04);
				Course course4 = new Course(true, 723, "MAT", 04);
				Course course5 = new Course(false, 168, "CMP", 04);
				Course course6 = new Course(false, 338, "CMP", 04);
				Course [] course = {course1, course2, course3, course4, course5, course6};
				
				//objects and array for our faculty.
				Faculty F1 = new Faculty("", 0, "", false);
				Faculty F2 = new Faculty("", 0, "", true);
				Faculty F3 = new Faculty("", 0, "MAT", false);
				Faculty F4 = new Faculty("Superman", 1938, "PHY", true);
				Faculty [] faculty = {F1, F2, F3, F4};
				
				//objects and array for our generalstaff.
				GeneralStaff GS1 = new GeneralStaff("", 0, "", "");
				GeneralStaff GS2 = new GeneralStaff("", 0, "", "advise students");
				GeneralStaff GS3 = new GeneralStaff("", 0, "Sanitation", "clean");
				GeneralStaff GS4 = new GeneralStaff("Flash Gordon", 1934, "Security", "safety");
				GeneralStaff [] GS = {GS1, GS2, GS3, GS4};
				
				//objects and array for our student.
				Student S1 = new Student("", 0, "undeclared", false);
				Student S2 = new Student("", 0, "undeclared", false);
				Student S3 = new Student("", 0, "Math", false);
				Student S4 = new Student("Wonderwoman", 1941, "JST", true);
				Student [] student = {S1, S2, S3, S4};
				
				//We will use printwriter to write into file
				PrintWriter writer = new PrintWriter("SchoolDB_Updated.txt");
				writer.write("\n");
				writer.write("**************************************************************\n");
				writer.write("SCHOOL DATABASE INFO:\n");
				writer.write("\n");
				writer.write("************************************************\n");
				//Have our array of objects within a for loop to print each one into the new text file.
				writer.write("COURSES:\n");
				for(Course courses: course)
				{
					writer.println(courses);
				}
				writer.write("************************************************\n");
				writer.write("************************************************\n");
				
				writer.write("PERSONS:\n");
		        
				writer.write("************************************************\n");
				writer.write("************************************************\n");

				writer.write("EMPLOYEES:\n");
			    
				writer.write("************************************************\n");
				writer.write("************************************************\n");
		        
				writer.write("GENERAL STAFF:\n");
				//general staff arrays
				for(GeneralStaff generalstaff: GS)
				{
					writer.println(generalstaff);
				}
				writer.write("************************************************\n");
				writer.write("************************************************\n");
		        
				writer.write("FACULTY:\n");
				//faculty arrays
				for(Faculty facultys: faculty)
				{
					writer.println(facultys);
				}
				writer.write("************************************************\n");
				writer.write("************************************************\n");
				writer.write("STUDENTS:\n");
				//students arrays
				for(Student students: student)
				{
					writer.println(students);
				}
				writer.write("************************************************\n");
				writer.write("**************************************************************\n");
				writer.write("\n");
		        
				writer.close();
			}
			//IoException incase of exception.
			catch(IOException e){
				e.printStackTrace();
			}
			try {
				FileReader reader = new FileReader("SchoolDB_Updated.txt");
				int word = reader.read();
				/*while our data doesn't equal -1, continue. Since our file doesn't contain the value
				 * -1, it continues to read until file reader closes.
				 */
				while(word != -1) {
					System.out.print((char)word);
					word = reader.read();
				}
				//file reader closes
				reader.close();
			}
			//Similar to our previous exceptions, we have a catch for FileNotFoundException.
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			//and a catch for IOException.
			catch(IOException e){
				e.printStackTrace();
			}
		}

		//else, if file doesn't exist. print "that file doesn't exist".
		else
		{	
		System.out.println("That file doesn't exist");
		}
	}
}
