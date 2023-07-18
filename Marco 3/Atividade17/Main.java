
public class Main {
    public static void main(String[] args) {
        Ordena ordena = new Ordena();

        int[] array2 = { 51, 57, 98, 19, 11, 45, 79 };
        ordena.quickSort(array2);
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] + " ");
    }

}