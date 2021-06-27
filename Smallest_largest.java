package org.arpit.java2blog;
/*
Java program to Find Largest and Smallest Number in an Array 
*/
public class FindLargestSmallestNumberMain {
 
 public static void main(String[] args) {
 
 //array of 10 numbers
 int arr[] = arr[0];
 int smallest = arr[0];
 int largest = arr[0];
 
 for(int i=1; i< arr.length; i++)
 {
 if(arr[i] > largest)
 largest = arr[i];
 else if (arr[i] < smallest)
 smallest = arr[i];
 
 }
 System.out.println("Smallest Number is : " + smallest);
 System.out.println("Largest Number is : " + largest); 
 }
}
 
