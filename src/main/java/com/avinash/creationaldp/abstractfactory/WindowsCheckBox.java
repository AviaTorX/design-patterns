package com.avinash.creationaldp.abstractfactory;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void onTick() {
        System.out.println("Windows CheckBox ticked");
    }
}
