package se.lexicon.g34.bl.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationUtil {
    public static <T> void serializeList(List<T> source, String filePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
            out.writeObject(source);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static <T> T deserialize(String fileName) {
        try (
                ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        ) {
            return (T) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}