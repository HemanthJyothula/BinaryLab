package binarylab;

import binarylab.ui.MainWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage stage) 
    {
        MainWindow mainWindow = new MainWindow();
        Scene scene = new Scene(mainWindow.getRoot(), 1000, 600);
        stage.setTitle("Binary Lab");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) 
    {
        launch();
    }
}