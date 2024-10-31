# Car Management Project (Lab 3 Java Software Development)

This project manages a collection of car objects, allowing for sorting and searching based on multiple attributes. It demonstrates object-oriented programming concepts in Java, including class definitions, comparators, and search algorithms.

## Assignment

Determine **C11** as the remainder of dividing the student's record book number 13879064  by 11.

Based on **C11**, determine the assignment variant:

| C11 | Assignment Variant                                                                     |
|-----|----------------------------------------------------------------------------------------|
| 1   | Define a car class consisting of at least 5 fields.                                    |

**Variant:**

- **C11 = 1**: Define a car class consisting of at least 5 fields.

## Features

- **Car Class**: Represents a car with at least five attributes: make, model, year, price, and VIN.
- **Sorting**:
  - Sorts the array of cars in ascending order using `CarComparator`.
  - Sorts the array of cars in descending order by reversing the comparator.
- **Searching**:
  - Performs a linear search to find a car identical to a given target car using the `equals` method.
- **Exception Handling**: Handles any exceptions that may occur during the execution of the code.
- **Documentation**: The code is thoroughly documented for clarity and understanding.
- **Code Standards**: Adheres to Java Code Conventions (or Google Java Style Guide).

## Requirements

- **Java Development Kit (JDK) 8** or higher installed on your system.
- **Git** (optional, for cloning the repository).

## How to Run

### Clone the Repository (Optional)

If the project is hosted on GitHub, clone it using:

```bash
git clone https://github.com/HlibPavlyk/car-array-manager.git
cd car-management/src
```

Alternatively, you can download the source code files directly.

### Compile the Source Code

Open a terminal or command prompt in the project directory and compile the Java files:

```bash
javac Car.java CarComparator.java Main.java
```

### Run the Program

After successful compilation, run the program using:

```bash
java Main
```

## Usage Instructions

1. **Starting the Program**:
   - Run `java Main` in your terminal.

2. **Program Execution**:
   - The program initializes an array of `Car` objects with predefined values.
   - It sorts the array in ascending order using `CarComparator` and displays the sorted list.
   - It then sorts the array in descending order by reversing the comparator and displays the sorted list.
   - Performs a linear search to find a car identical to a target car and displays the result.

3. **Results Display**:
   - The sorted lists of cars are displayed in the console.
   - The result of the search is displayed, indicating whether the car was found and its index.

## Example Output

```
Sorted in ascending order list of cars:
Car [Make=Chevrolet, Model=Impala, Year=2017, Price=18000.00, VIN=VIN005]
Car [Make=Ford, Model=Mustang, Year=2019, Price=25000.00, VIN=VIN006]
Car [Make=Ford, Model=Mustang, Year=2019, Price=30000.00, VIN=VIN003]
Car [Make=Honda, Model=Accord, Year=2020, Price=22000.00, VIN=VIN002]
Car [Make=Tesla, Model=Model 3, Year=2021, Price=35000.00, VIN=VIN004]
Car [Make=Tesla, Model=Model X, Year=2021, Price=35000.00, VIN=VIN004]
Car [Make=Toyota, Model=Camry, Year=2018, Price=20000.00, VIN=VIN001]

Sorted in descending order list of cars:
Car [Make=Toyota, Model=Camry, Year=2018, Price=20000.00, VIN=VIN001]
Car [Make=Tesla, Model=Model X, Year=2021, Price=35000.00, VIN=VIN004]
Car [Make=Tesla, Model=Model 3, Year=2021, Price=35000.00, VIN=VIN004]
Car [Make=Honda, Model=Accord, Year=2020, Price=22000.00, VIN=VIN002]
Car [Make=Ford, Model=Mustang, Year=2019, Price=30000.00, VIN=VIN003]
Car [Make=Ford, Model=Mustang, Year=2019, Price=25000.00, VIN=VIN006]
Car [Make=Chevrolet, Model=Impala, Year=2017, Price=18000.00, VIN=VIN005]

Found the car at index 4:
Car [Make=Ford, Model=Mustang, Year=2019, Price=30000.00, VIN=VIN003]
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
