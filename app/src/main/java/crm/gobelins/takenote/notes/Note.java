package crm.gobelins.takenote.notes;

public class Note {
    private int mID;
    private String mTitle;
    private String mText;

    public Note(int id, String title, String text) {
        mID = id;
        mTitle = title;
        mText = text;
    }

    public int getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }
}
