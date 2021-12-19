package pairmatching;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import pairmatching.controller.PairProgrammingController;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
//        PairProgrammingController pairProgrammingController = new PairProgrammingController();
//        pairProgrammingController.run();

        try {
            extracted();
        } catch (IOException ioException) {
            System.out.println(ioException);
        }
    }

    private static void extracted() throws IOException {
        String crewMember = "";
        File f = new File("./src/main/resources/backend-crew.md");
        System.out.println(f.exists());
        FileReader reader = new FileReader("./src/main/resources/backend-crew.md");
        int ch;
        while ((ch = reader.read()) != -1) {
            crewMember += (char)ch + ",";
        }
        System.out.println(crewMember);
    }
}
