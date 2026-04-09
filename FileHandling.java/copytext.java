import java.io.*;
public class copytext{
    public static void main(String args[])throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("my.txt"));
        bw.write("this is a sample file");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("my.txt"));
        
        
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("my.txt1"));
        String line;
        while((line=br.readLine())!=null){
            bw1.write(line);
        }
       
        br.close();
        bw1.close();
    }
}