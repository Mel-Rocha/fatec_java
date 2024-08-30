import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.printf("Hello and welcome!\n");

        // Create an array of student names
        String[] listaAluno = new String[5];

        // Populate the array with student names
        listaAluno[0] = "João";
        listaAluno[1] = "Maria";
        listaAluno[2] = "Davi";
        listaAluno[3] = "Braian";
        listaAluno[4] = "Jason";

        // Loop through the array and print each name
        for (String aluno : listaAluno) {
            System.out.println(aluno);
        }

        // Create and populate an array of city names
        String[] listaCidades = {"Póa", "Itu", "Suzano"};

        // Loop through the array and print each city
        for (String cidade : listaCidades) {
            System.out.println(cidade);
        }

        // Loop through the listaAluno array and print the index with the element
        for (int i = 0; i < listaAluno.length; i++) {
            System.out.println("Elemento " + i + ": " + listaAluno[i]);
        }

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        System.out.println("O tambaho é: " +array.length);

        int[] copia = array.clone();
        String[] copia_cidade = listaCidades.clone();

        System.out.println("Copia do array: " + Arrays.toString(copia));

        int[] copia_sel = Arrays.copyOf(array, 3);

        int posicao = Arrays.binarySearch(listaCidades, "Itu");
        System.out.println("Posição do elemento: " + posicao);
    }
}
