package ug.interfaz;

import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class InterfazMenu extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        MenuBar menuBar=new MenuBar();

        Menu menuArchivo=new Menu("ARCHIVO");
        Menu menuEditar=new Menu("EDITAR");
        Menu menuAyuda=new Menu("AYUDA");
        menuBar.getMenus().addAll(menuArchivo,menuEditar,menuAyuda);

        MenuItem archivoNuevo=new MenuItem("NUEVO");
    }

}
