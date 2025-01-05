package demo1_cardshuffle;

import java.util.ArrayList; 
import java.util.List;
/**
 * 
 *  玩家类型 
 */ 
public class Player {
	private int ID ; 
	private String name ;
	private List<PokerCard> handCards;//这里用List不用Set是因为Set是无序的 
	public Player(int ID,String name) {
		this.ID = ID ; this.name = name ; 
		this.handCards = new ArrayList<PokerCard>();
		}
	public List<PokerCard> getHandCards() {
		return handCards;
		} 
	public void setHandCards(List<PokerCard> handCards) {
		this.handCards = handCards;
		}
	public int getID() {
		return ID;
		} 
	public String getName() { 
		return name; 
		} 
	}

