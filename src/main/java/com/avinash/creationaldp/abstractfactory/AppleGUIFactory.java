package com.avinash.creationaldp.abstractfactory;

public class AppleGUIFactory implements GUIFactory{
    @Override
    public void paint() {
        createButton();
        createCheckBox();
    }

    @Override
    public void createButton() {
        Button btn = new AppleButton();
        btn.onClick();


    }

    @Override
    public void createCheckBox() {
        CheckBox cb = new AppleCheckBox();
        cb.onTick();
    }
}
