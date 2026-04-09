import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class Example {
    public static void main(String[] args) throws Exception {
     String path = "src/FileHandling/file1.txt";
     File file = new File(path);

     FileWriter fw = new FileWriter(file,true); 

     BufferedWriter bw = new BufferedWriter(fw);
     //from console to write data;
     System.out.println("enter data");
     Scanner sc = new Scanner(System.in);
     String st = sc.nextLine();
     bw.write(st);

     FileReader fr = new FileReader(path);
     BufferedReader br = new BufferedReader(fr);

     bw.write("hello from ravi ");
     int c;
     while((c=br.read())!=-1){
        System.out.print((char)c);
     }
     bw.close();
     fw.close();
     sc.close();
     br.close();
     fr.close();

    }
}
