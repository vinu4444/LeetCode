class Solution {
    public int findKthPositive(int[] arr, int k) {
        int largest = arr[arr.length - 1];
        int diff = largest - arr.length;
        if(k > diff)
            return largest + (k - diff);
        
        int left = 0;
        int right = arr.length - 1;
        int num = -1;
        int cnt = -1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            int missings = arr[mid] - (mid + 1);
            if(missings < k)
            {
                num = arr[mid];
                cnt = missings;
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }
        return num + (k - cnt);
    }
}