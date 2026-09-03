package exam.game;

public class Computer extends GawiBawiBo{
    public void setSelect(){
        super.setSelect((int)(Math.random() * 3));
    }
}
