package arrays;

public class LongestSubsequence {

    private int number;

    private int[] arr;

    public LongestSubsequence(int number, int[] arr){
        this.number = number;
        this.arr = arr;
    }

    public int getSubsequenceLength(){

        int count = 0;
        int maxCount = 0;
        for(int entry: this.arr){
            if(entry == number){
                count++;
            }
            else{
                if(count > maxCount){
                    maxCount = count;
                    count = 0;
                }
            }

        }
        return maxCount > count ? maxCount : count;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubsequence(1, new int[]{1,1,1, 0,0,0,1,1}).getSubsequenceLength());
        System.out.println(new LongestSubsequence(1, new int[]{1,1}).getSubsequenceLength());
        System.out.println(new LongestSubsequence(1, new int[]{}).getSubsequenceLength());
    }
}
