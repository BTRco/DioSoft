package arraysToLeft;

public class ArrayMainClass {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 4, 23, 65, 32, 78};
        int[] array2 = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedResult = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};
        ArraysToLeft union = new ArraysToLeft();
        union.arrayOutput(array1);
        union.arrayOutput(array2);
        int[] unionArray = union.leftUnion(array1, array2);
        union.arrayOutput(unionArray);
        System.out.println(union.testResult(unionArray, expectedResult));
    }
}
