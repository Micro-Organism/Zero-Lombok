package com.zero.lombok;

import com.zero.lombok.common.model.Demo4;
import lombok.Cleanup;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@SpringBootTest
class ZeroLombokBootApplicationTests {

    @Test
    void contextLoads() {}

    @Test
    void test() {
        Demo4 demo = Demo4.builder().name("zss").age(20).build();
        System.out.println(demo);
    }

    @Test
    @SneakyThrows(Exception.class)
    void test2() {
        @Cleanup InputStream in = new FileInputStream("args[0]");
        @Cleanup OutputStream out = new FileOutputStream("args[1]");
        byte[] b = new byte[1024];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }

}
