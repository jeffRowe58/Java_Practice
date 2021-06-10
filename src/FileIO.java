import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FileIO {

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
        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Messaline", "Julia Domna");

        try{
            Files.write(toOurDataFile, romanEmpresses);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
