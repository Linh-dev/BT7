package com.company;

public class Method {
    public static void Cong(Fraction f1, Fraction f2){
        int mau = f1.getDenominator()* f2.getDenominator();
        int tu = (f1.getNumerator()*f2.getDenominator())+(f2.getNumerator()*f1.getDenominator());
        Fraction f = new Fraction(tu, mau);
        f.dangToiGian();
    }

    public static void Tru(Fraction f1, Fraction f2){
        int mau = f1.getDenominator()*f2.getDenominator();
        int tu = (f1.getNumerator()*f2.getDenominator())-(f2.getNumerator()*f1.getDenominator());
        Fraction f = new Fraction(tu,mau);
        f.dangToiGian();
    }

    public static void Nhan(Fraction f1, Fraction f2){
        int tu = f1.getNumerator()*f2.getNumerator();
        int mau = f1.getDenominator()*f2.getDenominator();
        Fraction f = new Fraction(tu, mau);
        f.dangToiGian();
    }

    public static void Chia(Fraction f1, Fraction f2){
        int tu = f1.getNumerator()* f2.getDenominator();
        int mau = f1.getDenominator()* f2.getNumerator();
        Fraction f = new Fraction(tu, mau);
        f.dangToiGian();
    }
}
