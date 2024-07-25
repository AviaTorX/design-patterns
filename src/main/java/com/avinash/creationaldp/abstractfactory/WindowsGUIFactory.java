package com.avinash.creationaldp.abstractfactory;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public void paint() {
        createButton();
        createCheckBox();
    }

    @Override
    public void createButton() {
        Button btn = new WindowsButton();
        btn.onClick();
    }

    @Override
    public void createCheckBox() {
        CheckBox cb = new WindowsCheckBox();
        cb.onTick();
    }
}
