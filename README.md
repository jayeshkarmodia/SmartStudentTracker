# Smart Student Task & Productivity Tracker

A Java 17 command-line application designed to help students manage academic tasks, deadlines, study sessions, and productivity information.

The application provides a menu-driven interface for creating and managing tasks, tracking study time, identifying upcoming or overdue work, recommending the next task, viewing productivity statistics, and creating database backups.

Data is stored locally using an SQLite database through JDBC.

---

## Project Overview

Students often manage assignments, deadlines, and study records separately. This can make it difficult to keep track of pending work, identify urgent tasks, and measure study time.

The Smart Student Task & Productivity Tracker provides a single command-line system for managing these activities.

The application follows an object-oriented design with separate model, service, database, UI, and utility components.

---

## Features

- Add academic tasks.
- View all saved tasks.
- Complete pending tasks.
- Delete tasks.
- Store task title, subject, description, priority, deadline, estimated effort, and status.
- Validate user input such as dates and numeric values.
- Identify upcoming and overdue tasks.
- Recommend the next task using a rule-based scoring system.
- Record study sessions.
- Calculate total study time.
- Calculate subject-wise study time.
- Display productivity statistics.
- Display task completion information.
- Create timestamped SQLite database backups.
- Store data persistently between application runs.
- JUnit 5 automated testing.

---

## Main Application Menu

```text
=== SMART STUDENT TASK & PRODUCTIVITY TRACKER ===

1 Add Task
2 View Tasks
3 Smart Recommendation
4 Record Study Session
5 Productivity Dashboard
6 Upcoming/Overdue Tasks
7 Complete Task
8 Delete Task
9 Backup Database
0 Exit
```

---

## Smart Recommendation

The application includes a rule-based recommendation system.

For each incomplete task, the system calculates a score using:

- Task priority
- Deadline urgency
- Estimated effort
- Overdue status

The task with the highest calculated score is recommended as the next task to work on.

---

## Technology Stack

| Technology | Purpose |
|------------|---------|
| Java 17+ | Application development |
| Maven | Project build and dependency management |
| SQLite | Local database storage |
| JDBC | Database connectivity |
| JUnit 5 | Automated testing |
| Command Line Interface | User interaction |

---

## Requirements

- JDK 17 or newer
- Maven 3.8 or newer
- Terminal / Command Prompt

The project is compiled using Java 17 compatibility.

---

## Setup

Clone the repository:

```bash
git clone https://github.com/jayeshkarmodia/SmartStudentTracker.git
cd SmartStudentTracker
```

Run the tests:

```bash
mvn clean test
```

The SQLite database is created automatically at:

```text
data/student_tracker.db
```

No separate database server or GUI is required.

---

## Run the Application

```bash
mvn exec:java
```

Alternatively:

```bash
mvn clean package
java -jar target/smart-student-tracker-1.0.0.jar
```

---

## Example Workflow

1. Select `1` to add an academic task.
2. Select `2` to view saved tasks.
3. Select `3` to receive a smart recommendation.
4. Select `4` to record a study session.
5. Select `5` to view productivity information.
6. Select `6` to view upcoming or overdue tasks.
7. Select `7` to mark a task as completed.
8. Select `9` to create a database backup.
9. Select `0` to exit.

---

## Database

The application uses SQLite through JDBC.

Two main tables are created automatically:

- `tasks` - stores academic task information.
- `study_sessions` - stores study-session records.

The database is stored locally at:

```text
data/student_tracker.db
```

---

## Input Validation

The application validates user input before processing it.

For example, deadlines must follow:

```text
YYYY-MM-DD
```

Invalid input is rejected with an error message instead of being stored.

---

## Testing

Run automated tests with:

```bash
mvn test
```

The test suite covers:

- Task overdue logic
- Smart recommendation scoring behavior

The development verification run completed successfully with:

```text
Tests run: 4
Failures: 0
Errors: 0
Skipped: 0
BUILD SUCCESS
```

---

## Project Structure

```text
SmartStudentTracker/
├── data/
│   └── .gitkeep
│
├── docs/
│   ├── architecture.png
│   ├── workflow.png
│   ├── use-case.png
│   ├── class-diagram.png
│   ├── sequence-diagram.png
│   ├── er-diagram.png
│   ├── diagrams.md
│   ├── README.md
│   └── Smart_Student_Productivity_Tracker_Report.pdf
│
├── src/
│   ├── main/java/com/studenttracker/
│   │   ├── Main.java
│   │   ├── model/
│   │   ├── service/
│   │   ├── database/
│   │   ├── ui/
│   │   └── util/
│   └── test/java/com/studenttracker/
│       ├── SchedulerServiceTest.java
│       └── TaskModelTest.java
│
├── .gitignore
├── README.md
├── pom.xml
├── run.sh
└── statement.md
```

---

## System Architecture

The application follows a layered structure:

```text
Student / User
      |
      v
   ConsoleUI
      |
      v
 Service Layer
      |
      +-------------------+
      |                   |
      v                   v
DatabaseManager      BackupService
      |
      v
   SQLite
```

- `ConsoleUI` handles user interaction.
- Model classes represent application data.
- Service classes contain business logic.
- `DatabaseManager` manages SQLite/JDBC access.
- Utility classes provide validation and date helpers.
- `BackupService` creates database backups.

---

## Design Documentation

The `docs/` directory contains the project's design documentation, including:

- System architecture
- Application workflow
- Use-case diagram
- Class diagram
- Sequence diagram
- ER/database diagram
- Project report

The diagrams are provided as PNG files for easy viewing on GitHub.

---

## Project Report

The complete project report is available at:

```text
docs/Smart_Student_Productivity_Tracker_Report.pdf
```

The report covers the problem statement, course concepts, code organization, design decisions, challenges, learning outcomes, testing, and conclusion.

---

## Future Scope

Possible future improvements include:

- Task editing and searching
- Recurring tasks
- Configurable recommendation scoring
- CSV export
- Authentication
- Optional graphical user interface
- Optional web-based interface
- External notification support

---

## Notes

The application is intentionally CLI-first so that it can be executed in a clean terminal environment without requiring a graphical interface or separate database server.
