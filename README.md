# Spring Student Absence Manager

A comprehensive web application built with Spring Boot to manage and monitor the absences of students in a kindergarten setting.

## Features

- **CRUD Operations**: Easily add, edit, view, and remove student records and their absences.
- **Thymeleaf Integration**: Utilizes Thymeleaf for dynamic template rendering.
- **JPA & Hibernate**: For seamless database operations and object-relational mapping.
- **MVC Architecture**: Clean and maintainable code structure thanks to Spring MVC.
- **Database**: Uses MySQL for data persistence.

## Getting Started

### Prerequisites

- JDK 8 or higher
- Maven
- MySQL Server

### Installation

1. **Clone the Repository**
   
git clone https://github.com/karimelhou/SpringStudentAbsenceManager.git

2. **Navigate to the Project Directory**

3. **Configure MySQL Database**

Make sure to set up a database in MySQL and configure the `application.properties` file with your database credentials.

4. **Run the Application**

The application will start and run on `http://localhost:8080`.

## Usage

1. **Manage Students**: 
- Navigate to `/student/all` to see the list of students and perform CRUD operations.
- Add new students at `/student/add`.

2. **Manage Absences**: 
- Navigate to `/absence/all` to see the list of absences and link them to respective students.
- Record new absences at `/absence/add`.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See `LICENSE` for more details.

## Acknowledgements

- Spring Boot and Spring MVC for the core structure.
- Thymeleaf for the templates.
- Lombok for reducing boilerplate code.
- JPA & Hibernate


