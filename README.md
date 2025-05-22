# FILE HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: JITHESH T

*INTERN ID*: CT04DK730

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR 


    ##Java File Handling System


This Java-based File Handling System demonstrates how to perform basic file operations such as writing, reading, and modifying data using core Java I/O (Input/Output) classes. The project is designed to simulate a grade tracking system, where student names and their corresponding marks are stored in a text file and manipulated through simple file-based operations. The simplicity of this project makes it ideal for educational purposes, especially for understanding how file manipulation works in real-world applications without using a database.

The main objective of this program is to show how textual data can be processed efficiently using Java’s built-in FileReader, FileWriter, and BufferedReader classes. These classes enable the program to interact with external files, making it suitable for data persistence. In this case, the system tracks the grades of students, initially saving the data into a file named grade.txt, displaying it to the user, and then modifying one of the entries programmatically.

This project is important for learners and interns because it touches upon fundamental file operations that are used in many types of applications—whether it's configuration management, logging systems, or simple data storage where a database is not necessary. Understanding how to open, read, write, and rewrite files forms the basis of many utility scripts, and it’s often used in legacy systems and lightweight tools.

From a real-world perspective, the ability to work with plain text files is particularly helpful when working in environments with restricted resources. For example, if you’re creating a simple desktop application, CLI tool, or prototype that doesn’t need a full-fledged database, text files can act as temporary storage. In this project, grades are stored as text, and operations such as reading and modifying entries simulate the "view" and "update" actions common in CRUD-based systems.

The process starts with writing hardcoded grade entries to a file. This operation reflects how applications store data persistently beyond runtime. After writing, the data is read back and displayed line-by-line, showing how programs can fetch and present stored information to users or systems. The final operation modifies a specific student’s grade. Rather than editing the file directly, the program reads all the contents into a temporary list, modifies the target line, and rewrites the entire file. This pattern is commonly used in file handling when random-access or line-level editing isn't feasible.

An added value of this program is how it introduces concepts such as exception handling (try-catch blocks) to handle errors like file not found or read/write failure. This reinforces best practices in robust Java programming by ensuring that the application doesn't crash unexpectedly during file operations.

Although the current implementation is basic, it lays the groundwork for more advanced features such as user input, file validation, data deletion, and integration with GUI or web-based interfaces. It can also be scaled to handle CSV files or JSON for better structure and readability.

In summary, this Java File Handling System is a foundational project that emphasizes the importance of data persistence and manipulation using standard I/O. It helps learners understand how to work with external files to perform everyday operations in a system where tracking or managing records is necessary. The skills learned through this program are applicable across a wide range of software development scenarios, especially in automation, data collection tools, and entry-level system utilities.


    ##OUTPUT

![Image](https://github.com/user-attachments/assets/d5400032-6e52-4807-b371-c80837b66e41)

