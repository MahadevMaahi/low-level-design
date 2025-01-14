package DesignPatterns.CompositePattern.FileSystemDesign.FileSystem;

import java.util.List;

public class Directory implements FileSystem {
    
    private String directoryName;
    private List<FileSystem> fileSystemList;

    public Directory(String directory, List<FileSystem> list) {
        this.directoryName = directory;
        this.fileSystemList = list;
    }

    @Override
    public void ls() {
        System.out.println("Directory Name is: " + directoryName);
        for(FileSystem fileSystem: fileSystemList) {
            fileSystem.ls();
        }
    }
}
