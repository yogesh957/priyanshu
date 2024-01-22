class ArrayList <T>{
    int DEFAULT_SIZE =10;
    Object [] arr;
    int size  = 0;
    ArrayList() {
        arr = new Object[DEFAULT_SIZE];

    }
    public void add(T num) {
        if(isFulll()) {
            resize();
        }
        arr[size++] = num;
    }

    private void resize() {
        Object [] temp = new Object[DEFAULT_SIZE * 2];
        for(int i=0;i<arr.length;i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    private boolean isFulll() {
       return size == DEFAULT_SIZE;

    }
}


public class gene {

    public static void main(String[] args) {
        ArrayList <String>a = new ArrayList<String>();
        a.add("BAMBA");
    }



}
