import java.io.IOException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class HelloWorld{

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("JEP 330: single file source code");

        ProcessBuilder processBuilder = new ProcessBuilder();
        
        processBuilder.command("ls", "-l", "/home");
        
        Process process = processBuilder.start();

        try (var reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line = reader.lines().collect(Collectors.joining("\n"));
            System.out.println(line);
        }
    }
    
}
