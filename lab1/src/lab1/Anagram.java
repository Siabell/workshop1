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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anagram anagrama= new Anagram();
        String palabra1 = "";
        String palabra2 = "";
        Scanner entradaEscaner = new Scanner (System.in); 
       
        palabra1 = entradaEscaner.nextLine (); 
        palabra2 = entradaEscaner.nextLine (); 
        System.out.println(anagrama.logic(palabra1, palabra2));
        
    }

    public String logic(String word1, String word2) {
        String answer = "Not Anagram";
        char[] list1 = word1.toLowerCase().toCharArray();
        char[] list2 = word2.toLowerCase().toCharArray();
        Arrays.sort(list1);
        Arrays.sort(list2);
        if (list1.length == list2.length) {
            
            for (int i = 0; i < list1.length; ++i) {
                if(list1[i] != list2[i]){
                    return answer;
                }
            }
            answer = "Anagrams";
        }
        return answer;
    }

}
