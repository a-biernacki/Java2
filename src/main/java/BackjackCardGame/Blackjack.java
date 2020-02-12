/*
 * Arianna Biernacki
 * Student ID: 991270882
 * PROG24178 - Object Oriented Programming 2 - Java
 */
package BackjackCardGame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    //Import Constructors
    ArrayList deck = new ArrayList();
    ArrayList playerCards = new ArrayList();
    Scanner input = new Scanner(System.in);
    private Random randomGenerator;

    public void start() {
        createDeck();
        showDeck();

        //Deal/Give player 2 cards
        dealToPlayer();
        dealToPlayer();

        //Deal/give dealer 2 cards
        dealToDealer();
        dealToDealer();

        showPlayerCards();
        showDealerCards();

        while (true) {
            System.out.println("Hit or stay?");
            String choice = input.nextLine();
            if (choice.toUpperCase().equals("S")) {
                break;
            }

            dealToPlayer();
            if (calcPlayerSum() > 21) {
                System.out.println("Busted. Game over!");
                System.exit(0);
            }
        }

        //Dealer's turn
        while (calcDealerSum() < 16) {
            dealToDealer();
            if (calcDealerSum() > 21) {
                System.out.println("Dealer Busted. You won!");
                System.exit(0);
            }
        }

        if (calcDealerSum() >= calcPlayerSum()) {
            System.out.println("Dealer won!");
        } else {
            System.out.println("You won!");
        }

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

//        for (int i = 1; i <= 13; i++) {
//            Card card = new Card();
//            card.suit = "H";
//            card.rank = i;
//            deck.add(card);
//        }
//        for (int i = 1; i <= 13; i++) {
//            Card card = new Card();
//            card.suit = "D";
//            card.rank = i;
//            deck.add(card);
//        }
//        for (int i = 1; i <= 13; i++) {
//            Card card = new Card();
//            card.suit = "S";
//            card.rank = i;
//            deck.add(card);
//        }
//        for (int i = 1; i <= 13; i++) {
//            Card card = new Card();
//            card.suit = "C";
//            card.rank = i;
//            deck.add(card);
//        }
    }

    private void showDeck() {
        System.out.println("The deck is: ");
        for (int i = 0; i < deck.size(); i++) {
            Card card = (Card) deck.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    private void dealToPlayer() {
        Card card = (Card) deck.remove(0);
        playerCards.add(card);
    }

    private void dealToDealer() {
    }

    private void showPlayerCards() {
        System.out.println("Player: ");
        for (int i = 0; i < playerCards.size(); i++) {
            Card card = (Card) playerCards.get(i);
            System.out.println(card.suit + card.rank);
        }
    }

    private void showDealerCards() {

    }

    private int calcDealerSum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int calcPlayerSum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
