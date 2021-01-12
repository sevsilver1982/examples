package behavioral.controller;

import behavioral.controller.components.*;
import behavioral.controller.controllers.AuthenticationDialog;
import behavioral.controller.controllers.AuthenticationDialogController;

/**
 *  Посредник (Controller, Mediator)
 *  Позволяет уменьшить связанность множества классов между собой, благодаря перемещению этих связей в один класс-посредник.
 */
public class Example {

    public static void main(String[] args) {
        AuthenticationDialogController authenticationDialogController = new AuthenticationDialog();
        authenticationDialogController.registerComponent(new CheckBoxActionSwitch());
        authenticationDialogController.registerComponent(new TextFieldUserName());
        authenticationDialogController.registerComponent(new TextFieldPassword());
        authenticationDialogController.registerComponent(new TextFieldEmail());
        authenticationDialogController.registerComponent(new ButtonOk());
        authenticationDialogController.createGUI();
    }

}