package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        System.out.println("Работы с одномерными массивами");
        int[] array1;
        array1 = new int[5];
        array1[1] = 1;
        array1[4] = 10;
        int[] array2 = array1;
        System.out.print("array1 = ");
        System.out.print("[");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        System.out.print("array2 = ");
        System.out.print("[");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("Добавление ячейки в существующий массив");
        int[] newArray1 = new int[7];
        for (int i = 0; i < array1.length; i++) {
            newArray1[i] = array1[i];
        }
        System.out.print("newArray1 = ");
        System.out.print("[");
        for (int i = 0; i < newArray1.length; i++) {
            System.out.print(newArray1[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("Использование метода arraycopy() из класса System.");
        int [] newArray2 = new int[7]; //7 cells
        System.arraycopy(array2, 0, newArray2, 0, array2.length);//woher array2, wohin newArray2, all length of array2
        System.out.print("newArray2 = ");
        System.out.print("[");
        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        System.out.println("Использование класса Arrays.");
        Arrays.fill(array1, 0, 4, 3);
        System.out.print("array1 = ");
        System.out.print("[");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        Arrays.fill(newArray1, 0, 5, 3);
        Arrays.fill(newArray1, 4, 7, 30);
        
        System.out.print("newArray1 = ");
        System.out.print("[");
        for (int i = 0; i < newArray1.length; i++) {
            System.out.print(newArray1[i]);
            System.out.print(", ");
        }
        System.out.println("]");
        
        Arrays.fill(newArray1, 0, 5, 3);
        Arrays.fill(newArray1, 4, 7, 30);
        System.out.print("newArray1 = ");
        System.out.println("Использование класса Arrays.toString" +Arrays.toString(newArray1));
        
        
        System.out.println("Сравнение двух массивов");
        System.out.println("array1 равен array2: "+Arrays.equals(array1, array2));
        System.out.println("newArray1 равен newArray2: "+Arrays.equals(newArray1, newArray2));
    }
}
