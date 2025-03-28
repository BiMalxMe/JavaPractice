// Updated COde

import java.io.*;
import java.util.Scanner;

public class vowelConsonentSeperatorIO {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

            System.out.println("Enter a string Please:");
            String word = sc.next();

            FileOutputStream fi = new FileOutputStream("vowel.txt", true);
            FileOutputStream fo = new FileOutputStream("consonant.txt", true);

            int givenLength = word.length();
            char[] str = new char[givenLength];

            int i;
            for (i = 0; i < givenLength; i++) {
                str[i] = word.charAt(i);
            }

            int j, k;
            for (j = 0; j < givenLength; j++) {
                for (k = 0; k < vowels.length; k++) {
                    if (str[j] == vowels[k]) {
                        fi.write(str[j]);
                        break;
                    }
                }
                if (k == vowels.length) {
                    fo.write(str[j]);
                }
            }

            fi.close();
            fo.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//Firstly Written Code (Bug wala Original Code (HEHE))
//import java.io.*;
//        import java.util.Scanner;
//public class second {
//    public static void main(String[] args) {
//        try{
//            Scanner sc = new Scanner(System.in);
//            String[] arr={"a","e","i","o","u"};
//            System.out.println("Enter a string Please");
//            String word = sc.next();
//            FileOutputStream fi = new FileOutputStream("vowel.txt",true);
//            FileOutputStream fo= new FileOutputStream("consonent.txt",true);
//            int givenLength = word.length();
//            int vowelLength = arr.length;
//            char[] str =new String[word.length()];
//            int i;
//            for(i=0;i<givenLength;i++){
//                str[i]=word.charAt(i);
//            }
//            int j;
//            int k;
//            for(j=0;j<givenLength;j++){
//                for(k=0;k<vowelLength;k++){
//                    if(str[j]==arr[k]){
//                        fi.write((char)str[j]);
//                    }
//                    fo.write(str[j]);
//                }
//            }
//
//            fi.close();
//            fo.flush();
//            fo.close();
//
//
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//}
