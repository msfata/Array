package com.array;

public class Array {

	/* int */
	public static int removeDuplicate(int... array) {

		int arrSize = array.length;
		for (int i = 0; i < arrSize; i++) {
			for (int j = i + 1; j < arrSize; j++) {
				if (array[i] == array[j]) {
					array[j] = array[arrSize - 1];
					arrSize--;
					j--;
				}
			}
		}

		int sorted[] = new int[arrSize];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = array[i];
		}
		String temp = "";
		int outPut;
		for (int i : sorted)
			temp += i;
		outPut = Integer.parseInt(temp);
		return outPut;
	}

	/* String */
	public static String removeDuplicate(String... array) {
		int arrSize = array.length;
		for (int i = 0; i < arrSize; i++) {
			for (int j = i + 1; j < arrSize; j++) {
				if (array[i] == array[j]) {
					array[j] = array[arrSize - 1];
					arrSize--;
					j--;
				}
			}
		}

		String sorted[] = new String[arrSize];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = array[i];
		}
		String outPut = "";
		for (String i : sorted) {
			outPut += i + " ";
		}
		return outPut;
	}

	/* char */
	public static String removeDuplicate(char... array) {
		String result = "";
		int arrSize = array.length;
		for (int i = 0; i < arrSize; i++) {
			for (int j = i + 1; j < arrSize; j++) {
				if (array[i] == array[j]) {
					array[j] = array[arrSize - 1];
					arrSize--;
					j--;
				}
			}
		}

		int sorted[] = new int[arrSize];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = array[i];
		}

		for (char i = 0; i < sorted.length; i++) {
			result += array[i];
		}
		return result;
	}
}
