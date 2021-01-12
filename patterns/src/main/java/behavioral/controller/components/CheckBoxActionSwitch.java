package behavioral.controller.components;

import behavioral.controller.controllers.AuthenticationDialogController;

import javax.swing.*;
import java.awt.event.ItemEvent;

public class CheckBoxActionSwitch extends JCheckBox implements Component {
    private AuthenticationDialogController controller;

    @Override
    public void setController(AuthenticationDialogController controller) {
        this.controller = controller;
    }

    @Override
    public String getName() {
        return ComponentNames.NAME_CHECKBOX_ACTION_SWITCH;
    }

    public CheckBoxActionSwitch() {
        super("Register");
        this.addItemListener(e -> {
            if(e.getStateChange() == ItemEvent.SELECTED) {
                controller.setRegistrationForm();
            } else {
                controller.setLoginForm();
            }
        });
    }

}