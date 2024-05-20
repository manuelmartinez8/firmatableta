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
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

/**
 *
 * @author ManuelOrlandoMartíne
 */
public class ContainerListaFirmantes {
    
    public static VBox getListaFirmantes(){
    TitledPane gridTitlePane1 = new TitledPane();
     
        gridTitlePane1.setMaxWidth(Double.valueOf(200));
        gridTitlePane1.setMaxHeight(Double.valueOf(200));
         GridPane gridPaneFirmantes = new GridPane();
        gridPaneFirmantes.setVgap(2);
        gridPaneFirmantes.setPadding(new Insets(5, 5, 5, 5)); 
        
        ListView<String> listFirmantes = new ListView<>();
        ObservableList<String> names = FXCollections.observableArrayList();
        names.addAll(
             "Adam", "Alex", "Alfred", "Albert",
             "Brenda", "Connie", "Derek", "Donny", 
             "Lynne", "Myrtle", "Rose", "Rudolph", 
             "Tony", "Trudy", "Williams", "Zach"
        ); 
        
        //listFirmantes.getSelectionModel().getSelectedIndex()
        listFirmantes.setPrefHeight(200);
        listFirmantes.setPrefWidth(200);
        
        listFirmantes.getSelectionModel().selectedItemProperty().addListener(
        new ChangeListener<String>(){
        @Override
        public void changed(ObservableValue<? extends String> ov, String t, String t1) {           
          
           System.out.println("Firmante Seleccionado" + listFirmantes.getSelectionModel().getSelectedItem());
           // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
        }
        );
        
        listFirmantes.setItems(names);
        gridPaneFirmantes.add(listFirmantes, 1, 0);         
        gridTitlePane1.setCollapsible(false);
        gridTitlePane1.setText("LISTA DE FIRMANTES");
        gridTitlePane1.setContent(gridPaneFirmantes);
        
        VBox containerLeft = new VBox();        
        containerLeft.getChildren().addAll(gridTitlePane1);
        containerLeft.setAlignment(Pos.TOP_LEFT);
        
        return containerLeft;
    }
    
   /* static class SelectNameCell extends ListCell<String> {
    @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            if (item != null) {
               System.out.println("Items Seleccionado" + item);
            }
    } }*/
    
}
