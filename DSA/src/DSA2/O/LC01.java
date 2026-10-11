package DSA2.O;

import java.util.HashMap;

public class LC01 {
    static int solution(int[] nums, int target){
        int FMax =0;
        int SMax =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > FMax){
                SMax = FMax;
                FMax=Math.max(FMax,nums[i]);
            }
            else if (SMax < nums[i] && nums[i] < FMax) {
                SMax = Math.max(SMax,nums[i]);
            }

        }
        return SMax;
    }



    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int target = 9;
        System.out.println(solution(arr, target));
    }
}
