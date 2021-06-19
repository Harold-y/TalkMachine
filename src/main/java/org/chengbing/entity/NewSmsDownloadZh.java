package org.chengbing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author HaroldCI
 * @since 2021-06-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="NewSmsDownloadZh对象", description="")
public class NewSmsDownloadZh implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sender;

    private String receiver;

    private String sendTime;

    private String collectTime;

    @ApiModelProperty(value = "SMS Export, SMS Upload, Web-based Transcription")
    private String collectMethod;

    private String content;

    @ApiModelProperty(value = "Native speaker")
    private String nativeD;

    @ApiModelProperty(value = "Where is the donator from")
    private String country;

    private String age;

    private String inputMethod;

    @ApiModelProperty(value = "Years of using sms")
    private String experience;

    @ApiModelProperty(value = "# of SMS sent daily")
    private String frequency;

    private String phoneModel;

    private String collector;

    private String gender;

    private String smartphone;

    private String lang;

    private String city;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


}
