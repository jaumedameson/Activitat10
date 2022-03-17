package activitat10.m5;

public class Metodes {

    public static void partSuperior(int i, String M) {
        //Imprime espacios de la primera parte para el primer triangulo 
        for (int j = 0; j < i; ++j) {
            System.out.print(" ");
        }
        //Imprime el primer triangulo de la primer parte 
        for (int j = i; j < M.length(); ++j) {
            System.out.print(M.charAt(j));
        }
        //Imprime espacios entre el primero y segundo triangulo de la primera parte
        for (int j = i; j < M.length(); ++j) {
            System.out.print(" ");
        }
        //Imprime el segundo triangulo de la primera parte
        for (int j = M.length() - i - 1; j < M.length(); ++j) {
            System.out.print(M.charAt(j));
        }
        System.out.println();
    }

    public static void partInferior(int i, String M) {
        //Imprime primer triangulo de la segunda parte
        for (int j = i; j < M.length(); ++j) {
            System.out.print(M.charAt(j));
        }
        //Imprime espacios entre primer y segundo triangulo
        for (int j = 0; j <= i; ++j) {
            System.out.print(" ");
        }
        //Imprime segundo triangulo de la segunda parte  
        for (int j = 0; j < i + 1; ++j) {
            System.out.print(M.charAt(j));
        }
        System.out.println();
    }

}
