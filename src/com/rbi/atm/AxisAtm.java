package com.rbi.atm;

public class AxisAtm implements Atm{

    @Override
    public void balanceEnquiry() {
        System.out.println(" Axis balance enquiry");
    }

    @Override
    public void withDraw() {
        System.out.println("Axis withDraw");

    }

    @Override
    public void miniStatement() {
        System.out.println(" Axis miniStatement");

    }
}
