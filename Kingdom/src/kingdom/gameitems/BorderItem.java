/*
 * TEAM C in SOEN6441/WW
 */
package kingdom.gameitems;

/**
 * Parent class for Tile or Cell. May be abstract later. Contains shared properties of Tile and Cell.
 * Tile and Cell has to derive from this class to have all shared properties.
 */
public class BorderItem {
    
    /* title of item (will be shown as text in game border cell */
    protected String title;
    /* hint of cell (will be shown on mouse-over) */
    protected String hint;
    /* image that represent the cell (may be changed to Image.class later */
    protected String image;
    
    /**
     * @param title title of item (will be shown as text in game border cell
     */
    public BorderItem(String title){
        this.title = title;
    }
    
}
