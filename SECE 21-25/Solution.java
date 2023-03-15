public class Solution {

    public boolean isDivisible(int n, int k) {
        return n % k == 0;
    }

    public int numDigits(int n) {
        int cnt = 0;
        while(n != 0) {
            n = n / 10;
            cnt++;
        }
        return cnt;
    }

    public void printDivisors(int n) {
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                if(i != (n / i)) System.out.print((n / i) + " ");
            }
        }
        System.out.println();
    }

    public boolean isPrime(int n) {
        if(n == 1) return false;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public void printPrimeFactors(int n) {
        while(n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        for(int i = 3; i * i <= n; i += 2) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if(n > 2) System.out.print(n);
    }
}
