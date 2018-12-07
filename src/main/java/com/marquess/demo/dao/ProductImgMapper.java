package com.marquess.demo.dao;

import com.marquess.demo.model.ProductImg;
import com.marquess.demo.model.ProductImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    long countByExample(ProductImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int deleteByExample(ProductImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int insert(ProductImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int insertSelective(ProductImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    List<ProductImg> selectByExample(ProductImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    ProductImg selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByExample(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByPrimaryKeySelective(ProductImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByPrimaryKey(ProductImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<ProductImg> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<ProductImg> list, @Param("selective") ProductImg.Column ... selective);
}