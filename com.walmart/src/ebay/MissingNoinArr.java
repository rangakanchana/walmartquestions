package com.arrays;

public class MissingNoinArr {
	//method to calculate sum of n numbers
	public static int sumOfNum(int n){
		int sum=(n*(n+1))/2;
		return sum;
	}
	//method to calculate sum of all elements in array
	public static int sumOfArr(int[]arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int n =7;
		int []a={1,2,3,4,5,7};
		int sumOfNum = sumOfNum(n);
		int sumOfArr = sumOfArr(a);
		int missingno=sumOfNum-sumOfArr;
		System.out.println("the missing number of a given array is "+missingno);
}
}
