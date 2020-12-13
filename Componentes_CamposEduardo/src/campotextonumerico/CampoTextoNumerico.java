package campotextonumerico;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

public class CampoTextoNumerico extends TextField
{
    public CampoTextoNumerico()
    {
        super();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CampoTextoNumericoView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        
        try
        {
            fxmlLoader.load();
        }
        catch(IOException ex)
        {
            //throw new RuntimeException(ex);
        }
    }
        @Override                 
        public void replaceText(int start, int end, String text)
        {
            if (!text.matches("[a-z, A-Z]"))            
                super.replaceText(start, end, text);                 
        }

        @Override
        public void replaceSelection(String text)
        {
            if (!text.matches("[a-z, A-Z]"))
                super.replaceSelection(text);
        }            
}
