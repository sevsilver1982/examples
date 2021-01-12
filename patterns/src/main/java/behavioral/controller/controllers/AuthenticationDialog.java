package behavioral.controller.controllers;

import behavioral.controller.components.Component;
import behavioral.controller.components.*;

import javax.swing.*;
import java.awt.*;

public class AuthenticationDialog extends JFrame implements AuthenticationDialogController {
    private CheckBoxActionSwitch chkActionSwitch;
    private TextFieldUserName txtUserName;
    private TextFieldPassword txtPassword;
    private TextFieldEmail txtEmail;
    private ButtonOk btnOk;

    @Override
    public String getSelectedAction() {
        if (chkActionSwitch.isSelected()) {
            return "register";
        } else {
            return "login";
        }
    }

    @Override
    public void doAction() {
        System.out.println("action " + getSelectedAction());
    }

    @Override
    public void setRegistrationForm() {
        System.out.println("setRegistrationForm");
        txtUserName.setVisible(true);
        txtPassword.setVisible(true);
        txtEmail.setVisible(true);
    }

    @Override
    public void setLoginForm() {
        System.out.println("setLoginForm");
        txtUserName.setVisible(true);
        txtPassword.setVisible(true);
        txtEmail.setVisible(false);
    }

    @Override
    public void registerComponent(Component component) {
        component.setController(this);
        switch (component.getName()) {
            case ComponentNames.NAME_CHECKBOX_ACTION_SWITCH -> chkActionSwitch = (CheckBoxActionSwitch) component;
            case ComponentNames.NAME_TEXTFIELD_USER_NAME -> txtUserName = (TextFieldUserName) component;
            case ComponentNames.NAME_TEXTFIELD_PASSWORD -> txtPassword = (TextFieldPassword) component;
            case ComponentNames.NAME_TEXTFIELD_EMAIL -> txtEmail = (TextFieldEmail) component;
            case ComponentNames.NAME_BUTTON_OK -> btnOk = (ButtonOk) component;
        }
    }

    @Override
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setSize(500, 400);
        setLayout(null);

        chkActionSwitch.setBounds(50, 30, 150, 40);
        chkActionSwitch.setSelected(false);
        txtUserName.setBounds(50, 70, 400,30);
        txtPassword.setBounds(50, 110, 400, 30);
        txtEmail.setBounds(50, 150, 400, 30);
        setLoginForm();
        btnOk.setBounds(50, 300, 100, 30);

        add(chkActionSwitch);
        add(txtUserName);
        add(txtPassword);
        add(txtEmail);

        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(btnOk, BorderLayout.NORTH);

        add(buttonsPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

}