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
    public void testGenerateRandomNumber() {

        when(generator.randomNumber()).thenReturn(1.5);
        double result = calculator.multiplyByRandomNumber(2);
        Assert.assertEquals(result, 3.0);
    }
}
