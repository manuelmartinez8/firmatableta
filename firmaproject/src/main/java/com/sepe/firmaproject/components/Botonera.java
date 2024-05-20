/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sepe.firmaproject.components;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
 


public class Botonera {
    
    
    public static HBox  getBotonera(){
    HBox   rootBotonera = new HBox(); 
    Button btnDescartar = new Button("Descartar1");
    btnDescartar.setStyle("-fx-background-color: #409AE1; -fx-text-fill: white;");
    btnDescartar.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
               System.exit(0);
                System.out.println("Cerrar Sesion");
            }
        
        });
    Button btnRepetir = new Button("Repetir");
    btnRepetir.setStyle("-fx-background-color: #409AE1; -fx-text-fill: white;");
    btnRepetir.setOnAction((ActionEvent e) -> {
    //label.setText("Accepted");
    ContainerFirma.firmante.setText("Manuelito");
            });
    
    
    Button btnConfirmar = new Button("Confirmar");
    btnConfirmar.setStyle("-fx-background-color: #409AE1; -fx-text-fill: white;");
    btnConfirmar.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t) {
                ContainerFirma.firmante.setText("Manuelito");
               //nombreTag.setText("Manuel Martinez");
                System.out.println("Firma Realizada");
            }
        
        });
//VBox   containerRight = new VBox();
     rootBotonera.getChildren().addAll( btnDescartar,btnRepetir,btnConfirmar);
    return rootBotonera;
    }
}
