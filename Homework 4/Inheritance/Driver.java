public class Driver{

    public static void main(String[] args) {
        SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee nicoleDior = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Davenport", "555-55-5555", 1700);
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee mahnazVaziri = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        System.out.println("All Employees successfully initialized");

    }

}