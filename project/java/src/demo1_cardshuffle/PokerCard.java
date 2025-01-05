package demo1_cardshuffle;

import java.util.Arrays; 
import java.util.List; 
/**
 * 
 */
public class PokerCard implements Comparable<PokerCard> {
	private String cardSuit; //扑克牌的花色
	private String cardPoints; //扑克牌的点数
	
	public PokerCard(String cardSuit, String cardPoints) { 
		this.cardSuit = cardSuit; 
		this.cardPoints = cardPoints; 
		} 
	public String getCardSuit() {
		return cardSuit; 
		}
	public String getCardPoints() { 
		return cardPoints;
		} 
	public String getInfo() {
		return cardSuit + cardPoints; }
	
	
	
	@Override
	public int compareTo(PokerCard o) {
		// TODO Auto-generated method stub
		
		final String[] cardPointsArr = { "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
		final String[] cardSuitsArr = { "黑桃", "红桃", "梅花", "方片" };
		List<String> cardPointsList = Arrays.asList(cardPointsArr);
		List<String> cardSuitsList = Arrays.asList(cardSuitsArr); 
		int thisPointIndex = cardPointsList.indexOf(cardPoints); 
		int comparaPointIndex = cardPointsList.indexOf(o.cardPoints); 
		if (thisPointIndex == comparaPointIndex) { 
			int thisSuitIndex = cardSuitsList.indexOf(cardSuit); 
			int comparaSuitIndex = cardSuitsList.indexOf(o.cardSuit);
			return thisSuitIndex - comparaSuitIndex; 
			} else { 
				return thisPointIndex - comparaPointIndex;
				}
		
		
	} 
	
}
	