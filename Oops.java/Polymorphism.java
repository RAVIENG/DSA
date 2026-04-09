public class Polymorphism {
    public static void main(String args[]){

        Calculator cl = new Calculator();

       System.out.println(cl.sum(1,2));
       System.out.println(cl.sum((float)1.2 , (float)1.3));
       System.out.println(cl.sum(2,4,5));

       Deer d = new Deer();
       d.eat();
    }
}
// compile time(method overloading)
class Calculator{

    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum (int a ,int b, int c){
        return a+b+c;
    }
}


//Run time (method overriding)
class Animal {
      void eat(){
        System.out.println("eats anything");
      }       
}


class Deer extends Animal{
     void eat(){
        System.out.println("eats grass ");
      }
}