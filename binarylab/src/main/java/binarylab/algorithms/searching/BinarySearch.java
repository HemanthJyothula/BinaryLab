package binarylab.algorithms.searching;

import java.util.ArrayList;
import java.util.List;

import binarylab.Model.BinarySearchStep;

public class BinarySearch 
{
    public List<BinarySearchStep> search(int[] array, int target) 
    {
        List<BinarySearchStep> steps = new ArrayList<>();
        int low = 0;
        int high = array.length - 1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            steps.add(new BinarySearchStep(array, target, low, mid, high));
            if (array[mid] == target) break;
            if (array[mid] < target) low = mid + 1;
            else high = mid - 1;
            
        }
        return steps;
    }
}