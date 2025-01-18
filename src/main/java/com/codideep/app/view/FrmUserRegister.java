/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author KAAF0
 */
public class FrmUserRegister {

    private final Scene scene;

    public FrmUserRegister() {
        StackPane stackPane = new StackPane();

        stackPane.setPadding(new Insets(7));
        stackPane.setStyle("-fx-background-color: #ffffff;");

        GridPane gridPane = new GridPane();

        gridPane.setHgap(20);
        gridPane.setVgap(3);

        Label lblDni = new Label("DNI");
        TextField txtDni = new TextField();
        gridPane.add(lblDni, 0, 0);
        gridPane.add(txtDni, 0, 1);

        Label lblFirstName = new Label("Nombre");
        TextField txtFirstName = new TextField();
        gridPane.add(lblFirstName, 1, 0);
        gridPane.add(txtFirstName, 1, 1);

        Label lblSurName = new Label("Apellido");
        TextField txtSurName = new TextField();
        gridPane.add(lblSurName, 2, 0);
        gridPane.add(txtSurName, 2, 1);

        Label lblGender = new Label("Género");
        ToggleGroup tgGender = new ToggleGroup();
        RadioButton rbMale = new RadioButton("Masculino");
        RadioButton rbFemale = new RadioButton("Femenino");
        rbMale.setToggleGroup(tgGender);
        rbFemale.setToggleGroup(tgGender);
        GridPane gridPaneGender = new GridPane();
        gridPaneGender.setPadding(new Insets(3, 0, 0, 0));
        gridPaneGender.setHgap(3);
        gridPaneGender.add(rbMale, 0, 0);
        gridPaneGender.add(rbFemale, 1, 0);
        gridPane.add(lblGender, 3, 0);
        gridPane.add(gridPaneGender, 3, 1);

        Button btnInsertUser = new Button("Registrar datos ingresados");
        btnInsertUser.getStyleClass().add("btnPrimary");
        gridPane.add(btnInsertUser, 3, 2);
        btnInsertUser.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Información");
            alert.setHeaderText("Registro realizado correctamente");
            alert.setContentText("Se ha realizado el registro del usuario: " + txtFirstName.getText() + ", de forma correcta.");
            alert.showAndWait();
        });

        for (int i = 0; i < 4; i++) {
            ColumnConstraints col = new ColumnConstraints();
            col.setPercentWidth(33.33);
            gridPane.getColumnConstraints().add(col);
        }

        stackPane.getChildren().add(gridPane);

        scene = new Scene(stackPane, 800, 600);

        scene.getStylesheets().add(getClass().getResource("../../../../styles.css").toExternalForm());
    }

    public Scene getScene() {
        return scene;
    }
}
