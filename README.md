<h1 align="center"><u>Play with Computer</u></h1>

<h3>It is a game where " The Guesser " will select a number from 1 to 100, and the player(s) are required to guess the same number.</h3>
<h3>Whoever guesses the number first will win this game.</h3>
<h3>Really !!</h3>
<h3>Looks very simple, right !!</h3>
<h3>Here is the catch</h3>
<h3>If multiple players are turning up for this game, then the number of SET(s) will be equal to the total number of players.</h3>
<h3>For eg, if 3 players enroll for this game, they will have to play 3 SETs of game.</h3>
<h3>Based on the performance in each SET, THE UMPIRE will decide the winner.</h3>

## Overview

Guesser Game is a Java console application. The computer ("The Guesser") picks a random number from 1 to 100 and between one and three players try to guess it. "The Umpire" runs the game and announces the result.

## Game Rules

- **Number of players:** 1 to 3. Any other value ends the program.
- **1 player:** one random number is chosen and the player gets 3 attempts to guess it. Guessing correctly wins; otherwise the game is over after 3 attempts.
- **2 players:** 2 sets are played. In each set a new random number is chosen, both players guess once, and every player who guesses correctly gets 1 point. The player with more points wins, or the game is tied.
- **3 players:** same as above, with 3 sets. The Umpire declares a single winner or the players that are tied.
- **Valid guesses:** every guess must be between 1 and 100. An out-of-range guess raises a custom `NumberOutOfBoundException` and the program exits.

Note: `Guesser.getGuessedNumber()` prints the secret number to the console ("Cheating !! Cheating !! ...") each time a new number is chosen, so the number is visible while playing.

## Tech Stack

- Java (the IntelliJ IDEA project is configured for JDK 18)
- Standard library only (`java.util.Scanner`, `java.util.Random`), no external dependencies or build tool

## Project Structure

```
Guesser Game/
├── Guesser Game.iml              IntelliJ IDEA module file
├── .idea/                        IntelliJ IDEA project settings
├── out/production/Guesser Game/  Compiled .class files from IntelliJ
└── src/JavaGame/
    ├── Driver.java                     Entry point (main method)
    ├── Umpire.java                     Asks for the number of players and starts the matching game mode
    ├── OnePlayer.java                  Single-player mode (3 attempts)
    ├── TwoPlayers.java                 Two-player mode (2 sets)
    ├── ThreePlayers.java               Three-player mode (3 sets)
    ├── Guesser.java                    Generates the random number (1-100)
    ├── Player.java                     Reads a player's guess from the console
    ├── NameInputs.java                 Reads a player's name from the console
    ├── NumberOfPlayers.java            Reads the number of players from the console
    ├── ExceptionImplementation.java    Validates player count and guesses
    └── NumberOutOfBoundException.java  Custom checked exception
```

## Prerequisites

- JDK 18 or newer (any recent JDK should compile the code)

## How to Run

### Command line

Linux/macOS:

```bash
cd "Guesser Game"
javac -d out src/JavaGame/*.java
java -cp out JavaGame.Driver
```

Windows (Command Prompt):

```bat
cd "Guesser Game"
javac -d out src\JavaGame\*.java
java -cp out JavaGame.Driver
```

### IntelliJ IDEA

Open the `Guesser Game` folder as a project and run `JavaGame.Driver`.

## Usage

1. Enter the number of players (1 to 3).
2. Enter each player's name (a single word; input is read with `Scanner.next()`).
3. When prompted, each player enters a guess from 1 to 100.
4. The Umpire prints the results of each set (multiplayer) and announces the winner or a tie.
