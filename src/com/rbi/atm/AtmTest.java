package com.rbi.atm;

public class AtmTest {
    public static void main(String[] args) {
       /* AxisAtm axisAtm= new AxisAtm();
        axisAtm.balanceEnquiry();
        axisAtm.miniStatement();
        axisAtm.withDraw();*/

        /*IciciAtm iciciAtm= new IciciAtm();
        iciciAtm.balanceEnquiry();
        iciciAtm.miniStatement();
        iciciAtm.withDraw();*/

        Atm atm= new IciciAtm();
        atm.balanceEnquiry();
        atm.miniStatement();
        atm.withDraw();



    }
}
