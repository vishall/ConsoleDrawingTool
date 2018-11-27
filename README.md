# Spriger Challenge

#### Console Drawing Application

Application that provides options to draw canvas with line, rectangle and fill it.

#### Design

Code is written considering

1) Object Oriented Programming.
2) Unit tests using Junit and Mockito.
3) Used Command Design Pattern to handle different user input commands

#### Clone Application
Clone application

**git clone https://github.com/rashmijoshi3/ConsoleDrawingTool.git**


#### How to run Application

To build and run application gradle needs to be installed.

1) To build application
    **gradle build**
2) To run unit tests
    **gradle test**
3) To run application
    **gradle -q run**



# Problem statement

You're given the task of writing a simple console version of a drawing program. The functionality of the program is quite limited but should be extensible. The program should work as follows:

1. create a new canvas.
2. start drawing on the canvas by issuing various commands.
3. quit.

The program should support the following commands:

**C w h** -
Should create a new canvas of width w and height h.


**L x1 y1 x2 y2** -
Should create a new line from (x1,y1) to (x2,y2) . Currently only horizontal or vertical lines are supported. Horizontal and vertical lines will be drawn using the x character.


**R x1 y1 x2 y2** -
Should create a new rectangle, whose upper left corner is (x1,y1) and lower right corner is (x2,y2) . Horizontal and vertical lines will be drawn using the x character.

**B x y c** -
Should fill the entire area connected to (x,y) with colour 'c' . The behaviour of this is the same as that of the "bucket fill" tool in paint programs.

**Q**
Should quit the program.

