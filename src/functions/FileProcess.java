package functions;

import entities.DanhBa;

import java.io.*;
import java.util.ArrayList;

public class FileProcess {
    public void writeFile(ArrayList<DanhBa> db, String path)  {
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(db);

            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<DanhBa> readFile(String path)  {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (ArrayList<DanhBa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
