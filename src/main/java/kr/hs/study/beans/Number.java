package kr.hs.study.beans;

import lombok.Data;

@Data

public class Number {
    private String str1, str2;
    private int su1, su2, su3, su4, su5;

    public Number(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public Number(int su1, int su2, int su3) {
        this.su1 = su1;
        this.su2 = su2;
        this.su3 = su3;
    }

    public Number(int su1, int su2) {
        this.su1 = su1;
        this.su2 = su2;
    }

    public Number(int su1) {
        this.su1 = su1;
    }

    public Number(int su1, int su2, int su3, int su4, int su5) {
        this.su1 = su1;
        this.su2 = su2;
        this.su3 = su3;
        this.su4 = su4;
        this.su5 = su5;
    }



}
