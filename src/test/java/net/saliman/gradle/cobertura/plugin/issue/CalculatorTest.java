package net.saliman.gradle.cobertura.plugin.issue;

import static org.powermock.api.mockito.PowerMockito.when;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.IObjectFactory;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

@PrepareForTest(RandomNumberGenerator.class)
public class CalculatorTest extends PowerMockTestCase{

    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }


    @Test
    public void testGenerateRandomNumber() {

        Calculator calculator = new Calculator();
        
        final RandomNumberGenerator generator = PowerMockito.mock(RandomNumberGenerator.class);
        calculator.setRandomGenerator(generator);
        
        when(generator.randomNumber()).thenReturn(1.5);
        double result = calculator.multiplyByRandomNumber(2);
        Assert.assertEquals(result, 3.0);
    }
}
