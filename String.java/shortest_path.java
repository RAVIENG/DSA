public class shortest_path {
     public static float sortPath(String dir){
        int x=0,y=0;
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='E'){
                y++;
            }

            else if(dir.charAt(i)=='W'){
                x--;
            }

            else if(dir.charAt(i)=='N'){
                x++;
            }

            else{
                y--;
            }

        }
        int x2=x*x;
        int y2 =y*y;
        return (float )Math.sqrt(x2+y2);
     }
    public static void main(String args[]){
       String dir = "WNEENESENNN";
       System.out.println(sortPath(dir));
    }
}
