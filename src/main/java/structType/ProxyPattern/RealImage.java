package structType.ProxyPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list. add("1");

        list. add("2");

        Object[] list1 = list.toArray();

// array to list

        String[] array = new String[]{"1","2"};

        List<String> array1 = Arrays.asList(array);

    }
}
