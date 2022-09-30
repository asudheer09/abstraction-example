package com.rbi.atm;

public class IciciAtm implements  Atm{
    @Override
    public void balanceEnquiry() {
        System.out.println(" ICIC balance enquiry");
    }

    @Override
    public void withDraw() {
        System.out.println("ICIC withDraw");

    }

    @Override
    public void miniStatement() {
        System.out.println(" ICIC miniStatement");

    }
}
