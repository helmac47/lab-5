import java.util.ArrayList;

class Main {  
 public static void main(String[] args) {                      Student  student1 = new Student();  
   Student  student2 = new Student();

   student1.setName("Arnold Spielberg");    
   student1.setGPA(4.0);    
   student1.setMajor("Electrical Engineering");

   System.out.println("Student1's name is " 		+ student1.name + " and they have a GPA of " + 	student1.gpa + " and are majoring in " + student1.major);

   student2.setName("Alex Helm");
	 student2.setGPA(4.3);
	 student2.setMajor("Operations Management and Information Systems.");

   System.out.println("Student2's name is " 		+ student2.name + " and they have a GPA of " + 	student2.gpa + " and are majoring in " + student2.major);

   ArrayList<Double> gpaArray = new ArrayList<Double>(); 
   gpaArray.add(student1.getGPA());
   gpaArray.add(student2.getGPA());

    double sum = 0.0;
    for(int i = 0; i < gpaArray.size(); ++i) {
      sum = gpaArray.get(i) + sum; 
    }
      double avg = sum / (gpaArray.size()*1); 

      System.out.println("The average GPA is " + avg);
 }
}


  
  
    
 
   
   
   
   
   // or can do this with the dot operator    //student1.name = "Arnold Spielberg";    //student1.gpa = 4.0;    //student1.major = "Electrical Engineering";    System.out.println("student1's name is " + student1.getName() + " and their GPAis " + student1.getGPA() + " and their major is " + student1.getMajor());// or can do this with the dot operator    //System.out.println("student1's name is " + student1.name + " and their GPA is" + student1.gpa + " and their major is " + student1.major);  }}