package com.yh.platform.usercenter.gencode;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于生产MBG的代码
 * Created by macro on 2018/4/26.
 */
public class Generator {
    public static void main(String[] args) throws Exception {

        AutoGenerator mpg = new AutoGenerator();
        // =============================全局配置===============================
        mpg.setGlobalConfig(new GlobalConfig()
                // 覆盖输出到xxx目录
                .setFileOverride(true).setOutputDir(System.getProperty("user.dir") + "//yh-platform-usercenter-dao//src//main//java//")
//                .setFileOverride(true).setOutputDir("D://wly")
                // 主键生成策略 生成BaseResultMap
                .setIdType(IdType.AUTO).setBaseResultMap(true)
                // 指定作者
                .setAuthor("raysonxin")
                // 设置Controller、Service、ServiceImpl、Dao、Mapper文件名称，%s是依据表名转换来的
                //.setControllerName("%sController").setServiceName("MP%sService").setServiceImplName("%sServiceImpl")
                .setMapperName("%sDao").setXmlName("%sMapper"));
        // ================================数据源配置============================
        mpg.setDataSource(new DataSourceConfig()
                // 用户名、密码、驱动、url
                .setUsername("rayson").setPassword("761217xin")
                .setDbType(DbType.MYSQL).setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/usercenter?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false")
        );
        // ===============================包名配置：父包.模块.controller===============================
        mpg.setPackageInfo(new PackageConfig()
                // 父包名 模块名
                .setParent("com.yh.platform").setModuleName("usercenter")
                // 分层包名
                .setController("controller").setService("service").setServiceImpl("service.impl").setEntity("model").setMapper("mapper"));
        // =====================================策略配置==================================
        mpg.setStrategy(new StrategyConfig()
                // 命名策略：实体的类名和属性名按下划线转驼峰 user_info -> userInfo
                .setNaming(NamingStrategy.underline_to_camel)
                .setEntityLombokModel(true)

                // controller生成@RestCcontroller
                .setRestControllerStyle(true));
        // 执行生成
        mpg.execute();

    }
}

