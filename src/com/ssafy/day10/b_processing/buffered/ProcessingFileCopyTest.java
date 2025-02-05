package com.ssafy.day10.b_processing.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ProcessingFileCopyTest {
    public static void main(String[] args) {
        File src = new File("c:/Windows/explorer.exe");
        File target = new File("c:/Temp/copied_explorer.exe");
        
        // 노드 스트림
        try (FileInputStream fi = new FileInputStream(src); FileOutputStream fo = new FileOutputStream(target);) {
            copy("노드", fi, fo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 버퍼 스트림
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(src));
                BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(target));) {
            copy("보조", bi, bo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copy(String type, InputStream input, OutputStream output) throws IOException {
        long start = System.nanoTime();
        byte[] cart = new byte[1024];
        int read = -1;
        while ((read = input.read(cart)) > 0) {
            output.write(cart, 0, read);
        }
        long end = System.nanoTime();
        System.out.printf("타입: %s, 소요 시간: %10dns%n", type, end - start);

    }
}

//타입: 노드, 소요 시간:   11403000ns
//타입: 보조, 소요 시간:    3103000ns

