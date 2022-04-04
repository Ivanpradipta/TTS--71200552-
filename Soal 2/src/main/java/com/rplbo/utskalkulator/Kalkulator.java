package com.rplbo.utskalkulator;
public class Kalkulator {
    private int bil2;
    private int bil1;
    private BilanganString bilanganString;
    private Operator op;

    public Kalkulator(BilanganString b1, BilanganString b2,Operator op) {

        bil1 = b1.getBilangan();
        bil2 = b2.getBilangan();
        this.op = op;
    }

    public void hitung() {
        double hasil;
        if(op.getOperatorSimbol() == "+" ) {
            hasil = bil1 + bil2;
            System.out.println("Hasil: "+ hasil);
        }
        else if(op.getOperatorSimbol() == "-") {
            hasil = bil1 - bil2;
            System.out.println("Hasil: "+ hasil);
        }
        else if(op.getOperatorSimbol() == "^") {
            hasil = Math.pow(bil1, bil2);
            System.out.println("Hasil: "+ hasil);
        }
        else if(op.getOperatorSimbol() == "/") {
            hasil = bil1/bil2;
            System.out.println("Hasil: "+ hasil);
        }
    }



}
