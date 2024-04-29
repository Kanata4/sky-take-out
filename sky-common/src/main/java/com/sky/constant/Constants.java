
package com.sky.constant;

import org.springframework.stereotype.Component;

@Component
public class Constants {
    /**
     * final 修饰常量，不可修改
     * static 修饰静态变量，用类名字.变量名
     * static 属性不能直接用@Value 绑定值
     */

    public static final String FILE_UPLOAD_DIC = "D:\\upload\\";//上传文件的默认url前缀，根据部署设置自行修改

}
