package net.saliman.gradle.cobertura.plugin.noissue;

public class Calculator {

    private RandomNumberGenerator randomGenerator;
    
    public double multiplyByRandomNumber(int number) {
        return number * randomGenerator.randomNumber();
    }
}
