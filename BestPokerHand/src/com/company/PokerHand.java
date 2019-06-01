package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PokerHand {

    private int CardTypeNum , CardKindNum;
    private ArrayList<String> CardTypes = new ArrayList<String>();
    private ArrayList<String> CardKinds = new ArrayList<String>();
    private Map<String,String> AllDeck = new HashMap<String, String>(5);

    private void Hands()
    {
        //This place will find the best hand


    }

    public void Deck()
    {
            for(int i = 0 ; i<5 ; i++) {
            CardKindNum = (int)(Math.random()*4 + 1); CardKindInfo();
            CardTypeNum = (int)(Math.random()*13 + 1);CardTypeInfo();
            AllDeck.put(CardKinds.get(i), CardTypes.get(i));
            }
            System.out.println(CardTypes);
            System.out.println(CardKinds);
            System.out.println(AllDeck);
    }

    private void CardKindInfo() {
        switch(CardKindNum)
        {
            case 1:CardKinds.add("Club");break;
            case 2:CardKinds.add("Diamond");break;
            case 3:CardKinds.add("Heart");break;
            case 4:CardKinds.add("Spade");break;
        }
    }
    private void CardTypeInfo() {
        switch(CardTypeNum)
        {   
            case 1: CardTypes.add("Ace");    break;//Ace
            case 2: CardTypes.add("Two");    break;//2
            case 3: CardTypes.add("Three");    break;
            case 4: CardTypes.add("Four");    break;
            case 5: CardTypes.add("Five");    break;
            case 6: CardTypes.add("Six");    break;
            case 7: CardTypes.add("Seven");    break;
            case 8: CardTypes.add("Eight");    break;
            case 9: CardTypes.add("Nine");    break;
            case 10:CardTypes.add("Ten");    break;//10
            case 11:CardTypes.add("Jack");    break;//Jack
            case 12:CardTypes.add("Queen");    break;//Queen
            case 13:CardTypes.add("King");    break;//King
        }
    }
}
