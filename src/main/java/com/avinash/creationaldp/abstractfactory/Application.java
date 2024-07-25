package com.avinash.creationaldp.abstractfactory;

public class Application {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Application");

        GUIFactory wFactory = new WindowsGUIFactory();

        wFactory.paint();

        System.out.println("--------------- Apple -----------------------");

        GUIFactory aFactory = new AppleGUIFactory();

        aFactory.paint();
    }
}
