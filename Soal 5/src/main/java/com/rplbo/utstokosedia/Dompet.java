package com.rplbo.utstokosedia;

public class Dompet {
    private long saldo;
    private Member member;

    public Dompet() {
//		this.member = new Member(member.getNama(),member.getAlamat());
    }
    public long getSaldo() {
        return saldo;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}
