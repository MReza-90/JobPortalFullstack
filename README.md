# Job Portal Project

This project is a comprehensive job portal application developed using Java, Spring Boot, JPA/Hibernate, Thymeleaf/HTML, and Maven. It facilitates the interaction between recruiters and job candidates, providing a streamlined process for job posting and application.

## Features

### Recruiter
- **Post New Job Listings**: Recruiters can create and post new job opportunities.
- **View Own Job Postings**: Recruiters can view a list of jobs they have posted.
- **Candidate Applications**: Recruiters can view the list of candidates who have applied for their jobs.
- **Edit Profile**: Recruiters can update their personal information.
- **Upload Profile Photo**: Recruiters can upload a profile picture.

### Job Candidate
- **Job Search**: Candidates can search for job opportunities using various filters.
- **Apply for Jobs**: Candidates can apply for jobs directly through the platform.
- **View Applied Jobs**: Candidates can see the list of jobs they have applied for.
- **Upload Resume/CV**: Candidates can upload their resume or CV to the platform.

## Technologies Used
- **Backend**: 
  - Java
  - Spring Boot
  - JPA/Hibernate
- **Frontend**: 
  - Thymeleaf
  - HTML
  - CSS
  - JavaScript
- **Build Tool**: Maven
- **Database**:  MySQL

## Architecture
The application follows a multi-tier architecture:
- **Presentation Layer**: Thymeleaf templates are used for dynamic HTML rendering.
- **Service Layer**: Contains the business logic.
- **Data Access Layer**: Uses JPA/Hibernate for database interactions.
- **Database**: Stores data related to users, jobs, and applications.

## Setup and Installation

### Prerequisites
- Java JDK 11 or higher
- Maven
- MySQL or PostgreSQL (for production setup)

