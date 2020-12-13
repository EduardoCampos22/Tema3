/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusomicontrol;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import projectomicontrol.MiControl;




/**
 *
 * @author Eduardo
 */
public class AppUsoMiControl extends Application
{
    MiControl miControl = new MiControl();
    
    @Override
    public void start(Stage primaryStage) throws NoSuchMethodException, IOException
    {        
        StackPane rootMain = new StackPane(); 
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PruebaMiControl.fxml")); 
        Pane rootPruebaMiControl = fxmlLoader.load(); 
        rootMain.getChildren().add(rootPruebaMiControl);
                    
        
        miControl.setOnAction(new EventHandler<MouseEvent>()
        {
            
            @Override
            public void handle(MouseEvent event)
            {
                //introspeccion();               
            }
        });
        
        Pane root = new Pane();
        root.getChildren().add(miControl);
        
        Scene scene = new Scene(rootMain);
        
        primaryStage.setTitle("AppUsoMiControl");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /*
    public void introspeccion() throws NoSuchMethodException
    {
        MiControl miControl = new MiControl();
        
        // Mostrar por consola los Constructores.        
        System.out.println("------------------------------------------- Contructors -------------------------------------------");
        System.out.println(miControl.getClass().getConstructor());
        
        
        // Mostrar por consola los Métodos.        
        Method[] listaMetodos;
        
        listaMetodos = miControl.getClass().getDeclaredMethods();
        
            // Lista todos los métodos
        System.out.println("\n------------------------------------------- Methods -------------------------------------------");
        for(Method metodo: listaMetodos)
            System.out.println(metodo);
        
                
        // Mostrar por consola los Fields.
        Field[] listaFields;
        
        listaFields = miControl.getClass().getFields();
        
            // Lista todos los fields
        System.out.println("\n------------------------------------------- Fields -------------------------------------------");
        for(Field field: listaFields)
            System.out.println(field);
        
        
        // Mostrar por consola los Modifiers.
        System.out.println("\n------------------------------------------- Modifiers -------------------------------------------");
        System.out.println(miControl.getClass().getModifiers());
    }
    */
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
