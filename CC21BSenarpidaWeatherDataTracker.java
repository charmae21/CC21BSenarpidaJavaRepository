package com.mycompany.cc21bsenarpidaweatherdatatracker;

/* Senarpida, Charmae A.
   CC2-1B
   11/20/2024
   Final Challenge No. 2: Weather Data Tracker (2D array)
*/

public class CC21BSenarpidaWeatherDataTracker {
    public static void main(String[] args) {
        // Initialize the 2D array for temperature data (3 cities, 7 days)
        int[][] temperatureData = {
            {30, 32, 33, 31, 29, 30, 28}, // City 1 temperatures
            {25, 27, 26, 28, 29, 26, 24}, // City 2 temperatures
            {35, 34, 36, 37, 38, 35, 33}  // City 3 temperatures
        };

        // Variables to store the results
        double[] averageTemperatures = new double[3];
        int[] highestTemperatures = new int[3];

        // Iterate through each city
        for (int city = 0; city < temperatureData.length; city++) {
            int totalTemperature = 0;
            int highestTemperature = Integer.MIN_VALUE;

            // Iterate through the days for each city
            for (int day = 0; day < temperatureData[city].length; day++) {
                int temp = temperatureData[city][day];
                totalTemperature += temp;

                if (temp > highestTemperature) {
                    highestTemperature = temp;
                }
            }

            // Calculate the average temperature for the city
            averageTemperatures[city] = totalTemperature / 7.0;
            highestTemperatures[city] = highestTemperature;
        }

        // Output the results
        for (int city = 0; city < 3; city++) {
            System.out.printf("City %d: Average Temperature = %.2f, Highest Temperature = %d\n",
                    city + 1, averageTemperatures[city], highestTemperatures[city]);
        }
    }
}

