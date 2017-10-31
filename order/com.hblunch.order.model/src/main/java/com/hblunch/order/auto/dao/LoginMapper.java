package com.hblunch.order.auto.dao;

import com.hblunch.order.auto.model.Login;

public interface LoginMapper {
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
    int insert(Login record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Login record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Login selectByPrimaryKey(String id);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Login record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Login record);
}