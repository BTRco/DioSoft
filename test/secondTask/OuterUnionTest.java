package secondTask;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OuterUnionTest {

    private OuterUnion testClass;

    @Before
    public void setup() {
        testClass = new OuterUnion();
    }

    @Test
    public void testOuterUnion_LeftArrayIsEmpty() throws Exception {
        //initialize variable inputs
        int[] array1 = new int[0];
        int[] array2 = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedResult = {3, 5, 24, 4, 1, 2, 34, 45, 32};

        //in. mocks

        //in. class to test


        //invoke method on class to test
        int[] returnedValue = testClass.outerUnion(array1, array2);

        //assert return value
        assertArrayEquals(expectedResult, returnedValue);


        //verify mock expectations


    }

    @Test
    public void testOuterUnion_RightArrayIsEmpty() throws Exception {
        //initialize variable inputs
        int[] array1 = {1, 5, 4, 23, 65, 32, 78};
        int[] array2 = new int[0];
        int[] expectedResult = {1, 5, 4, 23, 65, 32, 78};

        //in. mocks

        //in. class to test


        //invoke method on class to test
        int[] returnedValue = testClass.outerUnion(array1, array2);

        //assert return value
        assertArrayEquals(expectedResult, returnedValue);


        //verify mock expectations


    }

    @Test
    public void testOuterUnion_LeftArrayIsNull() throws Exception {
        //initialize variable inputs
        int[] array1 = null;
        int[] array2 = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] expectedResult = {3, 5, 24, 4, 1, 2, 34, 45, 32};

        //in. mocks

        //in. class to test


        //invoke method on class to test
        int[] returnedValue = testClass.outerUnion(array1, array2);

        //assert return value
        assertArrayEquals(expectedResult, returnedValue);


        //verify mock expectations


    }

    @Test
    public void testOuterUnion_RightArrayIsNull() throws Exception {
        //initialize variable inputs
        int[] array1 = {1, 5, 4, 23, 65, 32, 78};
        int[] array2 = null;
        int[] expectedResult = {1, 5, 4, 23, 65, 32, 78};

        //in. mocks

        //in. class to test


        //invoke method on class to test
        int[] returnedValue = testClass.outerUnion(array1, array2);

        //assert return value
        assertArrayEquals(expectedResult, returnedValue);


        //verify mock expectations


    }

}