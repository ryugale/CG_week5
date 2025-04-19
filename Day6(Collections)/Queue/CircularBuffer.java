import java.util.Arrays;

public class CircularBuffer {
    public static void main(String[] args) {
        CircularArray arr = new CircularArray();
        for(int i = 0; i< 15; i++){

            arr.add((int)(Math.random()*10));
        }
    }    
}

class CircularArray{
    int[] arr;
    int index;

    CircularArray(){
        arr = new int[10];
        index = 0;
    }

    void add(int num){
        arr[index % arr.length] = num;
        index++;
        display();
    }

    void display(){
        System.out.println(Arrays.toString(arr));
    }
}