package binarylab.ui.views;

import java.util.List;

import binarylab.Model.BinarySearchStep;
import binarylab.algorithms.searching.BinarySearch;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BinarySearchView 
{
    private final VBox root;
    private final Label stepLabel;
    private final Label stateLabel;
    private final List<BinarySearchStep> steps;
    private int currentStep = 0;

     public BinarySearchView() 
     {
        root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        int[] array = {2, 5, 8, 12, 16, 23, 38, 45};
        int target = 23;

        BinarySearch binarySearch = new BinarySearch();
        steps = binarySearch.search(array, target);
        stepLabel = new Label();
        stateLabel = new Label();
        root.getChildren().addAll(stepLabel,stateLabel);
        renderStep();
    }

    private void renderStep() 
    {
        BinarySearchStep step = steps.get(currentStep);
        stepLabel.setText("Step " + (currentStep + 1) +" / " + steps.size());
        stateLabel.setText("Low: " + step.getLow() +"   Mid: " + step.getMid() +"   High: " + step.getHigh());
    }
    public VBox getRoot() {return root;}
}