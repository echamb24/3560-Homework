import java.util.ArrayList;

public class Folder {

    private String folderName;
    private ArrayList<File> files = new ArrayList<>();
    private ArrayList<Folder> subFolders = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }
    
    public String getFolderName() {
        return this.folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public ArrayList<File> getFiles() {
        return this.files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<Folder> getSubFolders() {
        return this.subFolders;
    }

    public void setSubFolders(ArrayList<Folder> subFolders) {
        this.subFolders = subFolders;
    }
    
    public void addFile(File file) {
        this.files.add(file);
    }

    public void addSubFolder(Folder folder) {
        this.subFolders.add(folder);
    }

    public void print() {
        print(""); 
    }

    private void print(String indent) {
        System.out.println(indent + this.folderName);
    
        for (Folder subFolder : subFolders) {
            subFolder.print(indent + "  "); 
        }
        
        for (File file : files) {
            System.out.print(indent + "  "); 
            file.print();
        }
    }
}