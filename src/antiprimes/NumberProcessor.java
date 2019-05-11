package antiprimes;

import javax.sound.midi.Sequence;

public class NumberProcessor extends Thread {
    Number n;
    AntiPrimesSequence sequence;
    NumberProcessor(AntiPrimesSequence sequence){
        this.sequence = sequence;

    }

   public void run(){

    }

    public void nextAntiPrime(){

        sequence.addAntiPrimes(AntiPrimes.nextAntiPrimeAfter(sequence.getLast()));

    }

}
