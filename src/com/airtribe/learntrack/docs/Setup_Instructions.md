Setup Instructions

1️ JDK Version Used

- JDK Version: Java SE 21
- This version is stable and widely used for academic and industry projects.

You can verify your installed version using:

java --version
javac --version

---

2️ Running a “Hello World” Program

Step 1: Create Java File

Create a file named "HelloWorld.java"

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

---

🔹 Step 2: Compile the Program

Open terminal/command prompt and run:

javac HelloWorld.java

This creates a file: "HelloWorld.class" (bytecode)

---

Step 3: Run the Program

java HelloWorld

Output:

Hello, World!

---

Flow of Execution

---

What Happens Internally

1. You write code → "HelloWorld.java"
2. Compiler ("javac") converts it → bytecode (".class")
3. JVM executes bytecode → Output shown on console

