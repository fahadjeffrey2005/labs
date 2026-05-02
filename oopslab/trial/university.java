/**
 A university maintains records of its faculty. Define an abstract class University with the following specifications:
 Data Members:

 private String facultyName
 private int facultyID
 static String universityName = "MIT Manipal"

 Methods:

 Parameterized constructor to initialize facultyName and facultyID
 abstract double calculatePay()
 static void displayUniversity() — prints universityName
 void display() — prints name, ID, and net pay


 Derive two subclasses:
 Class FullTimeFaculty:

 Additional data: private double monthlySalary
 calculatePay() returns monthlySalary directly

 Class VisitingFaculty:

 Additional data: private double ratePerLecture, private int lectureCount
 calculatePay() returns:

 If lectureCount <= 20: ratePerLecture × lectureCount
 If lectureCount > 20: above + (lectureCount - 20) × 500 as bonus




 In the test class FacultyDemo:

 Call displayUniversity() once at the start
 Create the following using a University[] array and demonstrate dynamic method dispatch:

 TypeNameIDDetailsFullTimeFacultyDr. Rao101Salary: 85000VisitingFacultyProf. Sinha102Rate: 1500, Lectures: 25VisitingFacultyDr. Meera103Rate: 1200, Lectures: 18

 Expected Output:
 University: MIT Manipal

 Name: Dr. Rao       ID: 101   Pay: 85000.0
 Name: Prof. Sinha   ID: 102   Pay: 40000.0
 Name: Dr. Meera     ID: 103   Pay: 21600.0
 (Prof. Sinha: 1500×20 + 5×500 = 30000+2500+7500 = 40000)
 (Dr. Meera: 1200×18 = 21600)

 */

import java.util.*;
public class university
{
    private String facultyName;
    static String college = "Mit Manipal";
    
}
