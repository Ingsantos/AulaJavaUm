import java.util.ArrayList;
import java.util.List;

public class Exercicio06 {

    public static void main (String [] args){

        List<Integer> valoresNumericos = new ArrayList<>();

        Integer numeroA = 10;
        valoresNumericos.add(numeroA);

        Integer numeroB = 3;
        valoresNumericos.add(numeroB);

        Integer numeroC = 30;
        valoresNumericos.add(numeroC);

        Integer numeroD = 13;
        valoresNumericos.add(numeroD);

        List<Integer> valoresPares = new ArrayList<>();

        //int auxiliar;

        for( int i = 0; i < valoresNumericos.size(); i++){

            if (valoresNumericos.get(i)%2 == 0){

                //auxiliar = valoresNumericos.get(i);
                valoresPares.add(valoresNumericos.get(i));
            }
        }

        for(int j = 0; j < valoresPares.size(); j++){

            System.out.println(valoresPares.get(j));
        }
    }
}
