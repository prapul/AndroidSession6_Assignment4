package prapul;

import java.util.Scanner;

public class AndroidSession6_Assignment4 {
	public static void main(String[] args) {
		int array[] = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		System.out.println("Enter the positive number to be searched below 6 ");
		Scanner InputNumber = new Scanner(System.in);
		int num = InputNumber.nextInt();
		int ReturnedValue = BinarySearch(array,0,array.length-1,num);
System.out.println("The element"+num+" is found at index number "+ReturnedValue+" of the sorted array");
InputNumber.close();
	}

	public static int BinarySearch(int[] L, int low, int high, int k) {
		int mid = (low + high) / 2;
		if (L[mid] == k) {
			return mid;
		}
		else if (L[mid]<k){
			return BinarySearch(L,mid+1,high,k);
		}
		else{
			return BinarySearch(L,low,mid-1,k);
		}
	}
}