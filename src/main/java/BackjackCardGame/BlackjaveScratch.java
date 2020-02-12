/*
 * Arianna Biernacki
 * Student ID: 991270882
 * PROG24178 - Object Oriented Programming 2 - Java
 */
package BackjackCardGame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class BlackjaveScratch {

    //Import Constructors
    ArrayList deck = new ArrayList();
    ArrayList playerCards = new ArrayList();
    ArrayList dealerCards = new ArrayList();
    Scanner input = new Scanner(System.in);
    private Random randomGenerator;

    public void start() {
        createDeck();
//        showDeck();
        shuffleDeck();

        //Deal/Give player 2 cards
        dealToPlayer();
        dealToPlayer();

        //Deal/give dealer 2 cards
        dealToDealer();
        dealToDealer();

        //Show Cards
        showPlayerCards();
        showDealerCards();

        //Lets play!
        game();

        /*
         * Player's turn
         * 
         * while (true) {
         *    read player choice
         *    if (playerChoice == "stay"){
         *       break;
         *    }
         * deal a card to the player
         *    check: if(busted){
         *       gameover
         *    }
         * }
         */
        //if reach here, player has stayed
        //Dealer's turn now
        /*
         *while (true){
         *   if(dealerSum >= 16){
         *      break;
         *   }
         *   deal a card to the dealer
         *      if(busted){
         *         game over
         *      }
         *   }
         * }
         */
        //If we reach here, then noone busted
        //Compare the dealer's and player's sums and announce winner
    }

    private void game() {
        while (true) {
            checkPlayerHand();
            System.out.println("Hit or stay?");
            String playerAns = input.nextLine();
            if (playerAns.matches("[Ss](tay)?")) {
                break;
            }
            dealToPlayer();
            checkPlayerHand();
//            if (checkPlayerHand() > 21) {
//                System.out.println("Busted! Game over.");
//                System.exit(0);
//            }

            while (checkDealerHand() < 16) {
                dealToDealer();
                if (checkDealerHand() > 21) {
                    System.out.println("Dealer Busted. You won!");
                    System.exit(0);
                }
            }

            if (checkDealerHand() >= checkPlayerHand()) {
                System.out.println("Dealer won!");
            } else {
                System.out.println("You won!");
            }
        }
    }

    private void createDeck() {
        String[] suits = new String[]{"H", "D", "C", "S"};
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 13; i++) {
                Card card = new Card();
                card.suit = suits[j];
                card.rank = i;
                deck.add(card);
            }
        }
    }

    private void showDeck() {
        System.out.println("The original deck is: ");
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("The shuffled deck is: ");
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
//            System.out.println(card.suit + card.rank);
        }
    }

    private void dealToPlayer() {
        Card card = (Card) deck.remove(0);
        playerCards.add(card);
    }

    private void dealToDealer() {
        Card card = (Card) deck.remove(0);
        dealerCards.add(card);
    }

    private void showPlayerCards() {
        System.out.println("Player: ");
        for (int i = 0; i < playerCards.size(); i++) {
            Card card = (Card) playerCards.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    private void showDealerCards() {
        System.out.println("Dealer: ");
        for (int i = 0; i < dealerCards.size(); i++) {
            Card card = (Card) dealerCards.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    private int checkPlayerHand() {
        Card card = (Card) deck.clone();
        int playerHandSum = 0;
        for (int i = 0; i < playerCards.size(); i++) {
            playerHandSum += card.rank;
        }
        System.out.println("Your deck is " + playerHandSum);
        if (playerHandSum > 21) {
            System.out.println("***BUSTED!***");
            System.out.println("Your hand is " + playerHandSum);
        }
        return playerHandSum;
    }

    private int checkDealerHand() {
        int dealerHandSum = 0;
        for (int i = 0; i < dealerCards.size(); i++) {
            dealerHandSum += (int) dealerCards.get(i);
        }
        return dealerHandSum;
    }

}
