public class Driver {
    
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Golden Bear", "1986");
        ships[1] = new CruiseShip("Titanic", "1912", 3327);
        ships[2] = new CargoShip("Pretend It's a Real Cargo Ship", "1984", 26);
        
        for (int i = 0; i < ships.length; i++) {
            ships[i].print();
        }
    
    }
}
