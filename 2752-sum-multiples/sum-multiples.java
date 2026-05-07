class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int number = 1; number <= n; number++) {
            if(number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                sum = sum + number;


            }
        }
        return sum;
    }
}