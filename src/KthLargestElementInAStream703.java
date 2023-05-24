import java.util.PriorityQueue;

public class KthLargestElementInAStream703 {
    public static void main(String[] args) {
    }

    final PriorityQueue<Integer> pq;
    final int k;

    public KthLargestElementInAStream703(int k, int[] nums) {
        this.k = k;
        this.pq = new PriorityQueue<>(k);
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (k > pq.size()) {
            pq.add(val);
        } else if (pq.peek() < val) {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}


//first sol

//    private int[] nums;
//    // we need only nums[k]. there are 2 cases: k > nums.length or k <= nums.length
//    public KthLargestElementInAStream703(int k, int[] nums) {
//        this.nums = new int[k];
//        Arrays.sort(nums);
//        int lastIndex = 0;
//        int j = nums.length - 1;
//
//        if (k > nums.length) {
//            lastIndex = nums.length;
//            for (int i = 0; i < lastIndex; i++) {
//                this.nums[i] = nums[j];
//                j--;
//            }
//            for (int i = lastIndex; i < k; i++) {
//                this.nums[i] = -999999;
//            }
//        } else {
//            lastIndex = k;
//            for (int i = 0; i < lastIndex; i++) {
//                this.nums[i] = nums[j];
//                j--;
//            }
//        }
//    }
//
//    public int add(int val) {
//        Arrays.sort(this.nums);
//
//        if (val > this.nums[0]) {
//            this.nums[0] = val;
//            Arrays.sort(this.nums);
//        }
//        return this.nums[0];
//    }
