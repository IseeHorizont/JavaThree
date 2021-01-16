import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // task 1
    public static<T> void swapTwoElementOfArray(T[] arr, int firstElement, int secondElement){
        T tmp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = tmp;
    }

    // task 2
    public static <T> ArrayList<T> convertToArrayList(T[] arr){
        ArrayList<T> list = new ArrayList<>(Arrays.asList(arr));

        return list;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"apple", "bird", "cat", "duck"};
        swapTwoElementOfArray(arr, 0, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Double[] secondArray = new Double[]{4.14, 7.88, 4.0, 33.12};
        swapTwoElementOfArray(secondArray, 0, 1);

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }

        System.out.println();

        System.out.println(convertToArrayList(secondArray));

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> boxForApple = new Box();
        boxForApple.addInBox(apple1);
        boxForApple.addInBox(apple2);
        boxForApple.addInBox(apple3);

        Box<Orange> boxForOrange = new Box();
        boxForOrange.addInBox(orange1);
        boxForOrange.addInBox(orange2);
        boxForOrange.addInBox(orange3);

        System.out.print("Коробка с яблоками: ");
        boxForApple.printContentOfBox();
        System.out.println("Вес: " + boxForApple.getWeightOfBox());
        System.out.println();
        System.out.print("Коробка с апельсинами: ");
        boxForOrange.printContentOfBox();
        System.out.println("Вес: " + boxForOrange.getWeightOfBox());

        // сравнение коробок
        System.out.println();
        System.out.println(boxForApple.compareBoxes(boxForOrange));

        // пересыпка коробок
        System.out.println();
        boxForApple.addInOtherBox(boxForOrange);

        // тест объединения коробок на новой яблочной коробке
        Box<Apple> secondBoxOfApple = new Box<>();
        secondBoxOfApple.addInBox(new Apple());
        secondBoxOfApple.addInBox(new Apple());
        boxForApple.addInOtherBox(secondBoxOfApple);
    }

}
