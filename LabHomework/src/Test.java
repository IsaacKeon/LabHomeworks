import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) throws Exception

    {

        URL imageLocation = new URL(

                "https://tse1.mm.bing.net/th?id=OIP.JPllmkWBqX_ALvUO_DAnZwHaE7&pid=Api&P=0&h=220");

        JOptionPane.showMessageDialog(null, "Mountain!", "Landscape",

                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

    }

}