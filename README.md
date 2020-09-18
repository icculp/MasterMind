# Hack day: Mastermind challenge
Hack day MasterMind game challenge, written in an unfamiliar language

## Challenge
Today, you will implement the game Mastermind.
Easy? Sure, but did you already developed it in SQL? or Cobol?
Also, for each version of the Mastermind, you will have to write an “How to write a Mastermind in XXX?” blog post.
All these “How to” must be hosted in a Github page or in a Blog platform (WordPress, Jekyll, Drupal, etc.) that you will administrated per campus.

Requirements
* By group of 5~ students (you can regroup based on attendance) - but your evaluation will be as campus!
* Each language can only be used once per campus - advice: take 10-20min at the beginning of the day to dispatch languages.
* Each group must develop at least one Mastermind version - feel free to develop as more as you can - but don’t forget to help your peers!
* You are free of the number of columns, colors and turns.
* Each game can be one player (against a bot) or 2 players
* Only languages bellow are allowed for implementing the Mastermind
* Make it fun!

## How to Play
* To play the game, the user will need to clone the program from this repository and will first need to have the Java Runtime Environment installed.
* The first time the user is ready to play the game, they will need to compile the code.  In a Linux environment, this can be done with “javac main.java”
* To run the game, the user can run the executable program with “java main”
* Instructions will appear for the user, including the color options
* Users can choose colors from 6 color options.  The user will type in 4 characters that correspond to the 4 colors they are guessing and press Enter to submit their guess:
‘r’ = red, ‘o’ = orange, ‘y’ = yellow, ‘g’ = green, ‘b’ = blue, ‘p’ = purple
* Colors will be tested against original code and the user will be given information about the correctness of their code.
* If the user has not guessed the code correctly, they will be told how their guess measured up to the secret code and how many tries they have left
* If the user guesses the secret code, they will be given a win message!  If they run out of chances, they will get a message stating what the secret code is.
* The user is prompted to see if they would like to play again.  The user is asked to enter y/n to play or exit.
