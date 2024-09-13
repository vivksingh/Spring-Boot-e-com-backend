# E-Commerce Backend with Spring Boot

This is a backend project for an e-commerce platform, built using **Spring Boot**. The project follows the **Model-View-Controller (MVC)** architecture and provides essential backend functionality for managing products, orders, and more.

## Key Features

- **MVC Architecture**: Clean separation of concerns between controllers, services, and repositories.
- **H2 In-Memory Database**: Used for rapid development and testing. This database allows the app to run without requiring external dependencies.
- **CRUD Operations**: Full Create, Read, Update, Delete functionality for managing e-commerce entities like products, orders, and users.
- **Image Data Handling**: Allows the backend to store and retrieve image files associated with products.
- **Search Functionality**: Provides a flexible search feature, enabling users to search across product names, brands, descriptions, and categories.

## Technologies Used

- **Spring Boot**
- **H2 Database** (in-memory)
- **JPA/Hibernate** for data persistence
- **Maven** for project management
- **Java 21** (or your version)

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/vivksingh/Spring-Boot-e-com-backend.git
    ```

2. Navigate to the project directory:
    ```bash
    cd ecommerce-backend
    ```

3. Run the project using Maven:
    ```bash
    mvn spring-boot:run
    ```

4. Access the application:
    - The app will run on `http://localhost:8080`.
    - H2 database console available at `http://localhost:8080/h2-console`.

## Endpoints

- **GET /products** - List all products.
- **POST /products** - Add a new product.
- **PUT /products/{id}** - Update an existing product.
- **DELETE /products/{id}** - Delete a product.
- **GET /products/search?keyword={keyword}** - Search products by name, brand, description, or category.

## Future Enhancements

- Integration with an external relational database (e.g., MySQL, PostgreSQL).
- User authentication and authorization (Spring Security).
- Adding order and cart management features.

Feel free to contribute or reach out with any questions!
