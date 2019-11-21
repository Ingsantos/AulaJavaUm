public class Exercicio03 {

    public static void main (String [] args){

        int numeroA = 15;

        System.out.println(imparmaior(numeroA));

    }

    public static boolean imparmaior (int umNumero){

        return umNumero%2 != 0 && umNumero > 10;
    }
}
