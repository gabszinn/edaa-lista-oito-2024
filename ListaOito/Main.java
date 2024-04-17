import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File getCSVFiles = new File("estudantes_una_2024.csv");
        Scanner sc = new Scanner(getCSVFiles);
        List<String> alunosList = new ArrayList<>();
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            alunosList.add(sc.next());
        }
        sc.close();
        
        
        System.out.println("Nomes em ordenação:");
        Collections.sort(alunosList);
        for (String nome : alunosList) {
            System.out.println(nome);
        }
    }
}

