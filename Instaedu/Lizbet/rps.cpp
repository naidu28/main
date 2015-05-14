#include <stdio.h>
#include <ctype.h>
#include <time.h>
#include <stdlib.h>

int main(void) {
  char game;
  int x;
  int userWins, compWins;
  int totalGames;

  userWins = 0;
  compWins = 0;
  totalGames = 0;
  
  printf("Rock-Paper-Scissors!\n");
  printf("Author: Lizbet\n");
  printf("Course: \n");
  printf("Semester: Spring 2015\n\n");
  printf("\tInstructions: this is a game of rock-paper-scissors.\n");
  printf("\t\tRock smashes scissors.\n");
  printf("\t\tPaper covers rock.\n");
  printf("\t\tScissors cuts paper.\n");
  printf("\t\tThe contestents are you and the computer.\n");
  printf("\t\tLet the games begin!\n\n");
  fprintf(stderr, "\tPress any key to continue.");
  getchar();
  
  srand(time(NULL));

  do {
    printf("Choose your weapon:");
    printf("\n\t Choose R for rock.");
    printf("\n\t Choose P for paper.");
    printf("\n\t Choose S for scissor.");
    printf("\n\t Choose x for exit.");

    scanf("%c", &game);
    game = toupper(game);

    switch(game)
    {
      case 'R': 
        x = 0;
        break;
      case 'P': 
        x = 1;
        break;
      case 'S': 
        x = 2;
        break;
      case 'X': 
        x = 3;
        break;
      default:
        printf("Invalid choice.");
        break;
    } 
  
    //Computer choice
    int compChoice = rand()%2;

    printf(" your choice is: %c\n", game);
    if (x == compChoice) {
      printf("TIE!");
    } else if (x == 0 && compChoice == 1) {
      printf("Computer wins!");
      compWins++;
    } else if (x == 0 && compChoice == 2) {
      printf("User wins!");
      userWins++;
    } else if (x == 1 && compChoice == 0) {
      printf("User wins!");
      userWins++;
    } else if (x == 1 && compChoice == 2) {
      printf("Computer wins!");
      compWins++;
    } else if (x == 2 && compChoice == 0) {
      printf("Computer wins!");
      compWins++;
    } else if (x == 2 && compChoice == 1) {
      printf("User wins!");
      userWins++;
    } else {
      totalGames--;
    }
    printf("\n");
    totalGames++;
  } while ( game != 'X');

  double pWinU = (userWins/totalGames)*100;
  double pWinC = (compWins/totalGames)*100;
  int ties = totalGames - (compWins + userWins);
  double pTies = (ties/totalGames)*100;
  printf("Ties: %d \t Percent: %f\n", ties, pTies);
  printf("User wins: %d \t Percent: %.1f\n", userWins, pWinU);
  printf("Comp wins: %d \t Percent: %.1f\n", compWins, pWinC);

  return 0;
}