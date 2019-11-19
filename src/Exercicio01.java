public class Exercicio01 {
    public static void main (String[] args){
        int umNumeroA = 5;
        double umNumeroB = 25;
        String umaCadeiaDeTexto = "Hello World!";

        System.out.println("O valor da variavel umNumeroA e: " + umNumeroA);
        System.out.println("O valor da variavel umNumeroB e: " + umNumeroB);
        System.out.println("O valor da variavel umaCadeiaDeTexto e: " + umaCadeiaDeTexto);
        System.out.println("A somatoria e: " + soma(umNumeroA, umNumeroB));
        System.out.println("A diferenca e: " + diferenca(umNumeroA, umNumeroB));
    }

    public static double soma (int numeroA, double numeroB){

        return numeroA + numeroB;
    }

    public static double diferenca (int numeroA, double numeroB){

        return numeroA - numeroB;
    }


}


