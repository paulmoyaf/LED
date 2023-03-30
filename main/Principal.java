package main;
import java.io.IOException;
import java.sql.SQLException;

//import terminal.MenuTerminal;
import formularios.FormLed;
import formularios.FormListener;

public class Principal {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, Exception {

        //MenuTerminal.menuTerminal();
        try {
            FormLed form = new FormLed();
            FormListener le = new FormListener();
            form.addWindowListener(le);
            form.setVisible(true);   
        } catch (Exception e) {
            System.out.println("error conexion");
            // TODO: handle exception
        }
        
    }
}
