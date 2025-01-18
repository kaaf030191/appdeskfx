/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.view;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 *
 * @author KAAF0
 */
public class Container {

    private final Scene scene;

    public Container() {
        StackPane stackPane = new StackPane();

        Label label = new Label("Nombre completo");

        stackPane.getChildren().add(label);

        scene = new Scene(stackPane, 300, 200);
    }

    public Scene getScene() {
        return scene;
    }
}
