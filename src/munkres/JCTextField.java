package munkres;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Locale;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.BorderUIResource;

/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class JCTextField extends JTextField{
    
   
    private String placeholder = "";
    private Color phColor= new Color(0,0,0);
    private boolean band = true;
    
    /** Constructor de clase */
    public JCTextField()
    {
        super();
      
        //setHorizontalAlignment(JCTextField.WIDTH/2);
        setVisible(true);
        setMargin( new Insets(3,6,3,6));
        //atento a cambios 
        getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void removeUpdate(DocumentEvent e) {
                band = (getText().length()>0) ? false:true ;
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                band = false;
            }

            @Override
            public void changedUpdate(DocumentEvent de) {}
          
        });
    }
    
    public void setPlaceholder(String placeholder)
    {
        this.placeholder=placeholder;
    }
    
    public String getPlaceholder()
    {
        return placeholder;
    }

    public Color getPhColor() {
        return phColor;
    }

    public void setPhColor(Color phColor) {
        this.phColor = phColor;
    }    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //color de placeholder                         
        g.setColor( new Color(phColor.getRed(),phColor.getGreen(),phColor.getBlue(),90));
        //dibuja texto
        g.drawString((band)?placeholder:"",
                     getMargin().left,
                     (getSize().height)/2 + getFont().getSize()/2 );
      }
    
}//JCTextField:end
