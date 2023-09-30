package chibuzorAssignment;

import java.util.Arrays;

public class FunctionArray {


    public static int largestFunction(int[] number) {
        int maximum = number[0];
        for(int numbs = 0; numbs < number.length;numbs++){
            if(number[numbs] > maximum){
                maximum = number[numbs];
            }
        }
        return  maximum;
    }

    public static  int [] reverse(int[] numbers) {
        int [] result = new int[numbers.length];
        int index = 0;
           for( int number = numbers.length - 1; number >= 0 ; number --){
              result[number] = numbers[index];
              index = index +1;
           }

        return result;
    }

    public static int [] oddPosition(int [] numbers){
       int [] result = new int[numbers.length];
        for(int number = 0; number < numbers.length;number = number + 2){
             result[number] = numbers [number];
        }
        return result;
    }
    public static int [] evenPosition(int [] numbers){
        int [] result = new int[numbers.length];
        for(int number = 1; number < numbers.length;number = number +2){
            result[number] = numbers [number];
        }
        return result;
    }
    public static String  palindrome(String [] letters){
        String [] words = new String[letters.length];
        String answer = " ";
        int index = 0;
        for(int number = letters.length-1; number >= 0; number --){
            words[number] = letters[index];
            index += 1;
        }
        if(Arrays.equals(words, letters)){
            answer = "it is a palindrome";
        }
        else{
            answer = " not a palindrome";
        }
        return  answer;
    }
    public static int runningTotal(int[] numbers){
        int result = 0;
        for(int count = 0; count < numbers.length ; count++){
            result += numbers[count];
        }
        return result;

    }
    public static String [] numbers(String [] numbs,String [] word) {
        int result = numbs. length + word.length;
        String [] result2 = new String[result];
        int count = 0;
        for(int numbers = 0; numbers < numbs.length; numbers++) {
            result2[count] = numbs[numbers];
            count++;
            for (int number = 0; number < word.length; number++) {
                result2[count] = word[numbers];
                count++;

            }
        }
        return result2;
    }
    public static int sumOfNumbers(int [] number){
        int result = 0;
        for(int count = 0; count < number.length;count++){
            result += number[count];
        }
        return result;
    }
    public static int SumOfNumber2(int [] number){
        int result = 0;
        int count = 0;
        while(count < number.length){
            result += number[count];
            count++;
        }
        return result;
    }
    public static int sumOfDigit3(int [] number){

        int result = 0;
        int count = 0;
        do {
            result += number[count];
            count ++;
        }while (count < number.length) ;
        return result;
    }
    public static String []  combinedWord(String []  number,String [] number2) {
        int result2 = number.length + number2.length ;
        String[] value = new String[result2];
        int counts = 0;
        for (int counter = 0; counter < number.length; counter++ ){
            value[counts] = number[counter];
              counts++;
    }
        for(int count = 0; count < number2.length;count++){
            value[counts] = number2[count];
            counts++;
        }



            return value;
    }
    public static  int [] digitToList(String numbers){
        String total = String.valueOf(numbers.length());
        int result = Integer.parseInt(total);
        int product = 1;
        for(int count = 1; count < result ;count ++){
            product *= 10;
        }
        int number = Integer.parseInt(numbers);
        int firstNumber = number / product;
        int product2 = product / 10;
        int count = 0;
        int [] value = new int[result];
        value[0] = firstNumber;
            for(int counter = 1; counter < result;counter ++){
                count = number / product2 % 10;
                value[counter] = count;
                product2 /= 10;
        }
        return value;
    }
    public static Boolean elementOccurrence(int [] numbers,int number){
        Boolean result = false;
        for(int count = 0; count < numbers.length;count ++){
            if(numbers[count] == number){
                result = true;
            }
        }
        return result;

    }






    public static void main(String[] args){
       int [] number = {20,10,45,85,5,6,9};
       int [] number2 = reverse(number);
        System.out.println(Arrays.toString(number2));
       int [] result = oddPosition(number);
        System.out.println(Arrays.toString(result));
        int [] even = evenPosition(number2);
        System.out.println(Arrays.toString(even));
        String [] name = {"l","o","l"} ;
        String result5 = palindrome(name);
        System.out.println(result5);
        int total = runningTotal(number);
        System.out.println(total);
        String []  number3 = {"a","b","c","d"};
        String [] number4  = {"1","2","3","4"};
        String []   answer = numbers(number3,number4);
        System.out.println(Arrays.toString(answer));
        String []  number5 = {"a","b","c"};
        String [] number6  = {"1","2","3"};
        String   []answer2 = combinedWord(number5,number6);
        System.out.println(Arrays.toString(answer2));
        String numbersss = "23564";
        int [] result16 = digitToList(numbersss);
        System.out.println(Arrays.toString(result16));
        int [] array = {1,2,3,4};
        boolean elementResult = elementOccurrence(array,2);
        System.out.println(elementResult);



    }


}

