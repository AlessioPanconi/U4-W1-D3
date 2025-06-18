package Ese1;

public class Rettangolo {
    public double l1;
    public double l2;

    // Costruttore
    public Rettangolo(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    // Metodi
    public double getPerimeter() {
        return (this.l1 + this.l2) * 2;
    }

    public double getArea() {
        return this.l1 * this.l2;
    }

    public void stampaRettangolo() {
        System.out.println("Area del rettangolo: " + this.getArea());
        System.out.println("Perimetro del rettangolo: " + this.getPerimeter());
    }

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {

        System.out.println("Valori dei due rettangoli utilizzati nelle operazioni");
        System.out.println("-----Primo Rettangolo-----");
        ret1.stampaRettangolo();
        System.out.println("-----Secondo Rettangolo-----");
        ret2.stampaRettangolo();

        double sommaAree = ret1.getArea() + ret2.getArea();
        double sommaPerimetri = ret1.getPerimeter() + ret2.getPerimeter();

        System.out.println("Risultati");
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}

