package day10.exception;

import java.util.InputMismatchException;

public class ThrowsMain {

    public static void main(String[] args){
        ThrowsExample te = new ThrowsExample();

        try {
            int n = te.inputNumber();
            te.convert("100");
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }
}
