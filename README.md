# cs2261-project6
Battleship game with JavaFX

The last project, project 6, for Object-Oriented Programming course
was to make a simple GUI for a battleship game.

I imported packages whenever eclipse gave warnings. As a basic setting,
I set a title and removed max/min button from the window. For this project,
I used both grid pane and border pane but chose border pane as a root pane.
The 10x10 grid was created by nested loop. Inside of the loop, height property
and width property functions were used to make each of the buttons be able to 
resize whenever the window gets resized.

Although the project sounded simple, there were many difficulties.
Firstly, I did not know how to use both grid pane and border pane at the same 
time. However, later I found out I could only pick one for a root pane.
Secondly, I had no idea how to resize the buttons and spent hours to look up 
and try the methods to do it. I was initially looking for one method to resize
the buttons by keeping the ratio between the buttons, window, and margins.

However, it did not work. Instead, I ended up using two methods to change height
and width of the buttons. In that way, I did not have to be worried about setting
up complicated algebra. Even though my program does what it is supposed to do for
the assignment, I ended up having several warnings. My next step is figuring out
why I got those warnings and fix them.
