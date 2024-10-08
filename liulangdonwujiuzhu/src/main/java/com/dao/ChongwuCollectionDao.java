package com.dao;

import com.entity.ChongwuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuCollectionView;

/**
 * 寻宠收藏 Dao 接口
 *
 * @author 
 */
public interface ChongwuCollectionDao extends BaseMapper<ChongwuCollectionEntity> {

   List<ChongwuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
