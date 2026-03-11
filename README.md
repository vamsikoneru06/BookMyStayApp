# BookMyStayApp

A Java-based project demonstrating incremental software engineering challenges including fair request handling and inventory consistency.

### Use Case 4
#### Goal: Handle multiple booking requests fairly using a First-Come-First-Served (FIFO) mechanism.

#### Concept: Queue Data Structure. A Queue<Reservation> is used to preserve the exact order of arrival.

#### Fairness: Guarantees that the earliest requests are processed first, mimicking real-world behavior during peak demand.

#### Decoupling: Separates the intake of a request (intent) from the actual allocation of a room.


### Prerequisites
* Java Development Kit (JDK) installed.

### Compilation & Execution
1. **Compile the classes:**
   ```bash
   javac Reservation.java
2. **Run the program**
    ```bash
   java Reservation
