# Lab 1
### Author: Anton Bur, Group IP-22, Variant #3

---

### Variant Calculations
| Parameter | Formula       | Result |  
|-----------|---------------|--------|  
| **C5**    | `3 % 5`       | 3      |  
| **C7**    | `3 % 7`       | 3      |  
| **C11**   | `3 % 11`      | 3      |  

### Task Variants
| Step | Description                                              | Details                              |  
|------|----------------------------------------------------------|--------------------------------------|  
| **2** | Operation on Matrix `C`:                                | `C = A XOR B` (Bitwise Exclusive OR) |  
| **3** | Data Type of Matrix Elements:                          | `int`                                |  
| **4** | Operation on Resulting Matrix `C`:                     | Sum of the largest elements per row |  

---

### How to Run the Project

#### Prerequisites
Ensure [Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) is [installed](https://maven.apache.org/download.cgi) on your computer.

#### Steps to Execute
1. Clone the repository:
   ```bash  
   git clone https://github.com/AntonIO-OI/Java-Lab1
   cd Java-Lab1
   ```  

2. Build the project (this will also run unit tests):
   ```bash  
   mvn package  
   ```  

3. Run the project:
   ```bash  
   mvn clean compile exec:java  
   ```  

4. Run unit tests:
   ```bash  
   mvn test  
   ```  
