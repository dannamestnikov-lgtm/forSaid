package proger;

public abstract class transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public transport(){

    }
    public transport(float _speed, int _weight, String _color, byte[] _coordinate) {
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
//        System.out.println(getValues());
    }

    public transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
//        System.out.println(getValues());
    }

    public abstract void moveObject(float speed);

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "object speed: " + this.speed + " Weight: " + this.weight + " color: " + this.color;
        String infoCoordinates = " \nCoordinates:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }

    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady){
            this.isReady = isReady;
        }

        public void info() {
            if (isReady) {
                System.out.println("Двигатель исправен");
            } else {
                System.out.println("Двигатель не рабочий. Его пробег составляет " + km + "km");
            }
        }
    }
}

