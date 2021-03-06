package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.SystemConfig;
import com.jsh.erp.datasource.entities.SystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int countByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int deleteByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int insert(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int insertSelective(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    List<SystemConfig> selectByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    SystemConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemConfig record);
}