//FileInputStream is a Java class used to read data from a file in the form of bytes
//FileOutputStream is a Java class used to write data to a file in the form of bytes.
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
public class FileInputOutStream {
    public static void main(String[] args) throws Exception {
        String path = "src/FileHandling/file1.txt";
        String path2 = "src/FileHandling/file2.txt";


        File inputFile = new File(path);
        File outFile = new File(path2);

        FileInputStream fis = new FileInputStream(inputFile);
        FileOutputStream fos = new FileOutputStream(outFile);
        int c;
        while((c=fis.read())!=-1){
            System.out.println(c);
            System.out.print((char)c);
            fos.write(c);
        }
        fos.close();
        fis.close();
    }
}
