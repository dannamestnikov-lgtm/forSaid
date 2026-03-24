public class PrintHello implements ButtonAction{
    @Override
    public void execute(){
        System.out.println("О, Здарова");
    }
    @Override
    public int nums(){
        return 1;
    }

    @Override
    public void PressButton(ButtonAction moove) {
    }
}
