public class BinarySearch704 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
    }

    public static int search(int[] nums, int target) {
//        int index = Arrays.binarySearch(nums, target);
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = (low + high) >>> 1; //bitwise right shift operator it means the same as floor(low+high) / 2

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // we can use as well -low-1
    }
}
