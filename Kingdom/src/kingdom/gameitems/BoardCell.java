/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.gameitems;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 * Cell on border. The cell may be empty (item=null) or have some item on the sell (castle or tile). At the beginning of the game 
 * all cells are placed on the game border with empty item. During action (when user move tile to game border), the  cell where tile is placed
 * receive BoardItem. When paint() is called to repaing the cell, picture/tile/hint... may be shown. So the BorderCell becomes visible in 
 * the game border
 */
public class BoardCell extends JPanel{
    public static final int SIDE = 80;
    
    /* hint to shown when mouse-over */
    private String hint;
    /* refference to item placed on the cell (by default is null) */
    private BorderItem item;
    
    public BoardCell(){
        // TODO
         init();
         addListeners();
    }
    
    /**
     *
     * @param item the item placed on the cell (may be Tile or Castle). Set NULL if cell is empty, so it will accept item later.
     */
    public BoardCell(BorderItem item){
        this.item = item;
    }

    /**
     *
     * @return The Item that is placed on the cell (may be Tile or Castle). Return NULL if cell has no item (empty game cell).
     */
    public BorderItem getItem() {
        return item;
    }

    /**
     *
     * @param item The Item that is placed on the cell (may be Tile or Castle). Return NULL if cell has no item (empty game cell).
     */
    public void setItem(BorderItem item) {
        this.item = item;
    }

    private void init() {
        setBackground(new java.awt.Color(150, 242, 150));
        setPreferredSize(new Dimension(SIDE, SIDE));

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                super.mouseEntered(evt);
                setBackground(new java.awt.Color(200, 242, 200));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                setBackground(new java.awt.Color(150, 242, 150));
            }
            
            
        });
    }

    private void addListeners() {
        
         addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 0, 0)));
                Game.getInstance().setSelectedCell(BoardCell.this);
            }
        });
        
    }
    
    
    
}
