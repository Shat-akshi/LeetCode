class Solution {
    public int reverse(int x) {
        int temp=x;
        int sum=0;

        while(temp!=0)
        {
            int d=temp%10;
            temp/=10;
            if (sum > Integer.MAX_VALUE / 10 ) {
                return 0;  
            }
            if (sum < Integer.MIN_VALUE / 10 ) {
                return 0;  
            }

            sum=sum*10+d;
        }
        return sum;
    }
}