package behavioral.controller.controllers;

import behavioral.controller.components.Component;

public interface AuthenticationDialogController {
    String getSelectedAction();
    void doAction();
    void setRegistrationForm();
    void setLoginForm();
    void registerComponent(Component component);
    void createGUI();
}