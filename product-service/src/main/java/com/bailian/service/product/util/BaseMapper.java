package com.bailian.service.product.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author TLB17
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
