package Ese2;

import java.security.PublicKey;

public class Call {

    private double duration;
    private long telephoneNumber;

    //Costruttori

    public Call (double duration, long telephoneNumber)
    {
        this.duration=duration;
        this.telephoneNumber=telephoneNumber;
    }

    @Override
    public String toString() {
        return "Call{" +
                "duration=" + duration +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}
