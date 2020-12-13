/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusomicontrol;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import projectomicontrol.MiControl;

/**
 * FXML Controller class
 *
 * @author Eduardo
 */
public class PruebaMiControlController implements Initializable
{

    @FXML
    private AnchorPane rootPruebaMiControl;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
    }    

    @FXML
    private void OnMouseClicked(MouseEvent event) throws NoSuchMethodException
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
    
}
