package behavioral.controller.components;

import behavioral.controller.controllers.AuthenticationDialogController;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonOk extends JButton implements Component {
    private AuthenticationDialogController controller;

    public ButtonOk() {
        super("Ok");
    }

    @Override
    public void setController(AuthenticationDialogController controller) {
        this.controller = controller;
    }

    @Override
    public String getName() {
        return ComponentNames.NAME_BUTTON_OK;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        controller.doAction();
    }

}