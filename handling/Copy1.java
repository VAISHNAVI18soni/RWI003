package handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Copy1 {
    public static void main(String[] args) {
        try (FileInputStream read = new FileInputStream("C:\\\\Users\\\\hp\\\\Desktop\\\\vaishu.txt");
             FileOutputStream writecopy = new FileOutputStream("C:\\\\Users\\\\hp\\\\desktop\\\\gudiya.txt")) {

            int i;
            while ((i = read.read()) != -1) {
                writecopy.write(i);
            }

            System.out.println("Data copied successfully");
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}

//C:\\Users\\hp\\Desktop\\vaishu.txt

//C:\\Users\\hp\\desktop\\gudiya.txt
//C:\\\\Users\\\\hp\\\\Desktop\\\\vaishu.txt