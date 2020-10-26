package service;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ListBook {
    private Scanner file;
    public String[] array;
    protected static String buy;

    ArrayList<String> arrayList = new ArrayList<>();

    public void openFile(String string){
        try {
            file = new Scanner( new File(string));
        }catch (Exception e){
            System.out.println("Файл не найден");
        }
    }


    public void readFile(){
        while (file.hasNextLine()) {
            arrayList.add(file.nextLine());

        }
    }

    public void printFile(){
        array = arrayList.toArray(new String[0]);

        for (String i : array) {
            System.out.println(i);
        }

    }

    public void choice(int a){
       this.buy = array[a];
    }

    public void closeFile(){
        file.close();
    }
}
