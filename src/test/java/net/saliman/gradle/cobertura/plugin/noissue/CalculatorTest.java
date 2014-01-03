package net.saliman.gradle.cobertura.plugin.noissue;

import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CalculatorTest {
   
    
    @InjectMocks
    private Calculator calculator;
    
    @Mock
    private RandomNumberGenerator generator;
    
    @BeforeTest
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void add() {
        int result = calculator.add(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void generateRandomNumber() {
        
        when(generator.randomNumber()).thenReturn(1.5);
        double result = calculator.generateRandomNumber();
        Assert.assertEquals(result, 3.0);
    }
}
