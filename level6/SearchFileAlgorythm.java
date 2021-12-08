package d;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class SearchFileAlgorythm {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchMethod(new File("F:\\"), fileList);
        for (File file: fileList){
            System.out.println(file.getAbsolutePath());
        }
    }

    private static void searchMethod(File rootFile, List<File> fileList){
if (rootFile.isDirectory()){
    System.out.println("searching at: " + rootFile.getAbsolutePath());
    File[] directoryFiles = rootFile.listFiles();
    if (directoryFiles!= null){
        for (File file:directoryFiles){
            if (file.isDirectory()){
                searchMethod(file, fileList);
            }else{
                if (file.getName().toLowerCase().endsWith(".jpg")){
                    fileList.add(file);
                }
            }
        }
    }
}
    }
}