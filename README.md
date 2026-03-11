# BookMyStayApp

A Java-based project demonstrating incremental software engineering challenges including fair request handling and inventory consistency.

### Use Case 4
#### Goal: Confirm booking requests by assigning unique room IDs while ensuring inventory consistency.

#### Concept: Uniqueness Enforcement. Uses a Set<String> to store allocated room IDs, preventing the same room from being assigned twice.

#### Atomic Operations: Room assignment and inventory updates occur together to avoid inconsistent system states.

#### Benefit: Total elimination of "double-booking" scenarios through immediate synchronization.

### Prerequisites
* Java Development Kit (JDK) installed.

### Compilation & Execution
1. **Compile the classes:**
   ```bash
   javac RoomAllocationService.java
2. **Run the program**
    ```bash
   java RoomAllocationService
