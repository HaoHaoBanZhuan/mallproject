package com.tmeng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tmeng.common.utils.PageUtils;
import com.tmeng.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author tim
 * @email 17721529285@gmail.com
 * @date 2023-03-19 23:10:00
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

