package com.rplbo.utstokosedia;

import java.util.Vector;

public class Member {
    private String alamat;
    private String nama;
    Dompet dompet;
    Vector<Dompet> listDompet = new Vector<>();
    public Member(String nama,String alamat) {
        this.nama = nama;
        this.alamat = alamat;

    }

    public String getAlamat() {
        return alamat;
    }
    public void cekSaldo() {
        System.out.println("Nama: "+nama);
        System.out.println("Saldo: "+ this.dompet.getSaldo());
    }
    public String getNama() {
        return nama;
    }
    public void bayar(long tagihan) {
        if(this.dompet.getSaldo() >= tagihan ) {
            System.out.println("Pembayaran sukses");
        }
        else if(this.dompet.getSaldo() < tagihan) {
            System.out.println("pembayaran gagal");
        }
    }
    public void topUp(long nominal) {
        if(nominal > 0) {
            System.out.println("top up sukses");
        }
        else if(nominal <= 0) {
            System.out.println("top up gagal");
        }


    }


}
