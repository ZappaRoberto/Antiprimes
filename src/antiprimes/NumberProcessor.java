package antiprimes;

public class NumberProcessor extends Thread {
    Number n;

   public void run(){

    }

    public synchronized Number nextAntiPrime(Number n){
      return AntiPrimes.nextAntiPrimeAfter(n);
    }

}
