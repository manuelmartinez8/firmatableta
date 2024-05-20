package com.sepe.firmaproject;


import com.sepe.firmaproject.components.ContainerFirma;
import com.sepe.firmaproject.components.ContainerListaFirmantes;
import com.sepe.firmaproject.components.ContanierListaDocumentos;
import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    //metodo que sirve para inicializar elementos antes de la ejecucion
    @Override
    public void init(){
        System.out.println("Iniciando Sistema");
    }

    @Override
    public void start(Stage stage) {  
        
        HBox rootFinal = new HBox();// cuadro mayor
        rootFinal.getChildren().addAll(ContainerListaFirmantes.getListaFirmantes(), ContanierListaDocumentos.getListaDocumentos(), ContainerFirma.getPanelFirma());
        rootFinal.setStyle("-fx-background-color: WHITE;");
        HBox.setHgrow(ContainerListaFirmantes.getListaFirmantes(), Priority.ALWAYS);
        HBox.setHgrow(ContanierListaDocumentos.getListaDocumentos(), Priority.ALWAYS);
        HBox.setHgrow(ContainerFirma.getPanelFirma(), Priority.ALWAYS);
         
        
        VBox rootVertical = new VBox();
        
        Image img = new Image(getClass().getResourceAsStream("/img/banneSepe.png"));
        
        ImageView imgView = new ImageView(img);  
        imgView.setFitWidth(623);
        imgView.setFitHeight(80);
        Label labelMsg = new Label("Seleccione un firmante y firme sus documentos.");
        rootVertical.getChildren().addAll(imgView,labelMsg,rootFinal);
        
        
        
        StackPane.setMargin(rootVertical, new Insets(10));
        StackPane rootFinal2 = new StackPane(rootVertical);
         
        
        var scene = new Scene(rootFinal2, 640, 350);
        stage.setTitle("Proyecto Firma");       
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
        //metodo que sirve para finalizar elementos y conexiones a BD 
    @Override
    public void stop(){
        System.out.println("Cerrando Conexiones");
    }

}