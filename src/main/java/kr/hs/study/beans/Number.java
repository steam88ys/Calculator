package kr.hs.study.beans;

import lombok.Data;

@Data

public class Number {
    private String str1, str2;
    private int su1, su2, su3;
    private int su4, su5;

    private int su6, su7, su8;
    private int su9;
    private int su10, su11, su12, su13, su14;

    public Number(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public Number(int su1, int su2, int su3) {
        this.su1 = su1;
        this.su2 = su2;
        this.su3 = su3;
    }

    public Number(int su4, int su5) {
        this.su4 = su4;
        this.su5 = su5;
    }

    public Number(int su9) {
        this.su9 = su9;
    }

    public Number(int su10, int su11, int su12, int su13, int su14) {
        this.su10 = su10;
        this.su11 = su11;
        this.su12 = su12;
        this.su13 = su13;
        this.su14 = su14;
    }



}
