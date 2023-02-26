package by.itacademy.moiseenkolydia.javabasics;

public class CalculatorOfNewPages {
    public int calculateNumberOfPages(int news) {

        return (int) Math.ceil(news / 10.0);
    }
}
