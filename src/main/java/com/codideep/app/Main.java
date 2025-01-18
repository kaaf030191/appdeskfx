package com.codideep.app;

import com.codideep.app.view.FrmUserRegister;
import javafx.application.Application;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author KAAF0
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        FrmUserRegister frmUserRegister = new FrmUserRegister();

        primaryStage.setScene(frmUserRegister.getScene());
        primaryStage.setTitle("Registro de usuario");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
