package org.example;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Opening Browser");
        try {
            // Adjust the path if your index.html is somewhere else
            File htmlFile = new File("src/main/resources/static/index.html");

            if (htmlFile.exists()) {
                Desktop.getDesktop().browse(htmlFile.toURI());
            } else {
                System.out.println("HTML file not found at: " + htmlFile.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Thread.sleep(10000);
        System.out.println("Resume is online!");
    }
}
