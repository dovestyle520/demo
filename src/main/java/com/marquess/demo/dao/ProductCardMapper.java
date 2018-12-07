package com.marquess.demo.dao;

import com.marquess.demo.model.ProductCard;
import com.marquess.demo.model.ProductCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    long countByExample(ProductCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int deleteByExample(ProductCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int insert(ProductCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int insertSelective(ProductCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    List<ProductCard> selectByExample(ProductCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    ProductCard selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductCard record, @Param("example") ProductCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByExample(@Param("record") ProductCard record, @Param("example") ProductCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByPrimaryKeySelective(ProductCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    int updateByPrimaryKey(ProductCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<ProductCard> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<ProductCard> list, @Param("selective") ProductCard.Column ... selective);
}