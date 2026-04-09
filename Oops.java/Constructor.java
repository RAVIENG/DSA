public class Constructor {
    public static void main(String args[]){
       Student s1 = new Student();
       s1.name = "ravi";
       s1.password="xyz";
       Student s2 = new Student("ravi");
        
       Student s3 = new Student(s1);
       s3.password= "xyz";
       

    }
}

class Student{
    String name;
    String password;
     //parameterized constructor
    Student(String name){
        this.name= name;
        System.out.println(name);
    }
    //deparameterized constructor
    Student(){
        System.out.println("constructors is called");
    }
   
    //copy costructor
     Student(Student s1){
      name =s1.name;
      
        
     }
}
