public class Test{
	public static void main(String [] args)
	{
		Course course1 = new Course(true, 771, "MAT", 04);
		Course course2 = new Course(true, 777, "CMP", 04);
		Course course3 = new Course(true, 711, "CMP", 04);
		Course course4 = new Course(true, 723, "MAT", 04);
		Course course5 = new Course(false, 168, "CMP", 04);
		Course course6 = new Course(false, 338, "CMP", 04);
		Course [] course = {course1, course2, course3, course4, course5, course6};
		
		GeneralStaff GS1 = new GeneralStaff("", 0, "", "");
		GeneralStaff GS2 = new GeneralStaff("", 0, "", "advise student");
		GeneralStaff GS3 = new GeneralStaff("", 0, "Sanitation", "clean");
		GeneralStaff GS4 = new GeneralStaff("Flash Gordon", 1934, "Security", "safety");
		GeneralStaff [] GS = {GS1, GS2, GS3, GS4};
		
		Faculty F1 = new Faculty("", 0, "", false);
		Faculty F2 = new Faculty("", 0, "", true);
		Faculty F3 = new Faculty("", 0, "MAT", false);
		Faculty F4 = new Faculty("Superman", 1938, "PHY", true);
		Faculty [] faculty = {F1, F2, F3, F4};
		
		Student S1 = new Student("", 0, "undeclared", false);
		Student S2 = new Student("", 0, "undeclared", false);
		Student S3 = new Student("", 0, "Math", false);
		Student S4 = new Student("Wonderwoman", 1941, "JST", true);
		Student [] student = {S1, S2, S3, S4};
		
		for(Course courses: course)
		{
			System.out.println(courses);
		}
		for(GeneralStaff generalstaff: GS)
		{
			System.out.println(generalstaff);
		}
		for(Faculty facultys: faculty)
		{
			System.out.println(facultys);
		}
		for(Student students: student)
		{
			System.out.println(students);
		}
	}
}