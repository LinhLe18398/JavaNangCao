package File_In_OutputStream;

import java.io.*;

public class Practise2_Again {
    public boolean writeData(String data, String fileName) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(data.getBytes());
            bos.close();
            fos.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public String readData(String fileName) throws IOException {
        String result = "";
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        //c1
        byte[] dataFromFile = bis.readAllBytes();
        result = new String(dataFromFile);
        bis.close();
        fis.close();

        return result;
    }

}
