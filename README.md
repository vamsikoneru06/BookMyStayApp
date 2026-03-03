# BookMyStayApp

A Java-based project demonstrating incremental software engineering challenges including fair request handling and inventory consistency.

Goal: Replace scattered variables with a single, consistent data structure to solve state management problems.

Core Concepts

HashMap: A HashMap<String, Integer> maps room types to their available counts.

Single Source of Truth: Centralizing data into one structure eliminates discrepancies caused by multiple variables representing the same state.

Time Complexity ($O(1)$): HashMap provides average constant-time complexity for lookups and updates, making it ideal for frequent availability checks.

### Project Structure
- **Use Case 3**: Centralized state management using `HashMap` for $O(1)$ lookup performance.## Getting Started

### Prerequisites
* Java Development Kit (JDK) installed.

### Compilation & Execution
1. **Compile the classes:**
   ```bash
   javac UseCase3InventorySetup.java
2. **Run the program**
    ```bash
   java UseCase3InventorySetup
