package AnotherPackage;

import java.util.Arrays;

public class Test {
    public int n;
    String name;
    public int arr[];

    Test(int n,String name){
        this.n = n;
        this.name = name;
        this.arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
    }

    Test(Test X){
        //Copying the references (Shallow Copy)
        this.n = X.n;
        this.name = X.name;
        // this.arr = X.arr;
        this.arr = new int[this.n];
        for(int i=0;i<n;i++){
            this.arr[i] = X.arr[i];
        }
    }

    @Override
    public String toString() {
        return "Test{" +
                "n=" + n +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
