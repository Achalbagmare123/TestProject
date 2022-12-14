package org.main.question4;

import java.util.Scanner;


	import java.util.HashMap;

	import java.util.Scanner;
	import java.util.Map;
	import java.util.Scanner;

	public class ArrayIndices {
		private static int[] TwoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[] { i, j };
	                }
	            }
	        }

	        return new int[] {};
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Array Size :");
	        int n = scanner.nextInt();
	        int[] nums = new int[n];

	        System.out.println("Enter Array Element :");
	        for(int i = 0; i < n; i++) {
	            nums[i] = scanner.nextInt();
	        }

	        System.out.print("Enter Target :");
	        int target = scanner.nextInt();

	        scanner.close();

	        int[] indices = TwoSum(nums, target);

	        if (indices.length == 2) {
	            System.out.println(indices[0] + " " + indices[1]);
	        } else {
	            System.out.println("Solution not found!");
	        }
	    }
	}

