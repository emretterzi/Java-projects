package lab8;

import java.util.*;

import java.util.ArrayList;

public class Kume {

    private ArrayList<Integer> elemanlar;

    public Kume() {//parametresiz constructor
        elemanlar = new ArrayList<Integer>();
    }

    public Kume(int[] a) {//a dizisinin elemanlarindan olusan kume
        elemanlar = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            elemanlar.add(a[i]);
        }
    }

    public Kume(Kume a) {//copy constructor
        this.elemanlar = new ArrayList<Integer>(a.elemanlar);
    }

    public void ekle(int a) {//kumeye yeni eleman ekleme
        elemanlar.add(a);
    }

    public void yazdir() { //kume icerigini yazdirir
        if (elemanlar.size() > 0) {
            for (int i = 0; i < elemanlar.size() - 1; i++) {
                System.out.print(elemanlar.get(i) + ",");
            }
            System.out.print(elemanlar.get(elemanlar.size() - 1));
        }

    }

    public boolean denk(Kume a) {//cagrici obje ile parametre objenin denk kume olup olmadigini test eder
        return (this.elemanlar.size() == a.elemanlar.size());
    }

    public boolean esit(Kume a) { ////cagrici obje ile parametre objenin esit kume olup olmadigini test eder
        if (this.denk(a)) {
            Collections.sort(this.elemanlar);
            Collections.sort(a.elemanlar);
            for (int i = 0; i < this.elemanlar.size(); i++) {
                if (this.elemanlar.get(i) != a.elemanlar.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public Kume birlesim(Kume a) { //cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur
        Kume sonuc = new Kume();
        for (int i = 0; i < this.elemanlar.size(); i++) {
            sonuc.elemanlar.add(this.elemanlar.get(i));
        }

        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
        {
            if (sonuc.elemanlar.indexOf(a.elemanlar.get(i)) == -1) {
                sonuc.ekle(a.elemanlar.get(i));
            }
        }
        return sonuc;
    }

    public Kume kesisim(Kume a) {
        Kume sonuc = new Kume();
        for (int i = 0; i < a.elemanlar.size(); i++)//varolan elemanları eklemiyoruz
        {
            if (this.elemanlar.indexOf(a.elemanlar.get(i)) != -1) {
                sonuc.ekle(a.elemanlar.get(i));
            }
        }
        return sonuc;
    }

    public Kume fark(Kume a) {

        int elemansayi = 0, j = 0;
        for (int i = 0; i < elemanlar.size(); i++) {
            if (a.elemanlar.contains(elemanlar.get(i))) {

            } else {
                elemansayi++;
            }
        }
        int[] elemanlar2 = new int[elemansayi];
        for (int i = 0; i < elemanlar.size(); i++) {
            if (a.elemanlar.contains(elemanlar.get(i))) {

            } else {
                elemanlar2[j] = elemanlar.get(i);
                j++;
            }
        }
        Kume kmc = new Kume(elemanlar2);
        return kmc;

    }

    public ArrayList<Kume> altKumeler() {
        int n = (int) Math.pow(2, elemanlar.size());

        ArrayList<Kume> altKume = new ArrayList<>();
        Kume a1 = new Kume();
        Kume a2 = new Kume();
        Kume a3 = new Kume();
        Kume a4 = new Kume();
        Kume a5 = new Kume();
        Kume a6 = new Kume();
        Kume a7 = new Kume();

        System.out.println("Alt Kume Sayisi = " + n);
        System.out.println("={}");

        a1.ekle(elemanlar.get(0));
        a2.ekle(elemanlar.get(1));
        a3.ekle(elemanlar.get(2));
        for (int i = 0; i < elemanlar.size() - 1; i++) {
            a4.ekle(elemanlar.get(i));
        }
        for (int i = 1; i < elemanlar.size(); i++) {
            a5.ekle(elemanlar.get(i));
        }
        for (int i = 0; i < elemanlar.size(); i++) {
            if (i != 0) {
                i++;
            }
            if (i > 2) {
                break;
            }
            a6.ekle(elemanlar.get(i));
        }
        for (int i = 0; i < elemanlar.size(); i++) {
            a7.ekle(elemanlar.get(i));
        }

        altKume.add(a1);
        altKume.add(a2);
        altKume.add(a3);
        altKume.add(a4);
        altKume.add(a5);
        altKume.add(a6);
        altKume.add(a7);

        return altKume;
    }

    public static void main(String[] args) {

        Kume km = new Kume();
        km.ekle(1);
        km.ekle(2);
        km.ekle(3);
        System.out.print("km = {");
        km.yazdir();
        System.out.println("}");

        int[] a = {1, 2, 3, 5, 6, 7};
        Kume km2 = new Kume(a);
        System.out.print("km2 = {");
        km2.yazdir();
        System.out.println("}");

        int[] b = {7, 8, 9};
        Kume km3 = new Kume(b);
        System.out.print("km3 = {");
        km3.yazdir();
        System.out.println("}");

        if (km.denk(km2)) {
            System.out.println("km ve km2 kumeleri denk.");
        } else {
            System.out.println("km ve km2 kumeleri denk degil.");
        }
        if (km2.esit(km3)) {
            System.out.println("km2 ve km3 kumeleri esit.");
        } else {
            System.out.println("km2 ve km3 kumeleri esit degil.");
        }

        Kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = {");
        sn.yazdir();
        System.out.println("}");

        Kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = {");
        sn2.yazdir();
        System.out.println("}");

        Kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki = [");
        sn3.yazdir();
        System.out.println("}");

        System.out.println("km\'nin alt kumeleri");
        ArrayList<Kume> sonuc = km.altKumeler();
        for (int i = 0; i < sonuc.size(); i++) {
            System.out.print("{");
            sonuc.get(i).yazdir();
            System.out.println("}");
        }
    }

}
