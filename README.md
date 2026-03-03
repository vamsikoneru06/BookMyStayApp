# BookMyStayApp

A Java-based project demonstrating incremental software engineering challenges including fair request handling and inventory consistency.

Goal: Focus on domain design through inheritance and abstraction before introducing complex data structures.

Core Concepts

Abstraction: The Room class is an abstract concept that cannot be instantiated directly; it defines common attributes shared by all room types.

Inheritance: Concrete classes like SingleRoom and SuiteRoom extend the Room class to reuse shared properties while allowing for specialization.

Encapsulation: Room attributes (beds, size, price) are hidden within the class and controlled through defined behavior.

Polymorphism: Referencing different room implementations using the base Room type allows for uniform handling and future extensibility
## Project Structure
- **Use Case 2**: Domain modeling using Inheritance, Abstraction, and Polymorphism.
## Getting Started

### Prerequisites
* Java Development Kit (JDK) installed.

### Compilation & Execution
1. **Compile the classes:**
   ```bash
   javac UseCase2RoomInitialization.java
2. **Run the program**
    ```bash
   java UseCase2RoomInitialization
