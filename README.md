# Student_and_Course_Management

🎓 Student & Course Management System

A simple Java console-based application to manage students, courses, and enrollments using clean architecture and modular design.

---

🚀 Features

👨‍🎓 Student Management

- Add new student
- View all students
- Search student by ID
- Deactivate student (soft delete)

---

📚 Course Management

- Add new course
- View all courses
- Activate / Deactivate course

---

📝 Enrollment Management

- Enroll student in a course
- View enrollments for a student
- Mark enrollment as COMPLETED / CANCELLED

---

🏗️ Project Structure

src/
├── entity/
│   ├── Person.java
│   ├── Student.java
│   ├── Course.java
│   └── Enrollment.java
│
├── repository/
│   ├── StudentRepository.java
│   ├── CourseRepository.java
│   └── EnrollmentRepository.java
│
├── service/
│   ├── StudentService.java
│   ├── CourseService.java
│   └── EnrollmentService.java
│
├── util/
│   ├── IdGenerator.java
│   └── InputValidator.java
│
├── Main.java
└── module-info.java

---

🧠 Design Highlights

- ✅ Layered Architecture
  
  - Entity → Repository → Service → UI

- ✅ OOP Concepts Used
  
  - Inheritance ("Person → Student")
  - Encapsulation
  - Abstraction

- ✅ Soft Delete
  
  - Instead of deleting, records are marked inactive

- ✅ Modular & Scalable Code
  
  - Easy to extend for future features

---

⚙️ Technologies Used

- Java (JDK 21)
- Console-based UI
- Git & GitHub for version control

---

▶️ How to Run

1. Clone repository:

git clone https://github.com/your-username/your-repo-name.git

2. Open in IDE (Eclipse / IntelliJ)

3. Run:

Main.java

---

Sample Flow

Main Menu
1. Student Management
2. Course Management
3. Enrollment Management

---

🎯 Learning Outcomes

- Understanding of Java OOP concepts
- Hands-on with layered architecture
- Practical use of Git & GitHub
- Building menu-driven applications

---

👨‍💻 Author

- Ahamed Mohiddin

---

⭐ Future Enhancements

- Add database (MySQL)
- Convert to Spring Boot API
- Add GUI (JavaFX / Web UI)
