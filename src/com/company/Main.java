package com.company;



public class Main {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,8);
        Fraction f2 = new Fraction(5,7);
        Fraction f3 = new Fraction(7,12);

//        System.out.print(f1+" + "+f2+" = ");
//        Method.Cong(f1,f2);

        System.out.println(f1+" - "+f3+" = ");
        Method.Tru(f1,f3);

//        System.out.print(f2+" x "+f3+" = ");
//        Method.Nhan(f2,f3);
//
//        System.out.print(f3+" : "+f1+" = ");
//        Method.Chia(f3,f1);


    }
}
