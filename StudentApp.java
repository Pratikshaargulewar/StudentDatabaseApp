package StudentDatabaseApp;

import java.util.Scanner;

public class  StudentApp {
    public static void main(String[] args){
        
        //Ask how many new students we want  to add
        System.out.println("Enter number of new Students to enroll :");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        
        // Create n  number of new students
        
        for(int i = 0 ; i< numOfStudents ;i++) {
        	System.out.print("[" +(i+1)+ "] ");
        	students[i] = new Student();
        	students[i].enroll();
        	students[i].payTuition();
        	
        }
        
        for(int i = 0 ; i< numOfStudents ;i++) {
        	System.out.print("[" +(i+1)+ "] ");
            System.out.println(students[i].showInfo());
            System.out.println("-------------------------------------------\n");
        }

    }
}
