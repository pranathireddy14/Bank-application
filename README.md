# Banking Application

This is a full-stack banking application that consists of a backend built with Spring Boot and a frontend developed using React. The application allows users to manage bank accounts, including creating, updating, and deleting accounts, as well as performing transactions like deposits and withdrawals.

## Project Structure

The project is organized into two main directories: `backend` and `frontend`.

### Backend

The backend is implemented in Java using Spring Boot. It includes the following components:

- **Controller**: Handles HTTP requests related to bank accounts.
  - `AccountController.java`: Contains methods for creating, retrieving, updating, and deleting accounts.

- **Model**: Represents the data structure of the application.
  - `Account.java`: Defines the properties of a bank account, such as account ID, account holder name, and balance.

- **Repository**: Interfaces for data access.
  - `AccountRepository.java`: Extends JPA repository for CRUD operations on Account entities.

- **Service**: Contains business logic.
  - `AccountService.java`: Implements methods for account management.

- **Configuration**: Application properties.
  - `application.properties`: Contains configuration settings for the Spring Boot application.

- **Tests**: Unit tests for the service layer.
  - `AccountServiceTest.java`: Tests the functionality of the AccountService class.

- **Maven Configuration**: 
  - `pom.xml`: Specifies project dependencies and build settings.

### Frontend

The frontend is developed using React and Vite. It includes the following components:

- **HTML Entry Point**:
  - `index.html`: The main HTML file that serves as the entry point for the React application.

- **React Components**:
  - `AccountComponent.jsx`: Displays account information and allows users to perform actions like deposit and withdraw.
  - `App.jsx`: The root component that sets up routing and renders other components.

- **JavaScript Entry Point**:
  - `index.js`: Renders the App component into the DOM.

- **NPM Configuration**:
  - `package.json`: Lists dependencies, scripts, and project metadata.

- **Build Configuration**:
  - `vite.config.js`: Configuration settings for Vite.

## Getting Started

To run the application, follow these steps:

1. **Backend**:
   - Navigate to the `backend` directory.
   - Build the project using Maven: `mvn clean install`.
   - Run the Spring Boot application: `mvn spring-boot:run`.

2. **Frontend**:
   - Navigate to the `frontend` directory.
   - Install dependencies: `npm install`.
   - Start the development server: `npm run dev`.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any improvements or bug fixes.

## License

This project is licensed under the MIT License.
