package com.spring.basics.spring.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    // Inject Mock
    @InjectMocks
    SomeCdiBusiness business;

    // Create Mock
    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 4});
        assertEquals(4, business.findGreatest());
    }

    @Test
    public void testBasicScenario_NoElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2, 2});
        assertEquals(2, business.findGreatest());
    }

}
