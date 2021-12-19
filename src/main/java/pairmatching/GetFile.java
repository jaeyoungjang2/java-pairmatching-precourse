package pairmatching;



import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class GetFile {
    public static void getBackendCrew() {
        ClassLoader loader = GetFile.class.getClassLoader();
        try (FileInputStream file = new FileInputStream(Objects.requireNonNull(loader.getResource("backend-crew.md")).getFile());
            BufferedReader br = new BufferedReader(new InputStreamReader(file, StandardCharsets.UTF_8))) {

            String line = null;
            System.out.println(br.readLine());
        } catch (IOException ignored) {
        }
    }

    public static void getFrontendCrew() {
        ClassLoader loader = GetFile.class.getClassLoader();
        try (FileInputStream file = new FileInputStream(Objects.requireNonNull(loader.getResource("frontend-crew.md")).getFile());
            BufferedReader br = new BufferedReader(new InputStreamReader(file, StandardCharsets.UTF_8))) {

            String line = null;

        } catch (IOException ignored) {
        }
    }
}