package com.example.VerifyingInteractions;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)          
class MyServiceTest {

    @Test
    void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class); 

        MyService service = new MyService(mockApi);    
        service.fetchData();

        verify(mockApi).getData();                     
    }
}
