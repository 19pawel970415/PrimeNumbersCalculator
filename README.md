# Prime Numbers Calculator

## Description
The Prime Numbers Calculator is a web application built using Spring Boot that allows users to calculate all prime numbers up to a specified upper boundary. It employs the Sieve of Eratosthenes algorithm for efficient prime number calculation.

## Features
- User-friendly web interface for entering the upper boundary.
- Displays all calculated prime numbers in a clear format.
- Built with Java 11 and Spring Boot.

## How to Run the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/19pawel970415/PrimeNumbersCalculator.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd your_path_to_dir_with_project/PrimeNumbersCalculator
   ```

3. **Run the application** (one command):
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**:
    - Open your web browser and navigate to `http://localhost:8082/`.

## Build Tools
- **Java Version**: 11
- **Build Tool**: Maven 3.8.1 (or your current version)

## Project Structure
```
PrimeNumbersCalculator/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── primenumberscalculator/
│   │   │               ├── PrimeNumbersCalculatorApplication.java
│   │   │               └── PrimeController.java
│   │   └── resources/
│   │       └── templates/
│   │           └── index.html
|   |       └── application.properties
├── pom.xml
└── README.md
```

## License
This project is open-source and available under the MIT License.

## Acknowledgments
- Thanks to the Spring Boot community for providing a robust framework for developing web applications.
