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
@ApiModel(value="OnlineShopping10Cats对象", description="")
public class OnlineShopping10Cats implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cat;

    private String label;

    private String review;


}
