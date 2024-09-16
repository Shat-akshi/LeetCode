class Solution {
    public int reverse(int x) {
        int temp=x;
        int sum=0;

        while(temp!=0)
        {
            int d=temp%10;
            temp/=10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;  
            }
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;  
            }

            sum=sum*10+d;
        }
        return sum;
    }
}