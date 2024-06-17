package ug.interfaz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.stage.FileChooser;
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
        MenuItem abrirArchivo=new MenuItem("ABRIR");
        MenuItem guardarArchivo=new MenuItem("GUARDAR");
        MenuItem salirArchivo=new MenuItem("SALIR");
        menuArchivo.getItems().addAll(archivoNuevo,abrirArchivo,guardarArchivo,new SeparatorMenuItem(),salirArchivo);

        MenuItem cortar=new MenuItem("CORTAR");
        MenuItem copiar=new MenuItem("COPIAR");
        MenuItem pegar=new MenuItem("PEGAR");
        menuEditar.getItems().addAll(cortar,copiar,pegar);

        MenuItem acerca=new MenuItem("ACERCA DE");
        menuAyuda.getItems().add(acerca);

        archivoNuevo.setOnAction(e -> {
            TextInputDialog dialogo=new TextInputDialog("ARCHIVO NUEVO");
            dialogo.setTitle("NUEVO ARCHIVO");
            dialogo.setHeaderText("CREACIÓN DE UN NUEVO ARCHIVO");
            dialogo.setContentText("NOMBRE DEL ARCHIVO:");
            dialogo.showAndWait().ifPresent(name -> System.out.println("ARCHIVO CREADO: "+name));
        });

        abrirArchivo.setOnAction(e->{
            FileChooser chooser=new FileChooser();
            chooser.setTitle("ABRIR ARCHIVO");
            File f=chooser.showOpenDialog(arg0);
            if(f!=null){
                System.out.println("ARCHIVO ABIERTO: "+f.getName());
            }
        });

        guardarArchivo.setOnAction(e->{
            FileChooser chooser=new FileChooser();
            chooser.setTitle("GUARDAR ARCHIVO");
            File f=chooser.showSaveDialog(arg0);
            if(f!=null){
                try(FileWriter escrito=new FileWriter(f)){
                    escrito.write("UN CONTENIDO DE EJEMPLO.");
                    System.out.println("EL ARCHIVO HA SIDO GUARDADO: "+f.getName());
                }catch(IOException ie){
                    System.out.println("ERROR AL GUARDAR ESTE ARCHIVO: "+ie.getMessage());
                }
            }
        });
    }
}
