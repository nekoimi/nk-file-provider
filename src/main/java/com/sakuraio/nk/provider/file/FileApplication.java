package com.sakuraio.nk.provider.file;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>FileApplication</p>
 *
 * @author nekoimi 2022/10/04
 */
@Slf4j
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.sakuraio.nk")
@ServletComponentScan(basePackages = "com.sakuraio.nk")
@SpringBootApplication
public class FileApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FileApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}
