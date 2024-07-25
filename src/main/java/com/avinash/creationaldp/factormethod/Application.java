package com.avinash.creationaldp.factormethod;

import com.avinash.creationaldp.factormethod.Dialog.Dialog;
import com.avinash.creationaldp.factormethod.Dialog.HtmlDialog;
import com.avinash.creationaldp.factormethod.Dialog.WindowsDialog;

public class Application {
    public static void main(String[] args) {

        System.out.println("Factory method");

        // WIndows Dialog
        Dialog wd = new WindowsDialog();
        wd.show();
        // Html Dialog

        Dialog hd = new HtmlDialog();
        hd.show();
    }
}