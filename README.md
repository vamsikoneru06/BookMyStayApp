# BookMyStayApp


A Java-based project demonstrating incremental software engineering challenges including fair request handling and inventory consistency.

## Project Structure
- **Use Case 1**: Basic application entry point and JVM execution.
- **Use Case 2**: Domain modeling using Inheritance, Abstraction, and Polymorphism.
- **Use Case 3**: Centralized state management using `HashMap` for $O(1)$ lookup performance.
- **Use Case 4**: Enable guests to view available rooms and their details without modifying system state, reinforcing safe data access and clear separation of responsibilities.
- **Use Case 5**: Handle multiple booking requests fairly by introducing a request intake mechanism that preserves arrival order, reflecting real-world booking behavior during peak demand.
- **Use Case 6**: Confirm booking requests by assigning rooms safely while ensuring inventory consistency and preventing double-booking under all circumstances.

## Getting Started

### Prerequisites
* Java Development Kit (JDK) installed.

### Compilation & Execution
1. **Compile the classes:**
   ```bash
   javac UseCase1HotelBookingApp.java
   javac UseCase2RoomInitialization.java
   javac UseCase3InventorySetup.java
   javac Reservation.java
   javac RoomSearchService.java
   javac RoomAllocationService.java
2. **Compile the classes:**
   ```bash
   java UseCase1HotelBookingApp
   java UseCase2RoomInitialization
   java UseCase3InventorySetup
   java Reservation
   java RoomSearchService
   java RoomAllocationService
   
