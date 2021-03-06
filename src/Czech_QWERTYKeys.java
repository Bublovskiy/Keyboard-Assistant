/**
 * Created by BMW on 2016-05-24.
 */
public class Czech_QWERTYKeys implements Language {

    // Row 1 to 6
    // "" values  - no values to be displayed
    private String[][] Keys = new String[][] {
            //row 1, keys 1-14
            {"","","","","","","","","","","","","",""},
            // row 2, keys 1-14
            {"|\\","+","Ě","Š","Č","Ř","Ž","Ý","Á","Í","É","=%","'ˇ",""},
            //row 3, keys 1-14
            {"","Q","W","E","R","T","Y","U","I","O","P","Ú/",")(","¨`"},
            //row 4, keys 1-13
            {"","A","S","D","F","G","H","J","K","L","Ů","§!",""},
            //row 5, keys 1-12
            {"","Z","X","C","V","B","N","M",",?",".:","-_",""},
            //row 6, keys 1-11
            {"","","","","","","","","","",""},
    };
    //return key array
    public String[][]  getKeys() {return Keys;}
}