package com.rplbo.utstokosedia;

public class MemberPremium extends Member {
    private double POTONGAN = 0.1;
    private String kodeVoucher = "TOKOSEDIA25";

    public MemberPremium(String nama,String alamat) {
        super(nama, alamat);
    }

    public void bayar(long tagihan) {
        double bayar = 0.1 * tagihan;
    }

    public void bayar(long tagihan,String kodeVoucher) {
        if(kodeVoucher == "TOKOSEDIA25") {
            double bayar = 0.25 * tagihan;
        }
    }
}
