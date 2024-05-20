/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sepe.firmaproject.components;

import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author ManuelOrlandoMartíne
 */
public class ContainerFirma {
    
     public static Label firmante;
     public static TitledPane getPanelFirma(){
     TitledPane gridTitlePane3 = new TitledPane();
      
        gridTitlePane3.setMaxWidth(Double.valueOf(300));
        gridTitlePane3.setMaxHeight(Double.valueOf(200));       
        TextArea textAreaFirmar = new TextArea();
        textAreaFirmar.setMaxWidth(Double.valueOf(200));
        textAreaFirmar.setMaxHeight(Double.valueOf(200));
         //Horizontal separator
        Separator separator1 = new Separator();
        separator1.setOrientation(Orientation.HORIZONTAL);
        separator1.setMaxWidth(140);
        separator1.setHalignment(HPos.LEFT);
       
        VBox containerRight = new VBox();   
        firmante = new Label();
        firmante.setText("Firmante:");
        containerRight.getChildren().addAll(firmante, textAreaFirmar,separator1, Botonera.getBotonera());
        containerRight.setAlignment(Pos.TOP_LEFT); 
        
        gridTitlePane3.setCollapsible(false);
        gridTitlePane3.setText("FIRMAR");
        gridTitlePane3.setContent(containerRight);
        gridTitlePane3.setTextFill(Color.BLUE);
        gridTitlePane3.setStyle("-fx-background-color: BLACK;");
        
        return gridTitlePane3;
     }
     
     public static void setTextFirmante(String nombre){
     firmante.setText(nombre);
     }
     
     
}
