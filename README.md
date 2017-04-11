## Exercise Dedup (16 Points)

The purpose of this assignment is to learn how to work with iteration, reading a file, sorting, as well as how to write all of your own code and Javadoc comments.


### Problem Description

Dedup is pronounced "dee-dupe" and it referers to the elimination of duplicate items (i.e. to de-duplicate them). You are to create an object that will read in a list of integers and then tell you how many of a given number are present in the list. Also, you can ask for an ArrayList of all of the unique numbers in the list.

By way of an example, if you read in a sequence that is 1,1,3,9,5,5,1 and you ask how many "1"s you'll get back "3" as your answer. Also, an ArrayList of unique items will contain 1,3,5,9 (note that they are in ascending order).

The object to implement this is referred to as Dedup and consists of the following public methods:

`public static ArrayList<Integer> readData(String fileName) throws IOException` - This method takes a filename and reads the data from the file and returns them as an `ArrayList`. See the file "small.txt" for details on the file format.

`public static int howMany(ArrayList<Integer> data, int number)` - This will return the number of times `number` appears in the list `data`.

`public static ArrayList<Integer> returnUnique()` - Returns an `ArrayList` consisting of each unique number in the file specified when `readData` was called. The numbers must be in ascending order.

#### Hints

- The Arrays object has a sort method but it only works on arrays not ArrayLists.
- You will probably need to know how to convert an ArrayList to an Array for this assignment.

Your **Dedup.java** should contain code to test your Dedup object. Load multiple files and check to make sure that the values match the expected values. Use looping to load and test your object.

### Getting Started

There is no code to copy for the assignment. You get to do it all! Don't forget to provide proper Javadoc documentation.

We are going to do this exercise by writing the object that solves the problem first (in a source file called TicketSeller.java) and then testing it using code we write into **Dedup.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) to create a source file called **Dedup.java**. This is where your code will go. 

### Testing Your Code

Your **Dedup.java** should contain code with your solution for Dedup. 

Your output should look something like this for the list `1 2 2 2 100 12 99 5 7 19 19 19 2 1 0`:

```
how many 19s: 3
unique: [0, 1, 2, 5, 7, 12, 19, 99, 100]
```

Once you've written your code run the code by single clicking on **Dedup.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Remember to update the run configuration so you can pass the word on the command line (See the MontyHallParadox assignment if you forget). Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on GitHub in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...** and follow the usual procedures.

#### Completing the turn-in process

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.
