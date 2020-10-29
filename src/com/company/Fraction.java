package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){}
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int UCLN(){
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        while (a != b){
            if (a > b){
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }

    public boolean kiemTraToiGian(){
        int check = UCLN();
        if (check == 1){
            return true;
        }
        return false;
    }

    public void dangToiGian(){
        if (!kiemTraToiGian()){
            int ucln = UCLN();
            numerator /= ucln;
            denominator /= ucln;
            System.out.println(numerator+"/"+denominator);
        }else {
            System.out.println(numerator+"/"+denominator);
        }
    }


    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }

}
