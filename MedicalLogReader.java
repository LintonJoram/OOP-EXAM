package com.lacorhospital;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MedicalLogReader {
    public static void main(String[] args) {
        // Define the medical log file
        File medicalLogFile = new File("medical_log.txt");
        
        
        // Read and display file content
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(medicalLogFile));
            String line;
            System.out.println("Medical Log Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + medicalLogFile.getName() + "' not found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
