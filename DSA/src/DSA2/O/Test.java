package DSA2.O;

public class Test {
        public static int[] twoSum(int[] numbers, int target) {
            int n = numbers.length;
            int left = 0;
            int right = n-1;
            while(left < right){
                if (numbers[left] + numbers[right] > target) {
                    right--;
                }
                else if (numbers[left] + numbers[right] < target){
                    left++;
                }
            }
            return new int[]{left,right};
        }

    static void main(String[] args) {
            int[] numbers = {2,7,11,15};
        System.out.println(twoSum(numbers, 9).toString());
        String s = "fdgdfgd";

    }
}
