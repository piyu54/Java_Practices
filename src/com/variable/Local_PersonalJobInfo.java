package com.variable;

//Example: Local Variables storing Personal and Job Information
class Local_PersonalJobInfo {
 
	
	public static void main(String[] args) {
     
     // Personal Information (Local Variables)
     String firstName = "Priya";
     String lastName = "Kushwaha";
     int age = 24;
     char gender = 'F';
     long mobileNumber = 9876543210L;
     String email = "priya.kushwaha@gmail.com";
     String address = "Bhopal, Madhya Pradesh, India";
     float height = 5.4f;
     double weight = 53.7;
     boolean isMarried = false;

     //  Job Information (Local Variables)
     String companyName = "Tech Solutions Pvt. Ltd.";
     String designation = "Software Developer";
     double salary = 45000.75;           
     int experience = 2;                
     String department = "IT Department";
     boolean isPermanentEmployee = true;
     String joiningDate = "10-January-2023";
     String employeeId = "TSPL1234";
     char grade = 'A';                   // performance grade
     String skills = "Java, HTML, CSS, JavaScript, MySQL";

     //  Display All Information
     System.out.println("----------- Personal Information -----------");
     System.out.println("First Name: " + firstName);
     System.out.println("Last Name: " + lastName);
     System.out.println("Age: " + age);
     System.out.println("Gender: " + gender);
     System.out.println("Mobile Number: " + mobileNumber);
     System.out.println("Email: " + email);
     System.out.println("Address: " + address);
     System.out.println("Height (ft): " + height);
     System.out.println("Weight (kg): " + weight);
     System.out.println("Married: " + isMarried);

     System.out.println("\n----------- Job Information -----------");
     System.out.println("Company Name: " + companyName);
     System.out.println("Designation: " + designation);
     System.out.println("Department: " + department);
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Experience (Years): " + experience);
     System.out.println("Salary (per month): ₹" + salary);
     System.out.println("Joining Date: " + joiningDate);
     System.out.println("Permanent Employee: " + isPermanentEmployee);
     System.out.println("Performance Grade: " + grade);
     System.out.println("Skills: " + skills);
 }
}

