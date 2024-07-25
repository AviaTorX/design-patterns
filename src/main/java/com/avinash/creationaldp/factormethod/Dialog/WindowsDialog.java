package com.avinash.creationaldp.factormethod.Dialog;

import com.avinash.creationaldp.factormethod.button.Button;
import com.avinash.creationaldp.factormethod.button.WindowsButton;

public class WindowsDialog extends Dialog{
    public Button createButton() {
        return new WindowsButton();
    }
}
