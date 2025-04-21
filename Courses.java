public class Courses {
    
    int courseID;
    Courses nextCourse;
    int maxCapacity; // Max amount of students that can join the course. FCDS project required 20-30 students. So I made it 30.
    int currentEnrollment;  // To track the number of students currently enrolled in the chosen course. 

public Courses() {
        this.nextCourse = null;
        this.maxCapacity = 30;  // 30 as chosen by Dr. Doaa
        this.currentEnrollment = 0;  // Initial value, untill a student is added later on. 
    }
public Courses(int courseID) {
        // Initialize the courseID
        // and set nextCourse to null
        this.courseID = courseID;
        this.nextCourse = null;
        this.maxCapacity = 30;  
        this.currentEnrollment = 0;  
    }
public  Courses(int courseID, Courses nextCourse) {
        // Initialize the courseID
        // and set nextCourse to the given value
        this.courseID = courseID;
        this.nextCourse = nextCourse;
        this.maxCapacity = 30;  
        this.currentEnrollment = 0;  
    }
    /* This method is used to enroll a student into the chosen course, only if the course isn't full and under 30 students are enrolled within. And then increases
     the amount of students enrolled in it by 1, for later usage.*/
    public void addStudent(int studentID) {
        if (this.currentEnrollment < this.maxCapacity) {
            this.currentEnrollment++;  
            System.out.println("Student ID " + studentID + " added to Course ID " + courseID);
        } else {
            System.out.println("Course ID " + courseID + " is full. Cannot add Student ID " + studentID);
        }
    }
    /* This method is created to check if the chosen course is full or not, by setting its limit to 30 as chosen by Dr. Doaa, and comparing the number of the 
    current students enrolled in the course to the limit which is 30.*/
     public void checkIfFull() {
        if (this.currentEnrollment >= this.maxCapacity) {
            System.out.println("Course ID " + courseID + " is full.");
        } else {
            System.out.println("Course ID " + courseID + " is not full. Current enrollment: " 
                               + currentEnrollment + " out of " + maxCapacity);
        }
    }

}
