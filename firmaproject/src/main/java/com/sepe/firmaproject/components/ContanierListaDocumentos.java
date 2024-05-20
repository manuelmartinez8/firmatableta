/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sepe.firmaproject.components;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author ManuelOrlandoMartíne
 */
public class ContanierListaDocumentos {
    
    public static VBox getListaDocumentos(){
        VBox containerCenter = new VBox();
        TitledPane gridTitlePane2 = new TitledPane();
        gridTitlePane2.setMaxWidth(Double.valueOf(200));
        gridTitlePane2.setMaxHeight(Double.valueOf(200));
        GridPane gridPaneDocumentos = new GridPane();
        gridPaneDocumentos.setVgap(2);
        gridPaneDocumentos.setPadding(new Insets(5, 5, 5, 5)); 
        
        ListView<String> listDocumentos = new ListView<>();
        ObservableList<String> documents = FXCollections.observableArrayList();
        documents.addAll(
             "IRPF", "EXTRANJERIA", "RENOVACION", "TRANSITO",
             "HACIENDA", "MOBILIARIOS", "DEUDAS", "MATRIMONIO"
        ); 
        listDocumentos.setItems(documents);
        listDocumentos.setPrefHeight(200);
        listDocumentos.setPrefWidth(200);
        
        listDocumentos.getSelectionModel().selectedItemProperty().addListener(
        new ChangeListener<String>(){
        @Override
        public void changed(ObservableValue<? extends String> ov, String t, String t1) {           
          
           System.out.println("Documento Seleccionado" + listDocumentos.getSelectionModel().getSelectedItem());
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
        }
                
        );
       
        gridPaneDocumentos.add(listDocumentos, 1, 0);         
        gridTitlePane2.setCollapsible(false);
        gridTitlePane2.setText("LISTA DE DOCUMENTOS");
        gridTitlePane2.setContent(gridPaneDocumentos);       
         
        containerCenter.getChildren().addAll(gridTitlePane2);
        containerCenter.setAlignment(Pos.TOP_LEFT);
    return containerCenter;
    }
    
}
