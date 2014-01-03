package net.saliman.gradle.cobertura.plugin.issue;

public class Calculator {

    private RandomNumberGenerator randomGenerator;
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public double generateRandomNumber() {
        return 2 * randomGenerator.randomNumber();
    }
}
