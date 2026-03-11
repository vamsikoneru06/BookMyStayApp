# BookMyStayApp

A Java-based project demonstrating incremental software engineering challenges including fair request handling and inventory consistency.

### Use Case 4
#### Goal: Enable guests to view available rooms without modifying the system state.

#### Concept: Read-Only Access. Search operations are designed to read data without altering it, preventing accidental inventory corruption.

#### Safety: Implements Defensive Programming by excluding room types with zero availability from results.

#### Benefit: Clear separation between searching (read) and booking (write) operations.



### Prerequisites
* Java Development Kit (JDK) installed.

### Compilation & Execution
1. **Compile the classes:**
   ```bash
   javac RoomSearchService.java
2. **Run the program**
    ```bash
   java RoomSearchService
