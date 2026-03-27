# Sports Events Calendar

A Spring Boot web backend application for managing and viewing sports events with PostgreSQL database.

## Prerequisites for running

- [Docker](https://www.docker.com/get-started) installed
- [Docker Compose](https://docs.docker.com/compose/install/) installed
- Git

## Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/eldzej2137/calendar.git
   cd calendar
   ```

2. **Create environment file:**
   ```bash
   cp .env.example .env
   ```
   
   Edit `.env` and set your desired PostgreSQL password. The password is held in a separate file for security reasons.

3. **Start the application:**
   ```bash
   docker-compose up --build
   ```

4. **Access the application:**
   - Web Application: http://localhost:8080
   - PostgreSQL Database: localhost:5432


## Running Without Docker

If you prefer to run locally without Docker:

1. Install Java 17 and Maven
2. Install PostgreSQL and create `calendardb` database
3. Create `src/main/resources/application.properties` and update it with your DB credentials
4. Run: `mvn spring-boot:run`

## Technology stack used in the project

- **Backend:** Spring Boot 4.0.4
- **Language:** Java 17
- **Database:** PostgreSQL 16
- **ORM:** Spring Data JPA / Hibernate
- **Template Engine:** Thymeleaf
- **Build Tool:** Maven
- **Containerization:** Docker

## Some important project decisions

- The data on the main page is retrieved using an SQL query (as defined in *EventRepository*), which maps to a list of *EventProjection* instances including only the relevant informations.
- The *EventController* has API GET endpoints for retrieving a list of all events or a single event by id, both as full *Event* objects (with all the data from the database) and as *EventProjections* (with only the data that should be displayed). There is also a POST endpoint to add an event to the database.