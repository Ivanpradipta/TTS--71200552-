package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan;
    Produk produk;
    Member member;

    public Invoice() {

    }

    public void printInvoice() {
        System.out.println("---INVOICE---");
        System.out.println("Kepada: Yth."+ this.member.getNama());
        System.out.println("Di "+this.member.getAlamat());
        System.out.println("----> Total tagihan: Rp."+tagihan);
        member.bayar(tagihan);
    }
    public long getTagihan() {
        return tagihan;
    }

    public void buatInvoice(Produk produk, int jumlah, Member member) {
        this.produk = produk;
        this.jumlah = jumlah;
        this.member = member;
        tagihan = this.produk.getHarga() * jumlah;

    }
}
