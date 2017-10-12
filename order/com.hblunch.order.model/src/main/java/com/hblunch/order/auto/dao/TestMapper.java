package com.hblunch.order.auto.dao;

import com.hblunch.order.auto.model.Test;
import com.hblunch.order.auto.model.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    /**
     * 根据条件计数
     *
     * @param example
     */
    int countByExample(TestExample example);

    /**
     *
     * @param example
     */
    int deleteByExample(TestExample example);

    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Test record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Test record);

    /**
     * 根据条件查询列表
     *
     * @param example
     */
    List<Test> selectByExample(TestExample example);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Test selectByPrimaryKey(String id);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * 选择性更新数据库记录
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Test record);
}