package com.example.rest;

import java.util.concurrent.CopyOnWriteArrayList;

public class MockCustomerList {
    
    private static final CopyOnWriteArrayList<Customer> cList = new CopyOnWriteArrayList<>();
    
    static {
        cList.add(new Customer(100, "Ahmed", "Adub", "ahmed_32@gmail.com", "Syria", "Aleppo", "1992-04-03"));
        cList.add(new Customer(101, "Mohammad", "Srri", "Mohammad2@gmail.com", "Syria", "Aleppo", "1942-04-03"));
        cList.add(new Customer(102, "Omer", "Dib", "Omaer@gmail.com", "Syria", "Damascous", "1999-01-14"));
        cList.add(new Customer(103, "Loway", "Moh", "luay@gmail.com", "Syria", "Hama", "1992-03-03"));
        cList.add(new Customer(104, "Jasem", "Lawy", "Jasem@gmail.com", "Syria", "Homs", "1991-04-03"));
    }
    
    private MockCustomerList(){}
    
    public static CopyOnWriteArrayList<Customer> getInstance() {
        return cList;
    }
}
