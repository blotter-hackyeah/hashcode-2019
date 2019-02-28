package pl.blotter.hashcode;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try {
            try (Scanner inputScanner = new Scanner(Paths.get("/home/molok/hashcode/hashcode-2019/src/main/resources/testdata/a_example.txt"))) {
                int numberOfPhotos = inputScanner.nextInt();
                HashMap<Integer, List<String>> verticalPhotos = new HashMap<Integer, List<String>>();
                HashMap<Integer, List<String>> horizontalPhotos = new HashMap<Integer, List<String>>();
                for (int i = 0; i < numberOfPhotos; i++) {
                    System.out.println("photo "+i);
                    String hOrV = inputScanner.next();
                    int numberOfTags = inputScanner.nextInt();
                    ArrayList<String> tags = new ArrayList<String>();
                    for (int j = 0; j < numberOfTags; j++) {
                        String tag = inputScanner.next();
                        tags.add(tag);
                    }
                    if(hOrV.trim().equals("H")){
                        horizontalPhotos.put(i,tags);
                    }else {
                        verticalPhotos.put(i, tags);
                    }
                }
                System.out.println("horizontalPhotos = " + horizontalPhotos);
                System.out.println("verticalPhotos = " + verticalPhotos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
