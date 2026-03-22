package proger;

public class car extends transport implements ILights {

    private boolean isOn = false;
    public Engine engine = new Engine();

    @Override
    public void moveObject(float speed) {
        System.out.println("наш объект двигается со скоростью: " + speed);
    }

    public car(float _speed, int _weight, String _color, byte[] _coordinate) {
        super(_speed, _weight, _color, _coordinate);
    }
public car() {}
    @Override
    public void setLight(boolean set) {
      this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("мы моргаем фарами");
    }
}