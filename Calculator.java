package oop7_hw;

public final class Calculator implements Calculatable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculatable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculatable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public Calculatable div(int arg){
        primaryArg/=arg;
        return this;
    }

    @Override
    public  Calculatable subtract(int arg){
        primaryArg-=arg;
        return this;
    }


    @Override
    public int getResult() {
        return primaryArg;
    }
}    

