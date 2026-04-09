public class Inheritance {
    public static void main(String[] args) {
    
        Dog dc = new Dog();
         dc.color = "pink";
        System.out.println(dc.color);

        Cat c = new Cat();
        c.eye = 2;
        System.out.println(c.eye);
        
        
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }

    void breathe(){
        System.out.println("breathe");
    }

}
// single level 
class Dog extends Animal{
    int eye;
    void run(){
        System.out.println("run");
    }

}

 //miltilevel 
class Cat extends Dog {
     int legs;
    
}