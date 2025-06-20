package LMS_project;

public class operators {
    public static void main(String[] args) {
        int studentID = 101;
        String StudentName = "John";
        byte age = 25;
        double assignmentScore = 90;
        double quizScore = 85;
        double examScore = 90;
        double attendence = 85;

        double totalScore = quizScore+assignmentScore+examScore;
        double avgScore = totalScore / 3;

        boolean isPassed = avgScore>=85;
        attendence++;
        boolean isQualified = isPassed && attendence >=70;

        System.out.println("Student Name: "+StudentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+avgScore);
        System.out.println("Is Student Passed: "+isPassed);

        System.out.println("Student Attendence After Attending: "+attendence);
        System.out.println("Is student Qualified: "+isQualified);

    }
    
}
