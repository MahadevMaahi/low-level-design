package DesignPatterns.CompositePattern.FileSystemDesign;

import java.util.ArrayList;
import java.util.List;

import DesignPatterns.CompositePattern.FileSystemDesign.FileSystem.Directory;
import DesignPatterns.CompositePattern.FileSystemDesign.FileSystem.File;
import DesignPatterns.CompositePattern.FileSystemDesign.FileSystem.FileSystem;

public class Engine {
    public static void main(String[] args) {
        List<FileSystem> fileList = new ArrayList<>();
        FileSystem file = new File("Primary File");
        fileList.add(file);
        FileSystem directory = new Directory("Primary Directory", fileList);

        directory.ls();
    }
}
