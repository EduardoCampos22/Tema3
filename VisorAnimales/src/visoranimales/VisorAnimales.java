/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoranimales;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Eduardo
 */
public class VisorAnimales extends Application
{
    
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        StackPane rootMain = new StackPane();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VisorAnimalesView.fxml")); 
        Parent rootAnimales = fxmlLoader.load();
        rootMain.getChildren().add(rootAnimales);
        
        VisorAnimalesViewController visorAnimales = (VisorAnimalesViewController)fxmlLoader.getController();        
        
        Scene scene = new Scene(rootMain);
        
        primaryStage.setTitle("Visor Animales");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
