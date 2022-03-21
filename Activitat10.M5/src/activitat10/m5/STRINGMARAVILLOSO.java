
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
        
        System.out.println("LA versió que tenim a github ha estat actualitzada i és més actual que la que tinc en local");
        System.out.println("El següent codi crea 4 triangles equil·làters amb la paraula 'Maravilloso'");
        System.out.println("");
        
        //Imprime los primeros dos triangulos de izq a derecha de la primera parte (parte superios)
        for (int i =0; i<M.length();i++){
            partSuperior(i, M);
        }
        //Imprime los segundos dos triangulos de izq a derecha de la segunda parte (parte inferior)
        for (int i =0; i<M.length();i++){
            partInferior(i, M);
        }
    }    
}
