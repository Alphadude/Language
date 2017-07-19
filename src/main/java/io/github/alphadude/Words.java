package io.github.alphadude.language;

/**
 * Created by alphadude on 7/4/17.
 */

public class Words {

    private String mEnglish;
    private String mLocal;
    private int mimage;

    public Words(String mEnglish, String mLocal, int mimage){
        this.mEnglish = mEnglish;
        this.mLocal = mLocal;
        this.mimage = mimage;


    }

    public String getmEnglish() {
        return mEnglish;
    }


    public String getmLocal() {
        return mLocal;
    }

    public int getMimage() {return mimage; }
}
