package com.dao;

import com.entity.JiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshiVO;
import com.entity.view.JiaoshiView;


/**
 * 教师
 * 
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
public interface JiaoshiDao extends BaseMapper<JiaoshiEntity> {
	
	List<JiaoshiVO> selectListVO(@Param("ew") Wrapper<JiaoshiEntity> wrapper);
	
	JiaoshiVO selectVO(@Param("ew") Wrapper<JiaoshiEntity> wrapper);
	
	List<JiaoshiView> selectListView(@Param("ew") Wrapper<JiaoshiEntity> wrapper);

	List<JiaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshiEntity> wrapper);
	
	JiaoshiView selectView(@Param("ew") Wrapper<JiaoshiEntity> wrapper);
	
}
