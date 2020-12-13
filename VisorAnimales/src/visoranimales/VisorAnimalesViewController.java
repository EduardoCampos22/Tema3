/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * FXML Controller class
 *
 * @author Eduardo
 */
public class VisorAnimalesViewController implements Initializable
{

    @FXML
    private ListView<Animal> listViewAnimales;
    @FXML
    private ImageView imageViewAnimales;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        Animal perro = new Animal("Perro", "", "");
        Animal gato = new Animal("Gato", "", "");
        Animal pajaro = new Animal("Pájaro", "", "");
        
        ObservableList<Animal> listAnimales = FXCollections.observableArrayList(perro, gato, pajaro);       
                
        listViewAnimales.setItems(listAnimales);                                                               
        
        
        listViewAnimales.getSelectionModel().selectedItemProperty().addListener((property, oldValue, newValue)
                -> {
            ObservableList<Animal> convertedItems = FXCollections.observableList(
                    listViewAnimales.getSelectionModel().getSelectedItems()
                            .stream()
                            .collect(Collectors.toList()));
            
            String animales;
            
            animales = listViewAnimales.getSelectionModel().getSelectedItem().toString();
            if(animales == "Perro"){
                imageViewAnimales.setImage(new Image("Imagenes/perro.jpg"));
            }else if(animales == "Gato"){
                imageViewAnimales.setImage(new Image("Imagenes/gato.png"));
            }else if(animales == "Pájaro"){
                imageViewAnimales.setImage(new Image("Imagenes/pajaro.jpg"));
            }

        });


    }                                    
    
}
