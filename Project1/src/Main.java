import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        files allFiles = new files();
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("                            Project 1                              ");
        System.out.println("                      Welcome to LockedMe.com                      ");
        System.out.println("                   By The Developer: Dalal AlMaghrebi              ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                       Main Menu                       ");
        System.out.println(" ");
        System.out.println("            Please choose one of the bellow options");
        System.out.println("                1. Show the files");
        System.out.println("                2. Show the file options menu");
        System.out.println("                3. Exit");

        boolean flag = true;
        int option = input.nextInt();
        while (flag = true){
            switch(option) {
                case 1:
                    System.out.println(" ");
                    System.out.println("--------------------- All LockedMe.com files ---------------------");
                    allFiles.printSortedFiles();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("             File Menu             ");
                    System.out.println(" ");
                    System.out.println("              Please choose one of the bellow options");
                    System.out.println("                 1. Add file ");
                    System.out.println("                 2. Delete file ");
                    System.out.println("                 3. Search file");
                    System.out.println("                 4. Back to Main Menu");
                    System.out.println(" ");
                    int option1 = input.nextInt();
                    switch (option1){
                        case 1:
                            System.out.println(" ");
                            System.out.println("             Add File             ");
                            System.out.println(" ");
                            System.out.println("Please Enter The File Name to Create:");
                            String fileAdd = input.next();
                            allFiles.addFile(fileAdd);
                            System.out.println(" ");
                            break;
                        case 2:
                            System.out.println(" ");
                            System.out.println("             Delete File             ");
                            System.out.println("Please Enter The File Name to Delete:");
                            String fileDelete = input.next();
                            allFiles.deleteFile(fileDelete);
                            System.out.println(" ");
                            break;
                        case 3:
                            System.out.println(" ");
                            System.out.println("             Search File             ");
                            System.out.println("Please Enter The File Name to Search:");
                            String fileSearch = input.next();
                            allFiles.searchFile(fileSearch);
                            System.out.println(" ");
                            break;
                        case 4:
                            Main.main(null);
                            break;
                        default:
                            System.out.println("Please Try Again..Invalid Menu Choice!!");
                            break;

                    }
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("                           The Program Ended                     ");
                    System.out.println("              Thank you for using LockedMe.com Program           ");
                    System.out.println("                   By The Developer: Dalal AlMaghrebi            ");
                    System.out.println(" ");
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Try Again..Invalid Menu Choice!!");
                    break;
            }
            System.out.println(" ");
            System.out.println("                       Main Menu                       ");
            System.out.println(" ");
            System.out.println("            Please choose one of the bellow options");
            System.out.println("                1. Show Files");
            System.out.println("                2. Show File Options Menu");
            System.out.println("                3. Exit");

            option = input.nextInt();
        }

    }
}

class files {

    public void addFile(String fileName){
        try {
           // File file = new File("/Users/lulwahaldyouly/Desktop/project/ProjectPhase1/LockersPvt/allFiles/"+fileName+".txt");
            boolean flag = file.createNewFile();
            if (flag) {
                System.out.println("File "+fileName+" has been created successfully");
            }
            else {
                System.out.println("File already present at the specified location");
            }
        }
        catch(IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }

    public void deleteFile(String fileName){
        try {
           // File f = new File("/Users/lulwahaldyouly/Desktop/project/ProjectPhase1/LockersPvt/allFiles/"+fileName+".txt");
            if (f.delete()){ //returns Boolean value
                System.out.println("File " + f.getName() + " is deleted");
                //getting and printing the file name
            }
            else {
                System.out.println("Delete operation failed");
            }
        }
        catch(Exception e) {
            System.out.println("Catch is running");
            e.printStackTrace();
        }
    }

    public void searchFile(String fileName){
        String fileNameTxt = fileName+".txt";
       // File directory = new File("/Users/lulwahaldyouly/Desktop/project/ProjectPhase1/LockersPvt/allFiles/");
        String[] filelist = directory.list();
        Set<String> sets = new TreeSet<String>();
        int flag = 0;

        if (filelist == null) {
            System.out.println("Empty Directory.");
        } else {
            for (int i = 0; i < filelist.length; i++) {
                String filename = filelist[i];
                if (filename.equalsIgnoreCase(fileNameTxt)) {
                    System.out.println(filename + " File Found");
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("File Not Found");
        }
        Iterator<String> iterate = sets.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }

    public void printSortedFiles(){
       // File directory = new File("/Users/lulwahaldyouly/Desktop/project/ProjectPhase1/LockersPvt/allFiles");
        String[] filelist = directory.list();
        Set<String> sets = new TreeSet<String>();
        int flag = 0;
        if (filelist == null) {
            System.out.println("Empty directory.");
        } else {
            for (int i = 0; i < filelist.length; i++) {
                String filename = filelist[i];
                sets.add(filename);
                flag = 1;
            }
        }
        Iterator<String> iterate = sets.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }

}







