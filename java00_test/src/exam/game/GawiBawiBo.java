package exam.game;

public class GawiBawiBo {
    private int select;
    private String[] gawibawibo;

    public GawiBawiBo(){
        gawibawibo = new String[]{"Gawi", "Bawi", "Bo", "Exit"};
    }

    public int getSelect(){
        return select;
    }
    public void setSelect(int select) {
        this.select = select;
    }

    public String getHand() {
        return gawibawibo[select];
    }
}
