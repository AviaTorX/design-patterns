package com.avinash.creationaldp.abstractfactory;

public class WindowsButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }
}
