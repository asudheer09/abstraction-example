package com.rbi.atm;

public interface Atm {
    public abstract void balanceEnquiry();

    void withDraw();

    //optional to use public abstract
    void miniStatement();
}
