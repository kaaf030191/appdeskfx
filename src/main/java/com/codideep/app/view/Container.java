/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.view;

import javafx.scene.Scene;
import javafx.scene.control.Label;

/**
 *
 * @author KAAF0
 */
public class Container {

    private final Scene scene;

    public Container() {
        Label label = new Label("¡Hola, JavaFX!");
        scene = new Scene(label, 300, 200);
    }

    public Scene getScene() {
        return scene;
    }
}
