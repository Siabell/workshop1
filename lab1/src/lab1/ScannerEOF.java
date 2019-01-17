/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 2126081
 */
public class ScannerEOF {
    
    public static void main(String[] args) {
        ScannerEOF l = new ScannerEOF();
        Scanner entradaEscaner = new Scanner (System.in); 
        ArrayList<String> texto = new ArrayList<String>();
        String frase= entradaEscaner.nextLine();
        texto.add(frase);
        while (!frase.isEmpty()){
            frase= entradaEscaner.nextLine();
            texto.add(frase);
        }
        
        for (int i = 0; i < (texto.size())-1; ++i) {
            System.out.println((i+1)+" "+texto.get(i));
        }
        
         
        
    }
    
}
