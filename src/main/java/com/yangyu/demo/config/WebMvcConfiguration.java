package com.yangyu.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * WebMVC 配置.
 * <p>
 * 添加路径和页面的映射关系
 *
 * @author
 * @version
 * @since
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置静态资源路径
        registry.addResourceHandler("/**")
                .addResourceLocations("resources/", "static/", "public/",
                        "META-INF/resources/")
                .addResourceLocations("classpath:resources/", "classpath:static/",
                        "classpath:public/", "classpath:META-INF/resources/");

    }
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/love").setViewName( "loveOne" );
        registry.addViewController("/Two").setViewName( "loveTwo" );
        registry.addViewController("/page").setViewName( "page" );
        registry.addViewController("/sakura").setViewName( "sakura" );

        super.addViewControllers(registry);
    }

}
