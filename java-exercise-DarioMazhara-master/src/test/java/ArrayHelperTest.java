import org.junit.Assert;
import org.junit.Test;
import practiceArrays.ArrayHelper;

import java.util.ArrayList;
import java.util.List;

public class ArrayHelperTest {

    @Test
    public void testFindTwoLargest() {
        int[] arr = {8, 3, 7, 1, 9, 6};
        int[] actual = ArrayHelper.findTwoLargest(arr); // the test checks if your code returns an array with 1 and 3.
        int[] expected = {9, 8};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testThreshold() {
        int[] arr = {8, 3, 6, 1, 9, 7};
        boolean actual = ArrayHelper.threshold(arr, 10);
        Assert.assertEquals(actual, true); // your code should return true since all elements of the array are greater than 10

        boolean actual1 = ArrayHelper.threshold(arr, 7);
        Assert.assertEquals(actual1, false); // your code should return false since not all elements of the array are greater than 7
    }

    @Test
    public void testCountOccurrences() {
        int[] arr = {8, 1, 3, 6, 1, 9, 3, 7, 3, 9, 23, 1, 1};
        int count1 = ArrayHelper.countOccurrences(arr, 1);
        Assert.assertEquals(count1, 4); // your code should say 1 occurs 4 times

        int count3 = ArrayHelper.countOccurrences(arr, 3);
        Assert.assertEquals(count3, 3); // your code should say 3 occurs 3 times

        int count9 =  ArrayHelper.countOccurrences(arr, 9);
        Assert.assertEquals(count9, 2); // your code should say 9 occurs 2 times
    }

    @Test
    public void testIntersection() {
        int[] arr1 = {8, 1, 5, 3, 2, 6};
        int[] arr2 = {5, 12, 4, 11, 1, 9, 3};

        int[] actual = ArrayHelper.printIntersection(arr1, arr2);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < actual.length; i++)
            list.add(actual[i]);

        Assert.assertTrue(list.contains(1));
        Assert.assertTrue(list.contains(5));
        Assert.assertTrue(list.contains(3));
    }

}
