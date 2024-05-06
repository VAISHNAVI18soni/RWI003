package handling;
import java.io.File;


public class Class3 {

public static void main(String[] args) {
	  File originalname=new File("C:\\Users\\hp\\desktop\\vaishu.txt");
      File rename=new File("C:\\Users\\hp\\desktop\\gudiya.txt");
if(originalname.exists()){
 System.out.println(originalname.renameTo(rename)+" successfully changed name ");

}
else {
 System.out.println("File doest not exits");
}

}
}