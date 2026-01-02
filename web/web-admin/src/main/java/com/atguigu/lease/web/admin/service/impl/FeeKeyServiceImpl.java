package com.atguigu.lease.web.admin.service.impl;

import com.atguigu.lease.model.entity.FeeKey;
import com.atguigu.lease.web.admin.mapper.FeeKeyMapper;
import com.atguigu.lease.web.admin.service.FeeKeyService;
import com.atguigu.lease.web.admin.vo.fee.FeeKeyVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
@RequiredArgsConstructor
public class FeeKeyServiceImpl extends ServiceImpl<FeeKeyMapper, FeeKey>
    implements FeeKeyService{

    private final FeeKeyMapper feeKeyMapper;

    /**
     * 查询全部杂费名称和杂费值列表
     * @return
     */
    @Override
    public List<FeeKeyVo> listKeyValue() {
        return feeKeyMapper.listKeyValue();
    }
}




