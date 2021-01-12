package behavioral.controller.components;

import behavioral.controller.controllers.AuthenticationDialogController;

import javax.swing.*;

public class TextFieldUserName extends JTextField implements Component {
    private AuthenticationDialogController controller;

    public void setController(AuthenticationDialogController controller) {
        this.controller = controller;
    }

    @Override
    public String getName() {
        return ComponentNames.NAME_TEXTFIELD_USER_NAME;
    }

}