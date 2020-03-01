# Exercise4

## Study Drills

1. What happens if you put a block comment in the middle of the word println? Try it on line 13. Then add a comment below line 18 saying whether or not it compiles. Leave the block comment in line 13 if it works and take it out if it fails to compile.

After adding a block comment in the line 13, it won't compiles

2.  Re-open the code for the previous exercise and save a copy as PrintingChoicesEscapes.java. Rewrite it so that it has identical-looking output but only uses a single println() statement with escape sequences.

The output of previous exercise

```
$ javac PrintingChoices.java
$ java PrintingChoices
Alpha
Bravo
Charlie
Delta

Golf
Hotel
India

This is a test.
I am learning Java the Hard Way!
```

Using a single println() statement with escape sequences

```java
System.out.println("Alpha\nBravo\nCharlie\nDelta\n\nGolf\nHotel\n\nIndia\n" + "This" + " " + "is" + " " + "a" + " " + "test.\n" 
  + "I am" + " " + "learning" + " " + "Java the Hard" + " " + "Way!");
```

The output of it

```
$ javac PrintingChoicesEscapes.java
$ java PrintingChoicesEscapes
Alpha
Bravo
Charlie
Delta

Golf
Hotel

India
This is a test.
I am learning Java the Hard Way!
```





## logging

2020-02-28 18:46:18 add Study Drills

2020-02-27 16:31:49 init