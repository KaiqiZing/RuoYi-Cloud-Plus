package com.ruoyi.system.api.domain;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.ruoyi.common.excel.annotation.ExcelDictFormat;
import com.ruoyi.common.excel.convert.ExcelDictConvert;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统访问记录表 sys_logininfor
 *
 * @author Lion Li
 */

@Data
@Accessors(chain = true)
@ExcelIgnoreUnannotated
@ApiModel("系统访问记录业务对象")
public class SysLogininfor implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ApiModelProperty(value = "访问ID")
    @ExcelProperty(value = "序号")
    private Long infoId;

    /**
     * 用户账号
     */
    @ApiModelProperty(value = "用户账号")
    @ExcelProperty(value = "用户账号")
    private String userName;

    /**
     * 状态 0成功 1失败
     */
    @ApiModelProperty(value = "状态 0成功 1失败")
    @ExcelProperty(value = "状态", converter = ExcelDictConvert.class)
    @ExcelDictFormat(dictType = "sys_common_status")
    private String status;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    @ExcelProperty(value = "地址")
    private String ipaddr;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    @ExcelProperty(value = "描述")
    private String msg;

    /**
     * 访问时间
     */
    @ApiModelProperty(value = "访问时间")
    @ExcelProperty(value = "访问时间")
    private Date accessTime;

    /**
     * 请求参数
     */
    @ApiModelProperty(value = "请求参数")
    private Map<String, Object> params = new HashMap<>();

}
