package LMS_project;

public class course {
    public static void main(String[] args) {
        byte courseId = 13;
        String courseName = "Data Science";
        String courseDescription = "This course is about data science includes python, AI, ML, Data Analysis, Data Visualization, etc.";
        byte courseDurationMonths = 6;
        boolean isOnline = false;
        float courseRating = 4.5f;
        String courseInstructor = "Dr. John";
        String courseLevel = "Intermediate";
        int coursePrice = 20000;
        float courseDiscount = 0.1f;
        short studentsEnrolled = 200;

        // printing values
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Course Duration: " + courseDurationMonths + " months");
        System.out.println("Course is Online: " + isOnline);
        System.out.println("Course Rating: " + courseRating);
        System.out.println("Course Instructor: " + courseInstructor);
        System.out.println("Course Level: " + courseLevel);
        System.out.println("Course Price: " + coursePrice);
        System.out.println("Course Discount: " + courseDiscount);
        System.out.println("Students Enrolled: " + studentsEnrolled);

    }

}
