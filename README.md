# Prime Numbers Calculator

## Description
The Prime Numbers Calculator is a web application built using Spring Boot that allows users to calculate all prime numbers up to a specified upper boundary. It employs the Sieve of Eratosthenes algorithm for efficient prime number calculation.

## Features
- User-friendly web interface for entering the upper boundary.
- Displays all calculated prime numbers in a clear format.
- Built with Java 11 and Spring Boot.

## Before Running the Application

Ensure that your environment is set up correctly.

Check your Java version (11 or higher):

```bash
$ java -version
openjdk version "11.0.18" 2022-10-30 LTS
OpenJDK Runtime Environment Temurin-11.0.18+7 (build 11.0.18+7-LTS)
OpenJDK 64-Bit Server VM Temurin-11.0.18+7 (build 11.0.18+7-LTS, mixed mode, sharing)
```

Verify Maven installation (Java version 11 or higher SAME AS THE ABOVE):

```bash
$ mvn -v
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
Maven home: C:\maven\apache-maven-3.9.9
Java version: 11.0.18, vendor: Eclipse Adoptium, runtime: C:\Program Files\Eclipse Adoptium\jdk-11.0.18+7-hotspot
Default locale: pl_PL, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

### System Setup

To ensure Maven and Java are properly configured on your system, follow these steps:

1. Right-click on "This PC" (or "Computer") and select "Properties."
2. Go to "Advanced system settings."
3. In "System Properties," click on "Environment Variables."
4. Under the "Path" variable, make sure the following paths or alike are present:
   - `C:\maven\apache-maven-3.9.9\bin`
   - `%JAVA_HOME%\bin` (make sure `%JAVA_HOME%` is correctly set)

5. The `JAVA_HOME` variable should point to the correct JDK path, for example:
   - `C:\Program Files\Eclipse Adoptium\jdk-11.0.18+7-hotspot`

Ensure these paths are set correctly for the project to run without issues.

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
