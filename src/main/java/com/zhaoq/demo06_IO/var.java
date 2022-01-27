package com.zhaoq.demo06_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class var {

    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("Demo06.txt");
//            writer = new FileWriter("Demo06.txt",true);
            writer.write("今天天气真好！！");
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (writer != null){
                try{
                    writer.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
