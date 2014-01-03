package net.saliman.gradle.cobertura.plugin.issue;

import static org.powermock.api.mockito.PowerMockito.when;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.Assert;
import org.testng.IObjectFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

@PrepareForTest(RandomNumberGenerator.class)
public class CalculatorTest {

    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
    
    @InjectMocks
    private Calculator calculator;
    
    @Mock
    private RandomNumberGenerator generator = PowerMockito.mock(RandomNumberGenerator.class);;
    
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
