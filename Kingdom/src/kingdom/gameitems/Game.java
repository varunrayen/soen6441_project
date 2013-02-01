/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.gameitems;

import java.util.ArrayList;
import java.util.List;
import kingdom.config.ConfigManager;
import kingdom.config.GameConfig;
import kingdom.utiles.InitHelper;

/**
 *
 * @author andriy
 */
public class Game {
    
    private static final ConfigManager confManager = new ConfigManager();
    /* current epoch */
    private int epoch;
    /* user that has a turn */
    private int currentUser;
    /* all many owned game(bank) */
    private int money;
    
    /* all not used tiles in the game (shuffled) */
    private List<Tile> freeTiles = new ArrayList(23);
     /* all not used castles in the game */
    private List<Castle> freeCastles = new ArrayList(16);
    /* list of actually playing users [2-4] */
    private List<User> activeUsers = new ArrayList(4);
    /* board cells 5-rows, 6-columns [row][column] */
    private BoardCell[][] boardCells = new BoardCell[5][]; //[row][column];
    
    public Game(){
        init();
    }

    private void init() {
        
        InitHelper.createBoardCells(boardCells);
        InitHelper.createTiles(freeTiles);
        InitHelper.createCastles(freeCastles);
        this.money = 1079;
        this.currentUser = 0;
        this.epoch = 0;
        
        //test
        boardCells[2][3].setItem(freeTiles.get(5));
        boardCells[1][2].setItem(freeCastles.get(0));
    }
    
    public boolean saveAllConfigs(){
        GameConfig gc = new GameConfig(this);
        return confManager.saveConfig(gc);
    }
    
    public boolean loadAllConfigs(){
        GameConfig conf = confManager.loadConfig();
        //temp test
        this.epoch = conf.getEpoch();
        return true;
    }
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////
    // accessors                                                                        //
    //////////////////////////////////////////////////////////////////////////////////////

    public int getEpoch() {
        return epoch;
    }

    public void setEpoch(int epoch) {
        this.epoch = epoch;
    }

    public int getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(int currentUser) {
        this.currentUser = currentUser;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Tile> getFreeTiles() {
        return freeTiles;
    }

    public void setFreeTiles(List<Tile> freeTiles) {
        this.freeTiles = freeTiles;
    }

    public List<Castle> getFreeCastles() {
        return freeCastles;
    }

    public void setFreeCastles(List<Castle> freeCastles) {
        this.freeCastles = freeCastles;
    }

    public List<User> getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(List<User> activeUsers) {
        this.activeUsers = activeUsers;
    }

    public BoardCell[][] getBoardCells() {
        return boardCells;
    }

    public void setBoardCells(BoardCell[][] boardCells) {
        this.boardCells = boardCells;
    }
    
    
}
