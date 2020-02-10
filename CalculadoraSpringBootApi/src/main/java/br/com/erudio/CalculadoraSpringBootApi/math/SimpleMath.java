package br.com.erudio.CalculadoraSpringBootApi.math;

public class SimpleMath {
    public Double sum(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    public Double subtraction(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    public Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double division(Double firstNumber, Double secondNumber) {
        return firstNumber / secondNumber;
    }

    public Double squareroot(Double number) {
        return (Double) Math.sqrt(number);
    }

    public Double mean(Double firstNumber, Double secondNumber) {
        return (Double)  (firstNumber + secondNumber) / 2;
    }
}
