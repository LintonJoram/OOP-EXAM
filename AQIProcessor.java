package com.airqo;

import java.util.Arrays;
import java.util.Random;

public class AQIProcessor {
    public static void main(String[] args) {
        // Initialize random number generator
        Random random = new Random();
        
        // Generate 30 random AQI readings between 1 and 300
        int[] aqiReadings = new int[30];
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; // Random value from 1 to 300
        }
        
        // Display AQI readings
        System.out.println("AQI Readings for 30 Days:");
        for (int i = 0; i < aqiReadings.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + aqiReadings[i]);
        }
        
        // Compute and display median AQI
        double median = calculateMedian(aqiReadings);
        System.out.printf("Median AQI: %.2f\n", median);
        
        // Count and display hazardous days (AQI > 200)
        int hazardousDays = countHazardousDays(aqiReadings);
        System.out.println("Number of Hazardous Days (AQI > 200): " + hazardousDays);
    }
    
    public static double calculateMedian(int[] readings) {
        // Create a copy to avoid modifying original array
        int[] sortedReadings = readings.clone();
        Arrays.sort(sortedReadings);
        
        // If length is even, average the two middle elements
        if (sortedReadings.length % 2 == 0) {
            int mid1 = sortedReadings.length / 2 - 1;
            int mid2 = sortedReadings.length / 2;
            return (sortedReadings[mid1] + sortedReadings[mid2]) / 2.0;
        } else {
            // If odd, return the middle element
            return sortedReadings[sortedReadings.length / 2];
        }
    }
    
    public static int countHazardousDays(int[] readings) {
        int count = 0;
        for (int aqi : readings) {
            if (aqi > 200) {
                count++;
            }
        }
        return count;
    }
}