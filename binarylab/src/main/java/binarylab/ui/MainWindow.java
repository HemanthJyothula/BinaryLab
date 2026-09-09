package binarylab.ui;

import binarylab.ui.views.BinarySearchView;
import javafx.scene.layout.BorderPane;

public class MainWindow 
{
    private final BorderPane root;
    public MainWindow() 
    {
        root = new BorderPane();
        BinarySearchView binarySearchView = new BinarySearchView();
        root.setCenter(binarySearchView.getRoot());
    }
    public BorderPane getRoot() {return root;}
}