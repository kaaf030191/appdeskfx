package com.codideep.app;

import com.codideep.app.view.Container;
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
        Container mdi = new Container();

        primaryStage.setScene(mdi.getScene());
        primaryStage.setTitle("JavaFX App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
