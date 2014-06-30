package secondTask;

public class TestSecondTask {
    public static void main(String[] args) {
        int[] array1 = new int[0];
        int[] array2 = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        OuterUnion outerUnion = new OuterUnion();
        int[] a = outerUnion.outerUnion(array1, array2);
        outerUnion.arrayOutput(a);
    }
}
