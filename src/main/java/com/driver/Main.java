package com.driver;

public class Main {

    public static class classA {

        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class classB extends classA {

        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        classB B = new classB();
        B.meth();

    }
}