package proger;

public class truck extends transport{

    public Engine engine = new Engine();

    private boolean isLoaded;

    public truck(int weight,byte[] coordinate){
        super(weight, coordinate);

    }

    public truck(int weight,byte[] coordinate, boolean isLoaded){
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("наш объект двигается со скоростью: " + speed);
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded){
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded(){
        if (isLoaded){
           return "грузовик загружен";
        } else {
            return "в грузовике есть место";
        }
    }
}
