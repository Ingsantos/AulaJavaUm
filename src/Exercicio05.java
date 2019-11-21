import java.util.ArrayList;
import java.util.List;

public class Exercicio05 {

    public static void main (String[] args){

        List<Integer> valoresNumericos = new ArrayList<>();

        Integer numeroA = 10;
        valoresNumericos.add(numeroA);

        Integer numeroB = 3;
        valoresNumericos.add(numeroB);

        Integer numeroC = 30;
        valoresNumericos.add(numeroC);

        Integer numeroD = 40;
        valoresNumericos.add(numeroD);

        int soma = 0;

        for (int i = 0; i < valoresNumericos.size(); i++) {

            if (valoresNumericos.get(i) % 2 == 0) {

                soma = soma + valoresNumericos.get(i);
            }
        }

        System.out.println(soma);

    }
}
