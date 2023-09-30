package chibuzorAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionArrayTest {
    @Test
    public void testLargestNumber(){
        int [] array = {1,2,10,4,5,3};
        int result = FunctionArray.largestFunction(array);
        assertEquals(10,result);
    }
   @Test
   public void testReverse(){
        int [] array = {1, 2, 3, 4, 5};
        int [] result = FunctionArray.reverse(array);
        int [] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected,result);
    }

    @Test
    public void testFirstSum(){
        int result = FunctionArray.sumOfNumbers(new int[]{1,2,3,4});
        assertEquals(10,result);
    }

    @Test
    public void testSecondSum(){
        int result = FunctionArray.SumOfNumber2(new int[] {10,4});
        assertEquals(14,result);
    }
    @Test
    public void testThirdSum(){
        int result = FunctionArray.sumOfDigit3(new int[]{1, 2, 3, 4});
        assertEquals(10,result);
    }
    @Test
    public void testElementOccurrence(){
        int [] array = {1,3,4,5};
        Boolean result = FunctionArray.elementOccurrence(array,2);
        assertFalse(result);
    }
    @Test
    public void testOddPosition(){
        int [] array = {10,50,5,40,9};
        int [] result = FunctionArray.oddPosition(array);
        int [] expected  = {10,0,5,0,9};
        assertArrayEquals(expected,result);
    }
    @Test
    public void testEvenPosition(){
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] result = FunctionArray.evenPosition(array);
        int [] expected = {0,2,0,4,0,6,0,8,0,10};
        assertArrayEquals(expected,result);

    }
    @Test
    public void testStringPalindrome(){
        String [] array = {"d","a","m","o","l","a"};
        String result = FunctionArray.palindrome(array);
        assertEquals(" not a palindrome",result);

    }
    @Test
    public void testCocatinatingTwoArrays(){
        String [] array = {"1","2","3","4"};
        String [] array2 = {"a","b","c"};
        String [] result = FunctionArray.combinedWord(array,array2);
        String [] expected = {"1","2","3","4","a","b","c"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void testCocatinatingInBetween(){
        String [] array = {"1","2","3","4"};
        String [] array2 = {"a","b","c","d"};
        String [] result = FunctionArray.cocatinatingInBetween(array,array2);
        String [] expected = {"1","a","2","b","3","c","4","d"};
        assertArrayEquals(expected,result);
    }
    @Test
    public void testNumbersToArray(){
        String numbers = ("2345");
        int [] result = FunctionArray.digitToList(numbers);
        int [] expected = {2,3,4,5};
        assertArrayEquals(expected,result);


    }
}