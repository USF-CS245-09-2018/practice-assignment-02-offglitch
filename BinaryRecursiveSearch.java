public class BinaryRecursiveSearch implements Practice2Search {

	public BinaryRecursiveSearch() {

	}

	

	public String searchName() {

		return "Recursive Binary Search";

	}

	

	public int search(int[] arr, int target) {

		search(arr, target, 0, arr.length - 1);

		return 0;

	}

	public int search(int[] arr, int target, int lowerIndex, int higherIndex) {

		if (higherIndex >= lowerIndex) {

			int mid = lowerIndex + (higherIndex - lowerIndex) / 2;

			// If the element is present at the middle itself

			if (arr[mid] == target)

				return mid;

			// If element is smaller than mid, then it can only be present in left subarray

			if (arr[mid] > target)

				return search(arr,target,lowerIndex, mid - 1);

			// Else the element can only be present in right subarray

			return search(arr,target, mid + 1, higherIndex);

		}

		// We reach here when element is not present in array

		return -1;

	}

}