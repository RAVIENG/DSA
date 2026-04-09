public class Subset{
     
    public static void printpair(String str,int i,String result){
        if(i==str.length()){
            System.out.println(result);
            return ;
        }
     
         printpair(str, i+1, result+str.charAt(i));
         printpair(str, i+1, result);
        
   
        
    }
    public static void main(String args[]){
       String str = "abc";
       String result = "";
      printpair(str, 0, result);
    } 
}
