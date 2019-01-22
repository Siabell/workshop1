/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 2126081
 */
public class Anagram {

   static boolean isAnagram(String a, String b) {
       // Complete the function
       char[] A = a.replaceAll("[\\s]", "").toUpperCase().toCharArray();
       char[] B = b.replaceAll("[\\s]", "").toUpperCase().toCharArray();
       Arrays.sort(A);
       Arrays.sort(B);
       boolean result=false;
       if (Arrays.equals(A,B)){
           result=true;
       }
       return result;
   }
   public static void main(String[] args) {
  
       Scanner scan = new Scanner(System.in);
       String a = scan.next();
       String b = scan.next();
       scan.close();
       boolean ret = isAnagram(a, b);
       System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
   }
}
