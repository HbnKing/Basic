package demo1_cardshuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
* 扑克牌“洗牌”、“发牌”、“游戏”过程
* created by xiexie on 2017/2/25
*
*/
public class InitialPlayCard {

private final String[] cardSuits = { "黑桃", "红桃", "梅花", "方片" };// 黑桃、红桃、梅花、方片
private final String[] cardPoints = { "2", "3", "4", "5", "6", "7", "8",
        "9", "10", "J", "Q", "K", "A" };// 2-10、J、Q、K、A
private List<PokerCard> pcs;//定义一副扑克牌对象
private List<Player> players;//定义一群玩家
private List<Player> playersNewList ;//存储调整手牌顺序后的玩家
private Scanner console;//定义一个输入流

public InitialPlayCard() {
    pcs = new ArrayList<PokerCard>();
    players = new ArrayList<Player>();
}

public static void main(String[] args) {
    // 创建一副扑克牌
    System.out.println("-----------------创建扑克牌-----------------");
    InitialPlayCard initPC = new InitialPlayCard();
    initPC.createPokerCards();// 创建扑克牌
    System.out.println("-----------------扑克牌创建成功！-----------------");
    initPC.showPokerCards();// 显示扑克牌
    System.out.println("-----------------开始洗牌-----------------");
    initPC.shuffleCard();// 洗牌
    System.out.println("-----------------洗牌结束！-----------------");
    System.out.println("-----------------创建玩家-----------------");
    initPC.console = new Scanner(System.in);
    for (int i = 1; i < 3; i++) {
        System.out.println("请输入第" + i + "位玩家的ID和姓名：");
        // 这里需要实现输入整数异常处理
        int ID = initPC.checkInputID();
        System.out.println("输入姓名：");
        String name = initPC.console.next();
        initPC.addPlayer(ID, name);
    }
    initPC.welcomePlayers();// 欢迎玩家

    System.out.println("-----------------开始发牌-----------------");
    initPC.dealCards();// 发牌
    System.out.println("-----------------发牌结束-----------------");

    System.out.println("-----------------开始游戏-----------------");
    initPC.play();// 进行手牌比较大小
    initPC.getWinner();// 得到冠军

    System.out.println("玩家各自的手牌为：");
    initPC.showHandCards();// 显示玩家手中的牌
    //initPC.showOrderHandCards();//显示玩家排序后手中的牌

}

/**
 * 创建一副扑克牌，花色和点数是固定的
 * 
 * @return
 */
private void createPokerCards() {
    for (int i = cardSuits.length - 1; i >= 0; i--) {
        for (int j = 0; j < cardPoints.length; j++) {
            pcs.add(new PokerCard(cardSuits[i], cardPoints[j]));
        }
    }
}

/**
 * 
 * 显示扑克牌
 * 
 * @return
 */
private void showPokerCards() {
    StringBuilder sbd = new StringBuilder();
    sbd.append("[");
    for (PokerCard pc : pcs) {
        sbd.append(pc.getInfo() + ",");
    }
    System.out.println("为：" + sbd.substring(0, sbd.length() - 1) + "]");
}

/**
 * 
 * 洗牌，就是打乱List顺序
 * 
 * @return
 */
private void shuffleCard() {    
    Collections.shuffle(pcs);
    StringBuilder sbd = new StringBuilder();
    sbd.append("[");
    for (PokerCard pc : pcs) {
        sbd.append(pc.getInfo() + ",");
    }
    //System.out.println("洗牌后为：" + sbd.substring(0, sbd.length() - 1) + "]");
}

/**
 * 
 * 判断输入的ID，必须为int类型
 * Scanner在发生InputMismatchException异常时，如果不作处理，后面的next会一直异常下去
 * 有两个办法：1、将当前Scanner对象重写创建 例如console = new Scanner(System.in); 2、手动换行
 * console.next();
 * 
 * @return
 */
private int checkInputID() {
    int inputID;
    do {
        System.out.println("输入ID：");
        try {
            inputID = console.nextInt();
        } catch (Exception e) {
            System.out.println("请输入整数类型的ID！");
            inputID = -1;
            // console = new Scanner(System.in);
            console.next();
        }
    } while (inputID == -1);
    return inputID;
}

/**
 * 添加玩家
 * 
 * @return
 */
private void addPlayer(int ID, String name) {
    Player p = new Player(ID, name);
    players.add(p);
}

/**
 * 
 * 欢迎玩家
 * 
 * @return
 */
private void welcomePlayers() {
    for (Player p : players) {
        System.out.println("----欢迎玩家:" + p.getName());
    }
}

/**
 * 发牌 从第一张开始，发给两名玩家，按照一人一张的方式，每人发两张 后面会调整手中牌的顺序，所以将刚发以后的牌 从这里返回
 */
private void dealCards() {
    for (int i = 0; i < 2; i++) {
        for (Player p : players) {
            PokerCard pc = pcs.get(0);
            p.getHandCards().add(pc);
            System.out.println("----玩家:" + p.getName() + "-拿牌");
            pcs.remove(0);// add一个，remove一个
        }
    }
}

/**
 * 开始游戏
 */
private void play() {
    playersNewList = new ArrayList<Player>();
    for (Player p : players) {
        Player playNew = new Player(p.getID(), p.getName());
        List<PokerCard> pcNewList = new ArrayList<PokerCard>();
        for (PokerCard pc : p.getHandCards()) {
            pcNewList.add(pc);
        }
        playNew.setHandCards(pcNewList);
        playersNewList.add(playNew);
    }
    for (Player p : playersNewList) {
        Collections.sort(p.getHandCards());//PokerCard类实现了Comparable接口，并重写compareTo方法
        System.out.println("玩家:" + p.getName() + "最大的手牌为："
                + p.getHandCards().get(0).getInfo());
    }
}

/**
 * 判断获胜者
 */
private void getWinner() {
    List<PokerCard> maxCards = new ArrayList<PokerCard>();
    for (Player p : playersNewList) {
        maxCards.add(p.getHandCards().get(0));
    }
    Collections.sort(maxCards);
    PokerCard maxCard = maxCards.get(0);
    // System.out.println("最大的牌是："+maxCard.getInfo());
    String winner = "";
    for (Player p : playersNewList) {
        if (p.getHandCards().contains(maxCard)) {
            winner = p.getName();
            break;
        }
    }
    System.out.println("-----------------玩家：" + winner
            + "获胜！-----------------");

}

/**
 * 显示玩家各自的手牌
 */
private void showHandCards() {
    for (Player p : players) {
        StringBuilder sbd = new StringBuilder();
        sbd.append(p.getName() + ":[");
        for (PokerCard pc : p.getHandCards()) {
            sbd.append(pc.getInfo() + ",");
        }
        System.out.println(sbd.substring(0, sbd.length() - 1) + "]");
    }
}
/**
 * 显示玩家排序后各自的手牌
 */
private void showOrderHandCards() {
    for (Player p : playersNewList) {
        StringBuilder sbd = new StringBuilder();
        sbd.append(p.getName() + ":[");
        for (PokerCard pc : p.getHandCards()) {
            sbd.append(pc.getInfo() + ",");
        }
        System.out.println(sbd.substring(0, sbd.length() - 1) + "]");
    }
}
}

