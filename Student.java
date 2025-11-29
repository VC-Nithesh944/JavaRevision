class StudentModel{
    int studentId;
    String studentName, grade;

    StudentModel(){
        this(0 , "Unknown" , "None");
    }
    StudentModel(int studentId, String studentName, String grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    void display(){
        System.out.println("The Student Name is : " + studentName);
        System.out.println("Student Id : " + studentId);
        System.out.println("Grade : " + grade + "\n");
    }
}



public class Student {
    public static void main(String args[]){
        StudentModel student1 = new StudentModel();
        student1.display();
        StudentModel student2 = new StudentModel(218, "Nithesh Naik" , "OutStanding(O)");
        student2.display();
    }
}
