import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manipulations manipulation = new Manipulations();

        //Задача 1
        System.out.println("Задача 1");
        List<Integer> nums1 = new ArrayList<>(List.of(5, 1, 2, 6, 1, 4, 5, 2, 10, 7));
        System.out.println(manipulation.removeEvenNumbers(nums1).toString());

        //Задача 2
        System.out.println("Задача 2");
        List<Integer> nums2 = new ArrayList<>(List.of(20,5, 1, 2, 6, 1, 4,3,9,15, 5, 2, 10, 7));
        System.out.println(manipulation.makeEvenOrdered(nums2).toString());


        //Задача 3
        System.out.println("Задача 3");
        List<String> strings3 = new ArrayList<>(List.of("один","один","один", "два","два", "три", "три", "три"));
        System.out.println(manipulation.removeDuplicates(strings3).toString());





        //Задача 4
        System.out.println("Задача 4");
        List<String> strings4 = new ArrayList<>(List.of("один","один","один", "два","два", "три", "три", "три"));

        System.out.println(manipulation.countNumberOfOccurrences(strings4).toString());

    }



}



