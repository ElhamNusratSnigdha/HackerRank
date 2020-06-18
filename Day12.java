import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );

        /* Extra Materials:
        #Inheritance       : We use Inheritance to establish a class hierarchy.
                             A class that inherits from some other class (referred to as a superclass) is called a subclass.
                             While a subclass inherits methods and behaviors from a superclass, it can also declare new
                             fields and methods as well as override superclass methods.
        #Subclass          : We define a subclass using the extends keyword.
                             For example, the syntax ClassB extends ClassA establishes ClassB as a subclass of ClassA.
                             Java only supports single inheritance, meaning a subclass cannot extend more than one superclass.
                             We can also refer to a subclass as a derived class, extended class, or child class.
        #Subclass Constructors :
                             Because a constructor initializes an instance of a class, they are never inherited;
                       ******however, the subclass must call a superclass constructor as it is an extension of a superclass object.
                             This can be done in either of the two ways shown below.
                             Consider the following class:
                                class MySuperclass {
                                    // Superclass' instance variable:
                                    String myString;

                                    // Superclass' default (empty) constructor:
                                    MySuperclass() {}

                                    // Superclass' parameterized constructor:
                                    MySuperclass(String myString) {
                                        // Initialize instance variable
                                        this.myString = myString;
                                    }
                                }

                              Now, let's look at the two ways we can call the superclass constructor.

         #Explicitly Call the Superclass Constructor: In this example, the subclass makes an explicit
                              call to the superclass' parameterized constructor by calling super(...);.

                              // Superclass
                                class MySuperclass {
                                    // Superclass' instance variable:
                                    String myString;

                                    // Superclass' default (empty) constructor:
                                    MySuperclass() {}

                                    // Superclass' parameterized constructor:
                                    MySuperclass(String myString) {
                                        // Initialize instance variable
                                        this.myString = myString;
                                    }
                                }

                                // Subclass
                                class MySubclass extends MySuperclass {
                                    // Subclass' constructor:
                                    MySubclass(String myString) {
                                        // Explicit call to superclass' constructor:
                                        super(myString);
                                    }

                                    public static void main(String[] args) {
                                        MySuperclass s1 = new MySubclass("Hello, World!");
                                        System.out.println(s1.myString);

                                        MySubclass s2 = new MySubclass("Hello, World.");
                                        System.out.println(s2.myString);
                                    }
                                }

         #Implicitly Call the Superclass Constructor:
                                In this example, the subclass makes an implicit call to the superclass' default constructor.
                                This essentially means that the subclass' constructor automatically makes a behind-the-scenes
                                call to super();. If a superclass does not have a default constructor, any subclasses
                                extending it must make an explicit call to one of the superclass' parameterized constructors.

                                // Superclass
                                class MySuperclass {
                                    // Superclass' instance variable:
                                    String myString;

                                    // Superclass' default (empty) constructor:
                                    MySuperclass() {}

                                    // Superclass' parameterized constructor:
                                    MySuperclass(String myString) {
                                        // Initialize instance variable
                                        this.myString = myString;
                                    }
                                }

                                // Subclass
                                class MySubclass extends MySuperclass{
                                    MySubclass(String myString) {
                                        // A behind-the-scenes implicit call to the
                                        // superclass' default constructor happens

                                        // Subclass can now initialize superclass instance variable:
                                        this.myString = myString;
                                    }

                                    public static void main(String[] args) {
                                        MySuperclass s1 = new MySubclass("Hello, World!");
                                        System.out.println(s1.myString);

                                        MySubclass s2 = new MySubclass("Hello, World.");
                                        System.out.println(s2.myString);
                                    }
                                }

                                Observe that we are initializing a field (myString) that isn't even declared in that class;
                                the reason why this works is because it's inherited from MySuperclass and therefore can
                                be accessed with the this keyword.
          #Overriding Methods : When overriding a method, it is best practice to precede the method with the "@Override"
                                annotation. This has two benefits:
                                1. It signifies to both the reader and the compiler that this method is overriding an
                                   inherited method.
                                2. It helps you check your work because it generates a compiler error if no such method
                                   exists in the superclass.

                                Now, let's look at an example of method overriding.

                                #EXAMPLE:

                                Let's say a not-for-profit organization has an Employee class, and each instance of the
                                Employee class contains the name and salary for an employee. Then they decide that they
                                need a similar-yet-different way to store information about volunteers, so they decide
                                to write a Volunteer class that inherits from Employee. This is beneficial because any
                                fields and methods added to Employee will also be accessible to Volunteer.
                                Take some time to review the code below. Observe that the Volunteer class calls the
                                superclass' getName method, but overrides its print method.

                                import java.util.Locale;
                                import java.text.NumberFormat;

                                class Employee {
                                    // Instance variables:
                                    protected String name;
                                    private int salary;

                                    /** Parameterized Constructor
                                    *   @param name The volunteer's name. **/
                                        /*
                                        Employee(String name) {
                                            // use name param to initialize instance variable:
                                            this.name = name;
                                        }

                                        /** @return The name instance variable. **/
                                        /*
                                        String getName() {
                                            return name;
                                        }

                                        /** @param salary The integer to set as the salary instance variable. **/
                                        /*
                                        void setSalary(int salary) {
                                            this.salary = salary;
                                        }

                                        /** @return The salary instance variable. **/
                                        /*
                                        int getSalary() {
                                            return salary;
                                        }

                                        /** Print information about an instance of Employee. **/
                                        /*
                                        void print() {
                                            if (this.salary == 0) {
                                                System.err.println("Error: No salary set for "
                                                        + this.name
                                                        + "; please set salary and try again.\n");
                                            }
                                            else { // Print employee information
                                                // Formatter for salary
                                                // This adds commas between zeroes:
                                                NumberFormat salaryFormat = NumberFormat.getNumberInstance(Locale.US);

                                                System.out.println("Employee Name: " + this.name
                                                        + "\nSalary: "
                                                        + salaryFormat.format(this.salary) + "\n");
                                            }
                                        }
                                    }

                                    class Volunteer extends Employee{
                                        // instance variable:
                                        int hours;

                                        /** Parameterized Constructor
                                         *   @param name The volunteer's name. **/
                                        /*
                                        Volunteer(String name) {
                                            // explicit call to superclass' parameterized constructor
                                            super(name);
                                        }

                                        /** @param Set the hours instance variable. **/
                                        /*
                                        void setHours(int hours) {
                                            this.hours = hours;
                                        }

                                        /** @return The hours instance variable **/
                                        /*
                                        int getHours() {
                                            return hours;
                                        }

                                        @Override
                                        /** Override the superclass' print method
                                         *   Print information about an instance of Volunteer.
                                         **/
                                        /*
                                        void print() {
                                            System.out.println("Volunteer Name: " + this.getName()
                                                    + "\nHours: " + this.getHours());
                                        }

                                        public static void main(String[] args) {
                                            Employee employee = new Employee("Erica");
                                            employee.print();
                                            employee.setSalary(60000);
                                            employee.print();

                                            Volunteer volunteer = new Volunteer("Anna");
                                            volunteer.setHours(20);
                                            volunteer.print();
                                        }
                                    }
          For more: https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
          */

    }
}
