import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        int size = 50;
        char[][] mapa = new char[size][size];

        try{
           ArrayList<String> fileLines = fileHandler.reader("C:\\Users\\luisf\\IdeaProjects\\t1-alest2\\src\\TestFiles\\casoD50.txt");

            for (int i = 2; i < fileLines.size(); i++) {
                String line = fileLines.get(i);
                for (int j = 0; j < line.length(); j++) {
                    mapa[i-2][j] = line.charAt(j);
                }
            }
//            for (int i = 0; i < size; i++) {
//                for (int j = 0; j < size; j++) {
//                    System.out.print(mapa[i][j]);
//                }
//                System.out.println();
//            }


        }catch (IOException e){
            System.out.println(e);
        }

    }
}