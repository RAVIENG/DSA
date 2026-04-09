public class _substring {
    public static String printSubstrng(String str ,int si,int ei){
        String issubstring = "";
           for(int i= si;i<ei;i++){
            issubstring += str.charAt(i);
           }
           return issubstring;
    }
    public static void main(String args[]){
        String str = "helloword";
        int si=0;
        int ei=5;
        System.out.println(printSubstrng(str,si,ei));
        System.out.println(str.substring(0,5));  


    }
}

