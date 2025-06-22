public class gradingSystem {

    public static void main(String[] args) {
        short studentId = 101;
        String studentName = "John";
        byte yearOfStudy = 2;
        byte semester = 1;
        double javaProgramming = 89;
        double dataStructures = 78;
        double computerNetworks = 90;
        double totalMarks = javaProgramming + dataStructures + computerNetworks;
        double averageMarks = totalMarks / 3;
        boolean isPassed = averageMarks >= 50;
        boolean Qualification = javaProgramming > 60 && dataStructures > 70 && computerNetworks > 70
                && averageMarks >= 80;

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println("Semester: " + semester);
        System.out.println("Java Programming Marks: " + javaProgramming);
        System.out.println("Data Structures Marks: " + dataStructures);
        System.out.println("Computer Networks Marks: " + computerNetworks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Is Passed: " + isPassed);
        System.out.println("Qualification: " + Qualification);

    }
}