package assignment_2;

import java.util.*;
public class LongestIncreasingSubsequence {
	private static int findLengthOf(int[] a) {
		int n = a.length;
		int[] LI = new int[n];
		int subsequence = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			LI[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j] && LI[i] < LI[j] + 1) 
					LI[i] = LI[j] + 1;
				
			}
			if (subsequence < LI[i]) {
				subsequence = LI[i];
			}
		}

		return subsequence;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of the array :");
		int n = sc.nextInt();
		System.out.println("Enter array Element :");
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		sc.close();

		System.out.println("Total Length of LIS:"+findLengthOf(a));
			
	}


}