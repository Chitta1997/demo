package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.DemoRepo;
import com.example.demo.uitl.MyDetails;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DemoServiceTest {
    @InjectMocks
    DemoService demoService;

    @Mock
    private DemoRepo demoRepo;

    @Mock
    MyDetails myDetails;

    @Test
    public void processDataTest(){
      String returnValue =  demoService.processData(new Customer("zzc",313));

      assertNull(returnValue);
    }

    @Test
    public void processDataTest2(){
        Customer customer= new Customer("zzds",73);
        when(demoRepo.savedata(Mockito.<Customer>any())).thenReturn("abcd");
        String returnValue =  demoService.processData(customer);

        assertNotNull(returnValue);
        assertEquals("abcd",returnValue);
    }
}
