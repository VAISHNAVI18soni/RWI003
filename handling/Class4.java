package handling;
import java.io.*;

public class Class4 {

    public static void main(String[] args) {
        try { 
            File f = new File("C:\\Users\\hp\\Desktop\\vaishnavi.txt");
            FileWriter fw = new FileWriter(f); 
            
            try {
                fw.write("vaishu is super hero"); 
            } finally {
                fw.close(); 
            }
            
            System.out.println("Data written to the file");
        } catch(IOException i) {
            System.out.println(i);
        }
    }
}
