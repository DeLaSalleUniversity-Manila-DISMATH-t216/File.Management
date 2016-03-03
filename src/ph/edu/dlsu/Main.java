package ph.edu.dlsu;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File f1 = new File("Original.txt");
            File f2 = new File("Copy.txt");

            InputStream in = new FileInputStream(f1);
            OutputStream out = new FileOutputStream(f2);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();

            System.out.println("File copied!");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

