package org.chengbing.entity;

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
@ApiModel(value="WeiboSenti100k对象", description="")
public class WeiboSenti100k implements Serializable {

    private static final long serialVersionUID = 1L;

    private String label;

    private String review;


}
