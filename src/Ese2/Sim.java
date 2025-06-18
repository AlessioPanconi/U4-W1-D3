package Ese2;

import java.util.Arrays;

public class Sim {

    private long telephoneNumber;
    private double credit;
    private Call[] calls= {
            new Call(3,1034567895),
            new Call(6.7,2035465798),
            new Call(0.30,2085342679),
            new Call(2.5,1252678945),
            new Call(2.8,2054378954),

    };

    //Costruttore
    public Sim (long telephoneNumber)
    {
        this.telephoneNumber= telephoneNumber;
        this.credit=0;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "telephoneNumber="+ telephoneNumber +
                ", credit=" + credit +
                ", calls=" + Arrays.toString(calls) +
                '}';
    }
}
