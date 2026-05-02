class Student{
    private int rollno;
    private String name;
    private int age;
    private String sections;
    Student(int r, String Name, int age, String sections){
    this.rollno = r;
    this.name = Name;
    this.age = age; 
    this.sections = sections;
    }   

    void study(){
        System.out.println("Student is studying");
    }
        void sleep(){
        System.out.println("Student is sleeping");
}
    public int getRollNo() {
        return this.rollno;
    }

    public void setRollNo(int rollno){
        this.rollno = rollno;
         
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }  
    public void setAge(int age) {
        this.age = age;
    }
    public String getSections() {
        return this.sections;
    }
    public void setSections(String sections) {
        this.sections = sections;
    }

    public void callstudy(){
        this.study();
    }

    public void callsleep(){
        this.sleep();
    }

}

public class Encaps1 {
public static void main(String[] args) {
    Student s = new Student(101, "Aditya", 22, "G");
    s.study();
    s.sleep();
    }    
}

