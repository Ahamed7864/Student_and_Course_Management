Design Notes – Student Management Console Application


* Key Reason

I used "ArrayList" instead of arrays because the application requires dynamic data handling.

* Advantages of ArrayList

- Dynamic Size
  
  - Arrays have fixed size → cannot grow after creation
  - "ArrayList" resizes automatically as we add/remove elements

- Ease of Use
  
  - Built-in methods like:
    - "add()"
    - "remove()"
    - "contains()"
    - "size()"

- Better for CRUD Operations
  
  - Our system frequently:
    - Adds students/courses
    - Removes (soft delete)
    - Searches data
      → "ArrayList" simplifies these operations

- No Manual Index Handling
  
  - Arrays require manual tracking of current size
  - "ArrayList" manages it internally

* Example in Project

ArrayList<Student> students = new ArrayList<>();

🔹 Conclusion

"ArrayList" is more suitable for real-world applications where data is not fixed and keeps changing.

---

2️ Where Static Members Were Used and Why

🔹 Where Used

1. In "Main.java"

private static Scanner sc = new Scanner(System.in);
private static StudentService studentService = new StudentService();

2. (Optional) In Services (if implemented)

private static ArrayList<Student> students = new ArrayList<>();

---

* Why Static?

- Single Shared Instance
  
  - "Scanner" should not be created multiple times
  - Services should be reused across menus

- Memory Efficient
  
  - Static variables are created only once in memory

- Global Access Within Class
  
  - Can be accessed directly without creating object

- Utility-Like Behavior
  
  - Acts like a central controller shared across methods

---

* When NOT to Use Static

- When data is object-specific
- When we need multiple independent objects

---

* Conclusion

Static members were used to ensure:

- Shared resources
- Consistency across application
- Reduced object creation overhead

---

3️ Where Inheritance Was Used and What Was Gained



We can use a base class:

public class Person {
	
	protected int id;
	protected String firstName;
	protected String lastName;
	protecetd String email;
	}
Then extend it:

public class Student extends Person {
    private String Batch;
}




* Why Inheritance?

- Code Reusability
  
- Avoid Code Duplication
  
  - No need to repeat same variables in multiple classes

- Better Maintainability
  
  - Change in base class reflects everywhere

- Logical Hierarchy
  
  - Student and Course are both "entities"

---

* What We Gained

Benefit| Explanation
Reusability| Common properties reused
Cleaner Code| Less duplication
Scalability| Easy to add new entities
Maintainability| Centralized updates

---


* Conclusion

Inheritance improved:

- Code organization
- Maintainability
- Reusability
