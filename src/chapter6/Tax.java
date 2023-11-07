package chapter6;

import javax.swing.*;

public class Tax {
    private int number;     //納税者番号
    private String name;    //指名
    private int shotoku;    //所得額
    private int koujo;      //控除額

    public Tax(int number, String name, int shotoku, int koujo) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }
    public int zeigaku() {      //amount of tax
        return (int)((shotoku - koujo) * 0.1);
    }
}
