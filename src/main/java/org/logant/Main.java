package org.logant;

import org.logant.StandardJPA.StandardJPACode;

public class Main {
    public static void main(String[] args) {
        StandardJPACode standardJPACode = new StandardJPACode();
        standardJPACode.transferMoney(1L, 2L, 1000.0);
    }
}