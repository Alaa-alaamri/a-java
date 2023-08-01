import java.util.Random;
import java.util.Scanner;

//rock paper scissors game

public class game {

    public static void main(String[] args) {
        int userChoice, computerChoice, rock, paper;

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();

        //the variables:
        rock = 0;
        paper = 1;
        int scissors = 2;
        String pc = "pc";
        String p2 = "p2";

        //intro
        System.out.println("enter your name");
        String name = input.next();
        System.out.println("Welcome " + name + " in ROCK - PAPER - SCISSORS GAME");
        //select the game mode
        System.out.println("enter the game mode");
        String mode = input.next();
        //user 1 choice
        System.out.println("Enter your choice (0=rock, 1=paper, 2=scissors)");
        //User input
        userChoice = input.nextInt();

        if (mode.equals(pc)) {
            //if user chooses above 2
            while (userChoice > 2) {
                System.out.println("give number between 0 and 2");
                userChoice = input.nextInt();
            }
            //user selections
            if (userChoice == rock) {
                System.out.println("User chose ROCK");
            } else {
                if (userChoice == paper) {
                    System.out.println("User chose PAPER");
                } else {
                    System.out.println("User chose SCISSORS");
                }
            }
            //computer input (random)
            computerChoice = rnd.nextInt(3);

            //computer selection
            if (computerChoice == rock) {
                System.out.println("Computer chose ROCK");
            } else {
                if (computerChoice == paper) {
                    System.out.println("Computer chose PAPER");
                } else {
                    System.out.println("Computer chose SCISSORS");
                }
            }

            //Results section

            //Draw
            while (userChoice == computerChoice) {
                System.out.println("draw try again");

                // if user chooses above 2
                userChoice = input.nextInt();
                while (userChoice > 2) {
                    System.out.println("give number between 0 and 2");
                    userChoice = input.nextInt();
                }
                computerChoice = rnd.nextInt(3);
                // DRAW user selections
                if (userChoice == rock) {
                    System.out.println("User chose ROCK");
                } else {
                    if (userChoice == paper) {
                        System.out.println("User chose PAPER");
                    } else {
                        System.out.println("User chose SCISSORS");
                    }
                }
                //DRAW computer selection
                if (computerChoice == rock) {
                    System.out.println("Computer chose ROCK");
                } else {
                    if (computerChoice == paper) {
                        System.out.println("Computer chose PAPER");
                    } else {
                        System.out.println("Computer chose SCISSORS");
                    }
                }
            } //END DRAW

//RESULTS
            if (computerChoice == rock) {
                if (userChoice == paper) {
                    System.out.println("User wins!");
                } else {
                    System.out.println("Computer Wins");
                }
            } else if (computerChoice == paper) {
                if (userChoice == rock) {
                    System.out.println("Computer wins");
                } else {
                    System.out.println("User Wins!");
                }
            } else if (userChoice == rock) {
                System.out.println("User Wins");
            } else {
                System.out.println("Computer Wins");
            } //END RESULTS


            // 2 players mode
        } else {
            //user2
            System.out.println("player 2 enter a choice :");
            int user2 = input.nextInt();
         // more than 2
            while (user2 > 2) {
                System.out.println("give number between 0 and 2");
                user2 = input.nextInt();
            }
            //user2 selections
            if (user2 == rock) {
                System.out.println("User2 chose ROCK");
            } else {
                if (user2 == paper) {
                    System.out.println("User2 chose PAPER");
                } else {
                    System.out.println("User2 chose SCISSORS");
                }

                //user2 selection
                if (userChoice == rock) {
                    System.out.println("user1 chose ROCK");
                } else {
                    if (userChoice == paper) {
                        System.out.println("user1 chose PAPER");
                    } else {
                        System.out.println("user 1 chose SCISSORS");
                    }

                    //result
                    //Draw
                    while (userChoice == user2) {
                        System.out.println("draw try again");

                        // if user chooses above 2
                        userChoice = input.nextInt();
                        while (userChoice > 2) {
                            System.out.println("give number between 0 and 2");
                            userChoice = input.nextInt();
                        }
                        user2 = rnd.nextInt(3);
                        // DRAW user selections
                        if (userChoice == rock) {
                            System.out.println("User chose ROCK");
                        } else {
                            if (userChoice == paper) {
                                System.out.println("User chose PAPER");
                            } else {
                                System.out.println("User chose SCISSORS");
                            }
                        }
                        //DRAW user2 selection
                        if (user2 == rock) {
                            System.out.println("Computer chose ROCK");
                        } else {
                            if (user2 == paper) {
                                System.out.println("Computer chose PAPER");
                            } else {
                                System.out.println("Computer chose SCISSORS");
                            }
                        }
                    }
                    // Winner results
                    if (user2 == rock) {
                        if (userChoice == paper) {
                            System.out.println("User wins!");
                        } else {
                            System.out.println("user Wins");
                        }
                    } else if (user2 == paper) {
                        if (userChoice == rock) {
                            System.out.println("user2 wins");
                        } else {
                            System.out.println("User Wins!");
                        }
                    } else if (userChoice == rock) {
                        System.out.println("User Wins");
                    } else {
                        System.out.println("user2 Wins");
                    }
                }

            }
        }


    }
}


