# Java-Input-and-Output 🚀
You can use this project as a cheatsheet or a fast course on Java Input and Output!

## Before we start ✋
> In this ReadMe you'll find information about **some of the built-in classes that are useful for inputting and outputting in Java.**  
> Also, this project includes java files with the **actual implementation** of these classes.

We will be reviewing the following classes:
- `System.out`: to **display out in a terminal** or command prompt application.
- `Scanner`: to **read input** passed into a Java program.
- `FileOutputStream`: to **convert byte data into readable text files**.
- `FileInputStream`: to **convert input from files to byte data** for a Java program to use.

**You can use this ReadMe as a cheatsheet and clone this project to run it in your IDE for further knowledge about how Output and Input work in Java.**

🛠️ This project was created with **Java8** and **Eclipse**(IDE).

So you'll need a **basic knowledge of Java**, an **IDE** and **Java 8 installed** and you are ready to go!

[To download and install Eclipse on Windows 10](https://www.youtube.com/watch?v=N-wXTRpR03U)

[To download and install Java8](https://www.youtube.com/watch?v=ClcHrcNXP9g)


## Printing using System.out 📃

`System` is a class that has already been built into Java for your use. `out` is an instance, or method, that has been provided in the System class. It is of the type `PrintStream`, which is what allows us to show output in Java programs.  

- **System.out.print()**: print in the **same line**.
- **System.out.println()**: prints output to a **new line**.
- **System.out.printf()**: Takes a `String` and variables as arguments to **output strings that are formatted in the code using format specifiers**. Format specifiers begin with the `%` sign, followed by the type of variable we want to print. Some examples include `%s` for a string,`%c` for a character, and `%d` for an integer.

## The Scanner Class ⌨️

The `Scanner` class is predefined and built into Java for your use. It’s used to read user input in a Java program. The Scanner class can read different types of values that can be saved into different variable types. 

1. First we must **import the Scanner class**:

```java
import java.util.Scanner;
```
2. Then **declare** the Scanner class as a variable that we will call input:

```java
Scanner input = new Scanner(System.in);
```
The `System.in` in our declaration is what will allow our program to read user input **from the console**.

3. **Save the input** in a variable

```java
String userInput = input.next();
```

The `Scanner` class has **many functions**, including the ability to validate and convert variables. Some examples include:
- **input.hasNextLine()**: returns a **boolean** that validates **if there is another line in the input** of the defined scanner.
- **input.hasNextInt()**: returns a **boolean** that validates **if there is another int in the input** of the defined scanner.
- **input.useDelimiter(",")**: **specify what delimiters we want to use**. A delimiter is used to **separate data units**. Delimiters can be especially useful when a program is required to read csv files.

## FileInputStream 🗃️

Is used **to read data from a file into a program**. FileInputStream reads in bytes and then converts to the variables the program requires.

1. First we must **import the java.io classes**:

```java
import java.io.*;
```
2. **Declare** your input stream. The statement will find the file at the specified file path (you can use an absolute or relative path). Alternatively, you may choose to create an object of the variable type `File` to pass into the `FileInputStream`:

```java
FileInputStream input = new FileInputStream(filePath);
```
3. **Read** your file. We must convert the data we wish to read from a file into bytes. If we choose to read a file one byte at a time we may choose to store this in an int or char variable:

```java
// Counter variable to loop through the file
int i = 0;
// A loop to access each character
while((i = inputFile.read()) != -1) {    
  // Printing each character as it's reached
  System.out.print((char)i);    
}
```
4. **Close** the file:

```java
inputFile.close();
```

## FileOutputStream 🖨️

Is used **to write data from the program into a file**. FileOutputStream writes in bytes and then convert to the variables the file requires.

1. First we must **import the java.io classes**:

```java
import java.io.*;
```
2. **Declare** your output stream. The statement will create a file named output.txt in the same folder as where your Java program is saved. You may also choose to place an absolute or relative file path in the brackets or create an object of the variable type `File` to pass into the `FileOutputStream`. This is useful if you plan to have the user pass in a path where they want to store the output:

```java
FileOutputStream output = new FileOutputStream("output.txt");
```
3. **Write** to your file. We must convert the data we wish to write to a file into bytes and then write to the file:

```java
// Convert statement to bytes.
byte[] statementBytes = statement.getBytes();

// Option 1:
// Write all contents to file
output.write(statementBytes);
// You can do this more succinctly using
output.write(statement.getBytes());

// Option 2:
// If you want to write specific bytes to a file you may choose to use the following statement
// output.write(byte[] bytes, int startingIndex, int endingIndex);
output.write(statementBytes, 0, 4)

```
4. **Close** the file:

```java
output.close();
```

## IOExceptions 💥

Errors are unwanted issues that occur in a program that cannot be handled by a program. They may even result in a program crashing. Exceptions are issues that may occur when a program is running that can be foreseen.
There are two types of exceptions:
1. Checked exceptions are exceptions that a programmer can handle and look out for by using try-catch blocks, and found when a program is compiling.
2.  Unchecked exceptions occur during runtime.

IOExceptions are exceptions that are related to input and/or output in a program and can be classified as checked exceptions.
Some examples of when IOExceptions occur include:
- Failed attempts at trying to access a file.
-  The end of a file has been reached.
- The file a program is attempting to access cannot be found.
- An input/output operation has been interrupted.

We can code our program to handle IOExceptions in areas of our code where we are dealing with input and output.
1. To start off we must first import the IOExceptions class:
```java
import java.io.IOException;
```
2. Add a try catch in the code involving the input/output or use the keyword throws so that the exception is handled by the program itself.

```java

public class Sample {
  public static void main(String[] args) throws IOException { … }
}

```







