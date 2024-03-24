package oop7_hw;

public interface Calculatable {
    Calculatable sum(int arg);
    Calculatable multi(int arg);
    Calculatable div(int arg);
    Calculatable subtract(int arg);
    int getResult();
}
