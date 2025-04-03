// Updated COde

import java.io.*;
import java.util.Scanner;

public class vowelConsonentSeperatorDeclineOther2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            char[] alphabet = new char[52];

            int index = 0;
            // Yo Euta tarika ho array ma halne A-Z
            for (char c = 'A'; c <= 'Z'; c++) {
                alphabet[index++] = c;
            }

            // Yo Euta tarika ho array ma halne z-z
            for (char c = 'a'; c <= 'z'; c++) {
                alphabet[index++] = c;
            }
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

            int j, k,l;
            for (j = 0; j < givenLength; j++) {
                boolean isVowel = false;

                for (k = 0; k < vowels.length; k++) {
                    if (str[j] == vowels[k]) {
                        fi.write(str[j]);
                        isVowel = true;
                        break;
                    }
                }

                if (!isVowel) {
                    //char ko harek lai iterate garne
                    for(char ch:alphabet){
                        if(ch==str[j]){
                            fo.write((str[j]));
                        }
                    }

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
