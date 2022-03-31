package REFACTOR;

import java.util.Scanner;

public class array1 {
	/**
	 * main
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
				"Đề bài: Viết chương trình Java nhập một mảng số "
				+ "nguyên a0, a1, a2,..., an-1. "
				+ "Hãy sắp xếp mảng theo thứ tự tăng dần");

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số phần tử của mảng: ");
		
		int n = scanner.nextInt();
		// khởi tạo arr
		int[] arr = new int[n];
		
		System.out.print("Nhập các phần tử của mảng:\n");

		input(scanner, n, arr);
		
		// sắp xếp dãy số theo thứ tự tăng dần
		int temp = arr[0];
		
		sort(arr);
		
		output(arr);
	}

	private static void output(int[] arr) {
		System.out.println("Dãy số được sắp xếp tăng dần:");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void input(Scanner scanner, int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = scanner.nextInt();

		}
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
