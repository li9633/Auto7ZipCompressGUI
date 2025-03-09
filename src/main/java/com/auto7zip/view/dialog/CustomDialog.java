package com.auto7zip.view.dialog;

import com.auto7zip.config.content.DiglogContent;
import javafx.scene.control.Dialog;

public class CustomDialog extends Dialog<Void> {
    public CustomDialog() {
        super();
        setTitle(DiglogContent.getDialogTitle());
        setHeaderText(DiglogContent.getDialoHeader());

        getDialogPane().setContent(null);
    }
}
