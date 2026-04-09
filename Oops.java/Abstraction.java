public class Abstraction {
    public static void main(String args[]){
        
        Horse h = new Horse();
        h.walk();

          ChessPlayer q = new Queen();
        q.moves();
    }
}

//abstract class
abstract class Animal {  
    String color;
    Animal(){
        color = "blue";
    }


    void eat() {
        System.out.println("Animal eat"); // non abstract method
    }


    abstract void walk(); //abstract method 
}


class Horse extends Animal{
    void walk(){
        System.out.println("horse walk in 4 leg");
    }

    void changecolor(){
        color = "pink";
    }
}

//interface
interface ChessPlayer  {
    void moves();    
}


class Queen implements ChessPlayer { //implement of interface
    public void moves() {
        System.out.println("Queen moves in all 4 directions (straight & diagonal).");
    }
}


class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rook moves straight (horizontal & vertical).");
    }
}


class King implements ChessPlayer {
    public void moves() {
        System.out.println("King moves 1 step in any direction.");
    }
}
