package com.mocking;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BasicMockTest {

    @Test
    void testMockList() {
        List<String> mockedList = mock(List.class);
        when(mockedList.get(0)).thenReturn("Hello Mockito");

        assertEquals("Hello Mockito", mockedList.get(0));
        assertNull(mockedList.get(1)); // Unstubbed call returns null
    }
}
