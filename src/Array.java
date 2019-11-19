import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main (String[] args){
        List<String> nomesAlunos = new ArrayList<>();

        String nome01 = "Jessica";
        nomesAlunos.add(nome01);

        String nome02 = "Joao";
        nomesAlunos.add(nome02);

        String nome03 = "Inghridy";
        nomesAlunos.add(nome03);

        String nome04 = "Fernanda";
        nomesAlunos.add(nome04);

        System.out.println(nomesAlunos.get(1));
        System.out.println(nomesAlunos);

        for (int i = 0; i < nomesAlunos.size(); i++){
            System.out.println(nomesAlunos.get(i));
        }

    }

}

