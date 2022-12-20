package Search.BinarySearch;

import static Search.BinarySearch.BinarySearch.binarySearch;
import static Search.BinarySearch.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list,79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }

}
