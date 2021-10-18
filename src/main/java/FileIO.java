import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FileIO {

    public void readFileAndOutput(Path pathToFile) {
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (String line : currentList) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//        Path path = Paths.get("src", "FileIO.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
        Path toOurDataPlace = Paths.get("src/data");
//        System.out.println(toOurDataPlace);
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");
//        Path toOurDataFile = Paths.get("src/data/data.txt");

//        try {
//            if (Files.notExists(toOurDataPlace)){
//                Files.createDirectories(toOurDataPlace);
//        }else{
//            System.out.println("The " + toOurDataPlace + " directory already exists.");
//        }
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        try{
//            if(Files.notExists(toOurDataFile)){
//                Files.createFile(toOurDataFile);
//            }
//            Files.createFile(toOurDataFile);
//        }catch(IOException ioe){
//            ioe.printStackTrace();
//        }
//        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Messaline", "Julia Domna");
//
//        try{
//            Files.write(toOurDataFile, romanEmpresses);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }

        //Read from a file

        //create a place to put information from file
//        List<String> currentList = new ArrayList<>();
//
//        try{
//            currentList = Files.readAllLines(toOurDataFile);
//        }catch(IOException ioe){
//            ioe.printStackTrace();
//        }
//
//        for(String line : currentList){
//            System.out.println(line);
//        }
        FileIO io = new FileIO();
//        io.readFileAndOutput(toOurDataFile);

//        try{
//            Files.writeString(toOurDataFile, "Julia Maesa\n", StandardOpenOption.APPEND);
//        }catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        List<String> lateRomanEmpresses = new ArrayList<>();
//        lateRomanEmpresses.add("Galla Placidia");
//        lateRomanEmpresses.add("Thodora");
//        lateRomanEmpresses.add("Licinia Eudoxia");
//
//        try{
//            Files.write(toOurDataFile, lateRomanEmpresses, StandardOpenOption.APPEND);
//        }catch(IOException ioe){
//            ioe.printStackTrace();
//        }
//
        List<String> currentList = new ArrayList<>();
        try{
            currentList = Files.readAllLines(toOurDataFile);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        Iterator<String> listIterator = currentList.iterator();
        while(listIterator.hasNext()) {
            String empress = listIterator.next();
            if(empress.equals("Galla Placidia")){
                listIterator.remove();
            }
        }
        try{
            Files.write(toOurDataFile, currentList);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        io.readFileAndOutput(toOurDataFile);
    }
}
