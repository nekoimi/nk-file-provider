package com.sakuraio.nk.provider.file;

import com.sakuraio.nk.core.holder.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.Filter;

/**
 * <p>FileApplication</p>
 *
 * @author nekoimi 2022/10/04
 */
@Slf4j
@EnableWebMvc
@EnableDiscoveryClient
@SpringBootApplication
public class FileApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FileApplication.class).bannerMode(Banner.Mode.OFF).run(args);
        SpringContextHolder.instance().getBeansOfType(FilterRegistrationBean.class).forEach((k, f) -> {
            log.debug("Filter: {} -> {}", k, f);
        });
    }
}
