package array;

/**
 * Created by DELL on 2018/10/12.
 */
public class Array {

    private int[] data;
    private int size;

    /**
     *
     * @param capacity
     */
    public Array(int capacity){
        data = new int[capacity];
        size=0;
    }
    //无参数的构造函数
    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addLast(int e){
       add(size,e);
    }

    public void addFirst(int e){
        add(0,e);
    }


    public void add(int index,int e){
        if (size==data.length){
            throw new IllegalArgumentException("Add failed.Array is fulll.");
        }
        if (index<0 || index>size){
            throw new IllegalArgumentException("Add failed.Require index<0 || index>size.");
        }

        for (int i=size-1;i>=index;i--){
            data[i+1] = data[i];

        }
        data[index] =e;
        size++;

    }


    public int get(int index){
        if (index<0 || index>=size){
            throw new IllegalArgumentException("get failed.Index is illegal");
        }
        return data[index];
    }

    public void set(int index,int e){

        if (index<0 || index>=size){
            throw new IllegalArgumentException("get failed.Index is illegal");
        }
        data[index] = e;

    }

    public boolean contains(int e){
        for (int i=0;i<size;i++){
            if (data[i]==e){
                return true;
            }
        }
        return false;
    }

    public  int find(int e){

        for (int i=0;i<size;i++){
            if (data[i]==e){
               return i;
            }
        }
        return -1;
    }

    public void delete(int index){

    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size=%d, capacity=%d\n",size,data.length));
        res.append("[");
        for (int i=0;i<size;i++){
            res.append(data[i]);
            if (i!=size-1){
                res.append(", ");
            }


        }
        res.append("]");
        return res.toString();
    }
}
