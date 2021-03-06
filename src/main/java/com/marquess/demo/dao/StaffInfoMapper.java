package com.marquess.demo.dao;

import com.marquess.demo.model.StaffInfo;
import com.marquess.demo.model.StaffInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    long countByExample(StaffInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int deleteByExample(StaffInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int insert(StaffInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int insertSelective(StaffInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    List<StaffInfo> selectByExample(StaffInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    StaffInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") StaffInfo record, @Param("example") StaffInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByExample(@Param("record") StaffInfo record, @Param("example") StaffInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByPrimaryKeySelective(StaffInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByPrimaryKey(StaffInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<StaffInfo> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_info
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<StaffInfo> list, @Param("selective") StaffInfo.Column ... selective);
}