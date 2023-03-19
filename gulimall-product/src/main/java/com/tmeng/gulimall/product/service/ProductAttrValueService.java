package com.tmeng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tmeng.common.utils.PageUtils;
import com.tmeng.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author tim
 * @email 17721529285@gmail.com
 * @date 2023-03-19 23:10:00
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

