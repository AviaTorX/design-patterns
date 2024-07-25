package com.avinash.creationaldp.factormethod.Dialog;

import com.avinash.creationaldp.factormethod.button.Button;

public abstract class Dialog {
    public void show() {
        System.out.println("Dialog Rendering");
        Button button = createButton();

        button.render();
    }

    public abstract Button createButton();
}
