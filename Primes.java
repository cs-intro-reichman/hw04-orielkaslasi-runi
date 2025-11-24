public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        for (int i = 0; i < isPrime.length; i++) { //fill em trues
        isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        int p = 2;
        while (p <= Math.sqrt(n)) {
            if (isPrime[p] == true) { 
               int i = p + p; //checks from 1t multiple, not p itself
               
               while (i<isPrime.length) {
                isPrime[i] = false;
                i+=p;
               }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + n +":");
        int amount=0;
        for (int i = 0; i<=n; i++) {
            if (isPrime[i] == true) {
            System.out.println(i);
            amount++;
            }
        }
        int percent = (int) (((double) amount / n) * 100);
        System.out.println("There are " +amount+ " primes between 2 and " +n+ " (" +percent + "% are primes)" );
    }
}