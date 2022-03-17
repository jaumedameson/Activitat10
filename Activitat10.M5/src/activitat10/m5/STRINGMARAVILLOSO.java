
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat10.m5;

import static activitat10.m5.Metodes.*;

public class STRINGMARAVILLOSO{
    public static void main(String[] args){
        String M = "MARAVILLOSO";
        
 
        //Imprime los primeros dos triangulos de izq a derecha de la primera parte (parte superios)
        for (int i =0; i<M.length();i++){
            partSuperiorEspaisT1(i);
            partSuperiorTriangle1(i, M);
            partSuperiorEspaisT2(i, M);
            partSuperiorTriangle2(i, M);
        }
        //Imprime los segundos dos triangulos de izq a derecha de la segunda parte (parte inferior)
        for (int i =0; i<M.length();i++){
            //Imprime primer triangulo de la segunda parte
            for (int j= i; j<M.length(); ++j){
                System.out.print(M.charAt(j));
            }
            //Imprime espacios entre primer y segundo triangulo
            for (int j=0; j <= i ;++j){
                System.out.print(" ");
            }
            //Imprime segundo triangulo de la segunda parte  
            for(int j=0; j < i + 1; ++j){
                System.out.print(M.charAt(j));
            }
            System.out.println();
        }
    }    
}