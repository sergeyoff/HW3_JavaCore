package HW3_JavaCore.Task1;

import java.util.Arrays;
public class main {
    public static void main(String[] args) {

            Integer[] Array1 = {10, 11, 12, 13};
        System.out.print("Первоначальный  массив: ");
        System.out.println(Arrays.toString(Array1));
        ChangeArrElements(Array1, 1, 2);
        System.out.print("Массив после перестановки: ");
        System.out.println(Arrays.toString(Array1));
        String[] Array2 = {"Десять", "Одиннадцать", "Двенадцать", "Тринадцать"};
        System.out.print("Первоначальный  массив: ");
        System.out.println(Arrays.toString(Array2));
        ChangeArrElements(Array2, 1, 2);
        System.out.print("Массив после перестановки: ");
        System.out.println(Arrays.toString(Array2));

        }
    public static <T> void ChangeArrElements(T[] modifiableArray, int element1, int element2) {
        T backupElement = modifiableArray[element1];
        modifiableArray[element1] = modifiableArray[element2];
        modifiableArray[element2] = backupElement;
    }


}
