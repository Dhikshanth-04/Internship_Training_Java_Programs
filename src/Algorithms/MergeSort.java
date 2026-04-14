package Algorithms;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Sorting");
		for(int i: arr) {System.out.print(i+" ");}
		
		mergeSort(arr,0,n-1);
        System.out.println("\nAfter Sorting");
        for(int i: arr) {System.out.print(i+" ");}
	}
	public static void mergeSort(int[] arr, int l, int r) {
		// Recursively calling the same function to break down the array into smaller parts
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			
			merge(arr, l, mid, r);//Once broke down, merge them into one array
		}
	}
	public static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int[] lArr = new int[n1];
		int[] rArr = new int[n2];
		
		for(int i=0; i<n1; i++) {
			lArr[i] = arr[l+i];
		}
		for(int i=0; i<n2; i++) {
			rArr[i] = arr[mid+1+i]; 
		}
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i<n1 && j<n2) {
			if(lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}
			else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
	}
}