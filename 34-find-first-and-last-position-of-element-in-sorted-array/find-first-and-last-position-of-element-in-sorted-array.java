import java.util.*;
class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int left=binarySearch(nums,target,true);
        int right=binarySearch(nums,target,false);
        return new int[]{left,right};
        }
    public static int binarySearch(int[] nums,int target,boolean FirstBound){
        int index=-1,low=0,high=nums.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]==target){
                index=mid;
                if (FirstBound){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for (int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] res=searchRange(nums,target);
        System.out.println(Arrays.toString(res));
    }
}