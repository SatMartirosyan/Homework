package Homework25;


public class Guru implements Logic{
    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    private Logic logic;

    @Override
    public int doSmthing(int num1, int num2) {
        return logic.doSmthing(num1, num2);
    }
}
