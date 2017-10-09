This is a project for CS 253.

Project Description:
Design an ADT for a two-color, double-stack ADT that consists of two stacks—one “red” and one “blue”—and has as its operations color-coded versions of the regular stack ADT operations. For example, this ADT should support both a redPush operation and a bluePush operation. Give an efficient implementation of this ADT using a single array whose capacity is set at some value N that is assumed to always be larger than the sizes of the red and blue stacks combined.

Program Output:

Creating new ColorStack of total capacity 500...

Filling first 50 indices of the red stack...
The current size of the red stack is 50 items.

Filling all indices of the blue stack...
The current size of the blue stack is 250 items.

The top item of the blue stack is 1.

Attempting to add new item to full blue stack...
Error: Blue stack is full.
Popping the top item of the blue stack...
The popped item is 1.
The current size of the blue stack is 249.
Adding new item to blue stack...
The top item in the blue stack is now 21.

Removing 50 items from the red stack...
The size of the red stack is now 0.
Red stack is now empty.

Process finished with exit code 0