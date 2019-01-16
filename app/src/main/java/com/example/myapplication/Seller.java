package com.example.myapplication;

/**
 * Created by Administrator on 2018/12/26.
 */

public class Seller {
    private String name = null;

    public Seller(String name) {
        // TODO Auto-generated constructor stub
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class DoHomeWork implements doJob {

        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
        }
    }

    public int callHelp(int a, int b) {
        return new SuperCalculator().add(a, b, new Seller.DoHomeWork());

    }
}
