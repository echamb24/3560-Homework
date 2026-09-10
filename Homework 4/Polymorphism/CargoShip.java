public class CargoShip extends Ship {

    private int cargoCap;

    public CargoShip(String shipName, String yearBuilt, int cargoCap){
        super(shipName, yearBuilt);
        this.cargoCap = cargoCap;
    }

    public int getCargoCap(){
        return cargoCap;
    }

    public void setCargoCap(int cargoCap){
        this.cargoCap = cargoCap;
    }

    @Override
    public void print(){
        System.out.println("Name: " + super.getShipName() + "\nMax Passengers: " + cargoCap);
    }

}