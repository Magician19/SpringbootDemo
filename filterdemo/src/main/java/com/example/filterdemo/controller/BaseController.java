package com.example.filterdemo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author duwen
 * @className BaseController
 * @date 2018/11/22 11:57
 * @description
 */
@RestController
@RequestMapping("/base")
@Slf4j
public class BaseController {
    
    /**
     * @description 测试使用
     * @param str	
     * @return java.lang.String
     * @author duwen 
     * @date 2018/11/22 15:17 
     */
    @GetMapping("/{str}")
    @ApiOperation(value = "测试使用",notes = "demo")
    @ApiImplicitParam(name = "str", value = "测试字符", dataType = "String", required = true,paramType = "path")
    public String base( @PathVariable  String str){
        log.info("进入baseController {}",str);
        return "hello world "+ str;
    }
}
