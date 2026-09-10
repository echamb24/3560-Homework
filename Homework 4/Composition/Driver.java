public class Driver {
    public static void main(String[] args) {
        
        //Lvl 0
        Folder phpDemo1 = new Folder("php_demo1");

        //Lvl 1
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        //Lvl 2
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        //Lvl3 (in app)
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));

        //Lvl3 (in public)
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".htrouter.php"));
        publicFolder.addFile(new File("index.html"));




        System.out.println("FIRST PRINT -------------------");
        phpDemo1.print();

        System.out.println("\nDELETE APP -------------------");
        sourceFiles.getSubFolders().remove(app);
        phpDemo1.print();

        System.out.println("\nDELETE PUBLIC -------------------");
        sourceFiles.getSubFolders().remove(publicFolder);
        phpDemo1.print();
    }
}