package binarylab.Model;

public class BinarySearchStep 
{
    private final int[] array;
    private final int target, low, mid, high;

    public BinarySearchStep(int[] array,int target,int low,int mid,int high) 
    {
        this.array = array;
        this.target = target;
        this.low = low;
        this.mid = mid;
        this.high = high;
    }

    public int[] getArray() {return array;}
    public int getTarget() {return target;}
    public int getLow() {return low;}
    public int getMid() {return mid;}
    public int getHigh() {return high;}
    
}
