public class Driver {
    public static void main(String[] args) {
        
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Some Publisher"); 
        Course course1 = new Course("CS 3560 - Object Oriented Design and Programming", instructor1, textbook1);
        
        System.out.println("Course 1 ---");
        course1.print();
        
        Instructor instructor2 = new Instructor("Jack", "Beckley", "N/A");
        Textbook textbook2 = new Textbook("Archery 101", "Robin Hood", "Some Other Publisher");
        Course course2 = new Course("KIN 1200A - Archery", instructor2, textbook2);
        
        System.out.println("\nCourse 2 ---");
        course2.print();
    }
}
