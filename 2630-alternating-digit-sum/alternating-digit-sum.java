class Solution {
    public int alternateDigitSum(int n) {
        int evenSum=0;
        int oddSum=0;
        int digitCount=0;
        boolean oddPosition=true;
        while (n>0){
            int digit=n%10;
            n=n/10;
            if (oddPosition){
                oddSum+=digit;
            }
            else{
                evenSum+=digit;
            }
            oddPosition=!oddPosition;
            digitCount++;
        }
        if (digitCount%2==0){
            oddSum=-oddSum;
        }
        else{
            evenSum=-evenSum;
        }
        return oddSum+evenSum;
    }
}