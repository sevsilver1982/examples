package behavioral.controller.components;

import behavioral.controller.controllers.AuthenticationDialogController;

public interface Component {
    void setController(AuthenticationDialogController authenticationDialogController);
    String getName();
}