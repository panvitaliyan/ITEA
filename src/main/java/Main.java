
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in))
        {
        File currentFile = new File("./");        
        //while (true){
            
            
            for (File iFile : currentFile.listFiles()) {
                if(iFile.isDirectory())
                    System.out.println(iFile.getName());
            }
            for (File iFile : currentFile.listFiles()) {
                if(iFile.isFile())
                    System.out.println(iFile.getName());
            }
            
        }
        
    }
    
}
