// Yo chai class ma afai gareko code
import java.io.*;
public class oneFileToAnotherCopyIO {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("abc.txt");
            FileOutputStream fo= new FileOutputStream("xyz.txt",true);
            int i ;
            while ((i=fi.read())!=-1){
                fo.write((char)i);
            }
            fi.close();
            fo.flush();
            fo.close();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}