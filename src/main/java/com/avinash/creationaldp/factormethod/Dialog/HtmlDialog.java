package com.avinash.creationaldp.factormethod.Dialog;

import com.avinash.creationaldp.factormethod.button.Button;
import com.avinash.creationaldp.factormethod.button.HtmlButton;

public class HtmlDialog extends Dialog{

    public Button createButton() {
        return new HtmlButton();
    }
}
