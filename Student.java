package StudentDatabaseApp;
import java.util.Scanner;
public class Student {
	private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 4500;
    private static int id = 1000;

    //Constructor prompt user to enter the name and year of student
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Student first name:");
        this.firstName = in.nextLine();

        System.out.print("Enter the Student last name:");
        this.lastName = in.nextLine();


        System.out.print("1 -> for Fresher\n2 -> for Sophmore\n3 -> for Junior\n4 -> for Senior\nEnter class Level:");
        this.gradeYear = in.nextInt();

        setStudentID();
   
        
        
        
        
    }

    //Generate an ID
    
    private void setStudentID() {
    	//Grade level + ID
    	id++;
    	this.studentID =  gradeYear + "" + id;
    	
    }
    
    //Enroll to courses
    public void enroll() {
    	
    	//Get inside a loop , user hits 0 
    	do {
            System.out.print("Enter course to enroll (Q to quit):");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();

            if (!course.equals("Q")) {
                if (courses.equals("")) {
                    courses = course;
                } else {
                    courses += " \n" + course;
                }
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (true);
       
    }
    
    //View Balance 
    public void viewBalance() {
    	System.out.println("\nYour balance is: " + tuitionBalance + " RS");
    	System.out.println("-------------------------------------------------------------------------\n\n");
    }

    //Pay Tuition Fee
    public void payTuition() {
    	viewBalance();
    	System.out.print("Enter your Payment : ");
    	Scanner sc = new Scanner(System.in);
    	int payment = sc.nextInt();
    	tuitionBalance -= payment;
    	
    	System.out.println("-------------------------------------------------------------------------\n\n");
    	System.out.println("Thank you! for your payment of " +payment + " RS");
    	System.out.println("-------------------------------------------------------------------------\n");
    	viewBalance();
    }
    

    //show status
    public String showInfo() {
    	return "Student Name : " +firstName + " " +lastName +
    			"\nStudent ID :" +studentID +
    			"\nGrade Level :"  +gradeYear +
    			"\nCourses Enrolled in :\n" +courses +
    			"\nBalance : " +tuitionBalance +" RS ";
    }
}
