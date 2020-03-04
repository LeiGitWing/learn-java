# Randomness

## What you should do on your own

1. Delete the `1 +` in front of all six lines that pick numbers 1-5, so that they look like this: `System.out.print( r.nextInt(5) + " " );` Run the program a few times, and see if you can figure out what range the new random numbers are in.

 The range of the new number is 1 to 4.

2. Change the `1 +` in front of all six lines that pick numbers 1-5, so that they look like this: `System.out.print( 3 + r.nextInt(5) + " " );` Run the program a few times. Is it picking random numbers from 3 to 5? If not, what range are they?

The new range of it is 3 to 7.

3. Change the line where you create the random number generator so that it looks like this: `Random r = new Random(12353);` This number is called a seed. Run the program a few times. What do you notice? What happened to the random numbers?

int x is always 4 instead of a random number.

4. Change to random seed to something else and observe the behavior. What happens to the random numbers?

The x won't change anymore after assign to the first one random number.

5. (Delete the random seed before turning in the assignment.)

Now the x is a random number.



## logging

2020-03-04 22:01:24 init