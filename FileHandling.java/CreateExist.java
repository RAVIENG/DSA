import java.io.*;
public class CreateExist {
    public static void main(String[] args)throws Exception {
        File file = new File("sample.txt");

        if(file.createNewFile()){
            System.out.println("file created successfully");
        }else{
            System.out.println("file not created");
        }

        if(file.exists()){
            System.out.println("file exist");
        }else{
            System.out.println("file not exist");
        }
        
        if(file.delete()){
            System.out.println("file delete successfully");
        }else{
            System.out.println("file not delete");
        }
    }
}
