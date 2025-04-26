package com.mocking;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class VerifyMethodCallTest {

    @Test
    void testVerifyCalls() {
        List<String> mockedList = mock(List.class);

        mockedList.add("Apple");
        mockedList.add("Banana");

        verify(mockedList).add("Apple");
        verify(mockedList).add("Banana");
    }
}
