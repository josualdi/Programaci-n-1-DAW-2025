public class Ejercicio29 {
    public static void main(String[] args) {
        int[] numeros = new int[50];

        for (int i = 0; i < 50; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }

        System.out.println("Array original:");
        for (int i = 0; i < 50; i++) {
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < 49; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < 50; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int temp = numeros[i];
            numeros[i] = numeros[indiceMenor];
            numeros[indiceMenor] = temp;
        }

        System.out.println("\n\nArray ordenado:");
        for (int i = 0; i < 50; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
