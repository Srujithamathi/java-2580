public class collegeform {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("Application for college Admission test");
        System.out.println('\n');
        
        boolean isFirstYear = true;
        boolean isTransferee = false;
        boolean isReturnee = false;
        // Contact information
        String firstName = "Mathi";
        String middleName = "";
        String lastName = "Srujitha";
        String address = "Avanigadda,Andhra Pradesh";
        String dob = "01-01-2005";
        String birthPlace = "Avanigadda";
        String citizenship = "others";
        char civilStatus = 'S';
        char sex = 'F';
        long contactNumber = 832803467;
        String religion = "Hindu";
        String spouseName = "";
        String spouseNumber = null;
        boolean isPWD = false;

        String fatherName = "Mathi Sambasivarao";
        String occupation = "Farmer";
        long FcontactNumber = 900249683;

        String motherName = "Vani";
        occupation = "homemaker";
        long McontactNumber = 692454996;

        System.out.println("Is First Year: " +isFirstYear);
        System.out.println("Is Transferee: " +isTransferee);
        System.out.println("Is Returnee: " +isReturnee);
        System.out.println("First name is: " +firstName);
        System.out.println("Second name is: " +middleName);
        System.out.println("Last name is: " +lastName);
        System.out.println("Address is: " +address);
        System.out.println("Date of birth is: " +dob);
        System.out.println("Birth place is : " +birthPlace);
        System.out.println("Citizenship is: " +citizenship);
        System.out.println("Civil status is: " +civilStatus);
        System.out.println("Gender is: " +sex);
        System.out.println("Contact number is: " +contactNumber);
        System.out.println("Religion is: " +religion);
        System.out.println("Spouse name is: " +spouseName);
        System.out.println("Spouse number is : " +spouseNumber);
        System.out.println("Is PWD: " +isPWD);
        System.out.println('\n');
        System.out.println("Father name is: " +fatherName);
        System.out.println("Father occupation is: " +occupation);
        System.out.println("Father Contact number is: " +FcontactNumber);
        System.out.println('\n');
        System.out.println("Mother name is: " +motherName);
        System.out.println("Mother occupation is: " +occupation);
        System.out.println("Mother Contact number is: " +McontactNumber);
        System.out.println('\n');
        System.out.println("***************");
    }
}
