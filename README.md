# REST-API-CLIENT

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: MADAMSETTY SAI VENKAT AKSHAT

*INTERN ID*: CT08UFI

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

## Overview
*WeatherApp* is a command-line Java application designed to provide real-time weather data for any city using the [OpenWeather API](https://openweathermap.org/). The application integrates JSON parsing through the org.json library to efficiently extract and display weather details such as temperature, weather conditions, and city information.

This project aims to deliver a simple yet powerful weather forecasting solution with a focus on error handling, data accuracy, and seamless user interaction via a command-line interface (CLI).

## Key Features
- *Real-Time Data Fetching:* The application retrieves current weather conditions directly from the OpenWeather API for any valid city name provided by the user.
- *Accurate Data Display:* Displays essential details like city name, temperature, and weather conditions.
- *Error Handling:* Ensures robust error management to handle invalid city names, network failures, and API-related issues.
- *Lightweight and Efficient:* Designed to be a minimal yet powerful CLI application for quick weather updates.
- *User-Friendly Interface:* Clear and concise data presentation for improved usability.

## Technologies Used
- *Java* (Primary programming language)
- *OpenWeather API* (For fetching real-time weather data)
- **org.json Library** (For efficient JSON parsing)
- *Command-Line Interface (CLI)* (For flexible user interaction)

## Prerequisites
Ensure the following are installed on your system:
- *Java Development Kit (JDK)* (Version 8 or above recommended)
- org.json library (e.g., json-20240303.jar)

## Setup Instructions
1. Clone this repository:
   bash
   git clone <repository-url>
   cd WeatherApp
   
2. Download the org.json library from [Maven Repository](https://mvnrepository.com/artifact/org.json/json).
3. Compile the Java source file:
   bash
   javac -cp .:json-20240303.jar WeatherApp.java
   
4. Run the application with a city name as an argument:
   bash
   java -cp .:json-20240303.jar WeatherApp <CityName>
   

## Results

![Image](https://github.com/user-attachments/assets/24d89fca-ca50-40b3-a115-00fbb367c778)



## API Information
This application uses the *OpenWeather API*. To acquire your API key:
1. Sign up at [OpenWeather](https://home.openweathermap.org/users/sign_up).
2. Generate an API key from your profile dashboard.
3. Replace the apiKey variable in WeatherApp.java with your generated key.

java
String apiKey = "<YOUR_API_KEY>";


## Error Handling
- If the city name is invalid or misspelled, the program will gracefully handle the error and prompt the user accordingly.
- API errors such as rate limits or network failures are also managed to ensure smooth execution.
;
