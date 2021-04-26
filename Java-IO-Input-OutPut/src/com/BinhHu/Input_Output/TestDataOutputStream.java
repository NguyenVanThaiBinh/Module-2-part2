package com.BinhHu;

import javax.imageio.IIOException;
import java.io.*;

public class TestDataOutputStream {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        try{
        File file;
        FileOutputStream fout = new FileOutputStream(args[0]);
        DataOutputStream dout = new DataOutputStream(fout);
            for (int i = 0; i < a.length; i++) {
                dout.writeInt(a[i]);
                dout.close();
            }
        }
        catch (IIOException | FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
