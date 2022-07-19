# OOP-Mix



> Python


> Java
* 1- ATM - methods and Classes ?
* Link: adsadsadasdsada


> C++

> C# 

<hr
   
> ***jAVA OOP EXAMPLES (W3SCHOOLS)***
 
<hr>

### Create an Object
In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

###  Example
* Create an object called "myObj" and print the value of x:
  
  ```
  // 1.0
  public class Main {
  int x = 5;

    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);
    }
  }    
  ```
  <hr>

### Multiple Objects

You can create multiple objects of one class:

###  Example
* Create two objects of Main:
  
  ```
  // 1.1
  public class Main {
  int x = 5;

    public static void main(String[] args) {
      Main myObj1 = new Main();  // Object 1
      Main myObj2 = new Main();  // Object 2
      System.out.println(myObj1.x);
      System.out.println(myObj2.x);
      }
  }
  ```
  <hr>
  
### Using Multiple Classes
You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:
  * Main.java
  * Second.java

###  Main.java
###  Second.java

* Create an object called "myObj" and print the value of x:
   ```
  // 
  public class Main {
    int x = 5;
  }
  ```
  
  ```
  // 
  class Second {
    public static void main(String[] args) {
      Main myObj = new Main();
      System.out.println(myObj.x);
    }
  }
  ```
  <hr>
  page1
  
### Java Class Attributes
In the previous chapter, we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:

###  Examples
* Create a class called "Main" with two attributes: x and y:
  
  ```
  // 1.0
  public class Main {
    int x = 5;
    int y = 3;
  }
  ```
  Another term for class attributes is fields.
  
  <hr>
  
### Accessing Attributes
You can access attributes by creating an object of the class, and by using the dot syntax (.):

The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:

###  Example
* Create an object called "myObj" and print the value of x:
  
  ```
  // 1.0
  public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
    }
  }
  ```
  <hr>
  
### Modify Attributes
You can also modify attribute values:

###  Example
* Set the value of x to 40:

  ```
   public class Main {
   int x;

      public static void main(String[] args) {
         Main myObj = new Main();
         myObj.x = 40;
         System.out.println(myObj.x);
      }
   }
  ```
  Or override existing values:
  
###  Example
* Change the value of x to 25:

   ```
   public class Main {
      int x = 10;

      public static void main(String[] args) {
         Main myObj = new Main();
         myObj.x = 25; // x is now 25
         System.out.println(myObj.x);
      }
   }
  ```
  If you don't want the ability to override existing values, declare the attribute as final:

###  Example
* Change the value of x to 25:

   ```
   public class Main {
      final int x = 10;

      public static void main(String[] args) {
         Main myObj = new Main();
         myObj.x = 25; // will generate an error: cannot assign a value to a final variable
         System.out.println(myObj.x);
     }
  }
  ```
  The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).

  The final keyword is called a "modifier". 
  
  <hr>
  
### Multiple Objects

If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:

###  Examples
* Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:
  
  ```
  // 1.0
  public class Main {
      int x = 5;

      public static void main(String[] args) {
         Main myObj1 = new Main();  // Object 1
         Main myObj2 = new Main();  // Object 2
         myObj2.x = 25;
         System.out.println(myObj1.x);  // Outputs 5
         System.out.println(myObj2.x);  // Outputs 25
      }
  }
  ```
  
  <hr>
 
### Multiple Attributes

You can specify as many attributes as you want:

###  Examples
* Create an object called "myObj" and print the value of x:
  
  ```
  // 1.0
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  <hr>
  
  
 page2 
 
### Java Class Methods

You learned from the Java Methods chapter that methods are declared within a class, and that they are used to perform certain actions:


###  Examples
* Create a method named myMethod() in Main:
  
  ```
  public class Main {
      static void myMethod() {
         System.out.println("Hello World!");
      }
  } 
  ```
  myMethod() prints a text (the action), when it is called. To call a method, write the method's name followed by two parentheses () and a semicolon;
###  Example
* Inside main, call myMethod():
  
  ```
  public class Main {
      static void myMethod() {
         System.out.println("Hello World!");
      }

      public static void main(String[] args) {
         myMethod();
         
      }
   }
   // Outputs "Hello World!"
   ```
  
  <hr>
  
  
### Static vs. Non-Static

You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:

###  Example
* An example to demonstrate the differences between static and public methods:
  
  ```
  // 1.0
  public class Main {
      // Static method
      static void myStaticMethod() {
          System.out.println("Static methods can be called without creating objects");
      }

      // Public method
      public void myPublicMethod() {
         System.out.println("Public methods must be called by creating objects");
      }

      // Main method
      public static void main(String[] args) {
         myStaticMethod(); // Call the static method
         // myPublicMethod(); This would compile an error

         Main myObj = new Main(); // Create an object of Main
         myObj.myPublicMethod(); // Call the public method on the object
      }
  }
  ```
  <hr>
  
### Access Methods With an Object
  

###  Examples
* Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run the program:
  
  ```
  // 1.0
  // Create a Main class
   public class Main {
 
      // Create a fullThrottle() method
      public void fullThrottle() {
         System.out.println("The car is going as fast as it can!");
      }

      // Create a speed() method and add a parameter
      public void speed(int maxSpeed) {
         System.out.println("Max speed is: " + maxSpeed);
      }

      // Inside main, call the methods on the myCar object
       public static void main(String[] args) {
         Main myCar = new Main();   // Create a myCar object
         myCar.fullThrottle();      // Call the fullThrottle() method
         myCar.speed(200);          // Call the speed() method
       }
   }

      // The car is going as fast as it can!
      // Max speed is: 200

  ```
  
  >   Example explained :
      
      1) We created a custom Main class with the class keyword.

      2) We created the fullThrottle() and speed() methods in the Main class.

      3) The fullThrottle() method and the speed() method will print out some text, when they are called.

      4) The speed() method accepts an int parameter called maxSpeed - we will use this in 8).

      5) In order to use the Main class and its methods, we need to create an object of the Main Class.

      6) Then, go to the main() method, which you know by now is a built-in Java method that runs your program (any code inside main is executed).

      7) By using the new keyword we created an object with the name myCar.

      8) Then, we call the fullThrottle() and speed() methods on the myCar object, and run the program using the name of the object (myCar), followed by a dot (.),           followed by the name of the method (fullThrottle(); and speed(200);). Notice that we add an int parameter of 200 inside the speed() method.
  
  -------------------
      
  >   Remember that :
     
      The dot (.) is used to access the object's attributes and methods.

      To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

      A class must have a matching filename (Main and Main.java).
  
  <hr>
  
### Using Multiple Classes
Like we specified in the Classes chapter, it is a good practice to create an object of a class and access it in another class.

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory:
   * Main.java
   * Second.java

###  Main.java  
  ```
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  
 ### Second.java
  ```
  class Second {
      public static void main(String[] args) {
          Main myCar = new Main();     // Create a myCar object
         myCar.fullThrottle();      // Call the fullThrottle() method
         myCar.speed(200);          // Call the speed() method
      }
  }
  //When both files have been compiled:

  ```
  page3
  <hr>
  
### Java Constructors

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

###  Example
* Create a constructor:
  
  ```
  // Create a Main class
   public class Main {
       int x;  // Create a class attribute

       // Create a class constructor for the Main class
       public Main() {
          x = 5;  // Set the initial value for the class attribute x
       }

       public static void main(String[] args) {
         Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
         System.out.println(myObj.x); // Print the value of x
       }
   }

   // Outputs 5
  ```
  >    
       Note that the constructor name must match the class name, and it cannot have a return type (like void).

       Also note that the constructor is called when the object is created.

       All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. 
       However, then you are not able to set initial values for object attributes.
      
  <hr>
  
### Constructor Parameters

Constructors can also take parameters, which is used to initialize attributes.

The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:

###  Example
  
  ```
  public class Main {
      int x;

       public Main(int y) {
          x = y;
       }

      public static void main(String[] args) {
          Main myObj = new Main(5);
          System.out.println(myObj.x);
      }
  }
   // Outputs 5
  ```
  <hr>

You can have as many parameters as you want:

###  Example
  
  ```
  public class Main {
      int modelYear;
      String modelName;

      public Main(int year, String name) {
         modelYear = year;
         modelName = name;
      }      

      public static void main(String[] args) {
         Main myCar = new Main(1969, "Mustang");
         System.out.println(myCar.modelYear + " " + myCar.modelName);
      }
  }

   // Outputs 1969 Mustang
  ```
  <hr>
  page4                        i am stayed here...  -->https://www.w3schools.com/java/java_modifiers.asp
  
### 

You can specify as many attributes as you want:

###  Example
* 
  
  ```
  // 1.0
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  <hr>
  
  
### 

You can specify as many attributes as you want:

###  Example
* Create an object called "myObj" and print the value of x:
  
  ```
  // 1.0
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  <hr>
  
  
### 
You can specify as many attributes as you want:

###  Example
* Create an object called "myObj" and print the value of x:
  
  ```
  // 1.0
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  <hr>
  
  
### 

You can specify as many attributes as you want:

###  Example
* 
  
  ```
  // 1.0
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  <hr>
  
  
### 

You can specify as many attributes as you want:

###  Example
* 
  
  ```
  // 1.0
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  <hr>
  
  
### 

You can specify as many attributes as you want:

###  Example
* Create an object called "myObj" and print the value of x:
  
  ```
  // 1.0
  public class Main {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         Main myObj = new Main();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);
      }
  }
  ```
  <hr>
 
 
 
 
  

  
  
 
 
  
