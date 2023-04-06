# Software Building

I would like to share my labwork with you. These lab works regarding to "How to codding clearily and smoothly with Java." Let's give example for each situtation.

-**First lab** is regarding Abstract Classes. I made up simply example for that. Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.
</br>Consider a real-life example of a man driving a car. The man only knows that pressing the accelera- tors will increase the speed of a car or applying brakes will stop the car, but he does not know how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc in the car.</br>
</br>
-**Second lab**, I have made program abide by the **Law Of Demeter.**
</br>**Context:**
</br>1- The Law of Demeter or principle of least knowledge is a design guideline for developing software, particularly object-oriented programs. Formally definition, the Law of Demeter requires that a method m of an object O may only invoke the methods of the following kinds of objects.
</br>2- Demeter’s law is known as “don’t talk to strangers” because: Each unit should have only limited knowledge about other units — only units “closely” related to the current unit. Each unit should only talk to its friends — don’t talk to strangers. Only talk to your immediate friends.
</br>
</br>
-**Third one's** subject is regarding **Inheritance and Minimizing Interface Problems.**
</br>**Context:**
</br>1- If several routines use similar parameters, put the similar parameters in a consistent order
</br>2- The order of routine parameters can be an aide-memoire, and inconsistent order can make param- eters hard to remember
Use all the parameters
</br>3- If you pass a parameter to a routine, use it.
</br>4- If you aren’t using it, remove the parameter from the routine interface.
</br>5– Unused parameters are correlated with an increased error rate.
Don’t use routine parameters as working variables
</br>6- It’s dangerous to use the parameters passed to a routine as working variables – Use local variables instead.
</br>7- Unused parameters are correlated with an increased error rate.
</br>
</br>
-**Fourth Lab**
</br>**Objective:**
</br>In this lab assignment, we will write a Java function that performs a complex calculation with six input parameters. The function should use assertions to check for any errors or inconsistencies in the input data. In addition, the function should handle errors gracefully by substituting the closest legal value or logging a warning message to a file
</br>
</br>
-**Fifth Lab**
</br>**Objective:**
</br>In this lab assignment, we will implement a Java program that reads Employee objects from a file and stores them in an array called Employees[]. Then, it prints out the contents of the Employees[] array. The program should use try-catch blocks to handle any exceptions that may occur
</br>
</br>
-**Sixth Lab**
</br>**Objective:**
In this lab work, you will implement the Battleship game in a class using Java. The objective of the game is to sink all of the computer's ships. The game is played on a 5x5 board and computer has three ships to place on the board. As a player, guess the location of the computer's randomly located ships. The player who sinks all of the computer's ships first wins the game. But we've soome rules, while implementing the battleship game. These are;
</br>- Initialize each variable as it’s declared
</br>- Initialize each variable close to where it’s first used (Principle of Proximity)
</br>- Use final or const when possible
</br>- Pay special attention to counters and accumulators
</br>- Keep Variables “Live” for as Short a Time as Possible
</br>- Use each variable for one purpose only
</br>- Short, meaningful names and describe the entity the variable represents.
</br>- Constants are in ALL_CAPS separated by underscores
</br>
</br>
-**Seventh Lab**
</br>**Objective:**
That week, write the ”IF-ELSE IF-ELSE” and ”SWITCH-CASE” versions code of the following program in Java.
</br>
**Roulette Simulation:** A roulette wheel has 38 spaces on it. Of these spaces, 18 are black, 18 are red, and two are green. The green spaces are numbered 0 and 00. The red spaces are numbered 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30 32, 34 and 36. The remaining integers between 1 and 36 are used to number the black spaces.
</br>
Many different bets can be placed in roulette. We will only consider the following subset of them in this exercise:
</br>- Single number (1 to 36, 0, or 00)
</br>- Red versus Black
</br>- Odd versus Even (Note that 0 and 00 do not pay out for even)
</br>- 1 to 18 versus 19 to 36
