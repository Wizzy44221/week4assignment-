package bufferedAssignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            String desktopPath = System.getProperty("user.home") + "/Desktop";

//            FileReader fr = new FileReader(desktopPath + "/student.csv");

        String filePath = desktopPath + "/student.csv";

        List<String> studentLists = new ArrayList<>();


        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String Line;

            while ((Line = br.readLine()) != null) {

                studentLists.add(Line);

            }
            } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String [] studentListsArray = studentLists.toArray(new String[0]);

        for (String std:  studentListsArray) {
            System.out.println(std);


            }

        }

    }

