package com.rplbo.utskalkulator;
public class BilanganString {
    private String bilanganstring;
    private int bilangan;


    public BilanganString(String bilanganstring) {

        this.bilanganstring = bilanganstring;
        String str = bilanganstring.toLowerCase();
        if(str.equals("satu")) {
            bilangan = 1;
        }
        if(str.equals("dua")) {
            bilangan = 2;
        }
        if(str.equals("tiga")) {
            bilangan = 3;
        }
        if(str.equals("empat")) {
            bilangan = 4;
        }
        if(str.equals("lima")) {
            bilangan = 5;
        }
        if(str.equals("enam")) {
            bilangan = 6;
        }
        if(str.equals("tujuh")) {
            bilangan = 7;
        }
        if(str.equals("delapan")) {
            bilangan = 8;
        }
        if(str.equals("sembilan")) {
            bilangan = 9;
        }
        if(str.equals("sepuluh")) {
            bilangan = 10;
        }
        if(str.equals("sebelas")) {
            bilangan = 11;
        }
        if(str.equals("dua belas")) {
            bilangan = 12;
        }
        if(str.equals("tiga belas")) {
            bilangan = 13;
        }
        if(str.equals("empat belas")) {
            bilangan = 14;
        }
        if(str.equals("lima belas")) {
            bilangan = 15;
        }
        if(str.equals("enam belas")) {
            bilangan = 16;
        }
        if(str.equals("tujuh belas")) {
            bilangan = 17;
        }
        if(str.equals("delapan belas")) {
            bilangan = 18;
        }
        if(str.equals("sembilan belas")) {
            bilangan = 19;
        }
        if(str.equals("dua puluh")) {
            bilangan = 20;
        }


    }
    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit() {
        if ((bilangan > 9 && bilangan < 100) || (bilangan < -9 && bilangan > -100)) {
            return true;
        }
        return false;
    }

    public boolean apakahLebihDari10() {
        if(bilangan > 10) {
            return true;
        }
        return false;
    }


}
