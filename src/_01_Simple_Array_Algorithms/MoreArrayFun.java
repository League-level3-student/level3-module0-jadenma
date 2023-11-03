package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public String allStrings(String[] strings) {
		String all = null;
		for (int i = 0; i<strings.length; i++) {
			all = all + strings[i];
		}
		return all;
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public String reverseStrings(String[] arr) {
		String reverse = null;
		for (int i=arr.length; i>=0; i--) {
			reverse = reverse + arr[i];
		}
		return reverse;
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public String otherString(String[] array) {
		String other = null;
		for (int i = 0; i<array.length; i++) {
			if (i%2 == 0) {
				other = other+array[i];
			}
		}
		return other;
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	Random ran = new Random();
	public String randomOrder(String[] stringArr) {
		String random = null;
		for (int i = 0; i<stringArr.length; i++) {
			random = random + stringArr[ran.nextInt(i)];
		}
		return random;
	}

}
