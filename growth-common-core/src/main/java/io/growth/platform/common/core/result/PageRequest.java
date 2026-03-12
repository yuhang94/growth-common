package io.growth.platform.common.core.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageRequest implements Serializable {

    private int pageNum = 1;

    private int pageSize = 20;
}
