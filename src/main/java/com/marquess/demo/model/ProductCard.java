package com.marquess.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ProductCard {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.product_id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.card_contents
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private String cardContents;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.status
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.order_id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.active_start_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Date activeStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.active_end_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Date activeEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.create_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_card.update_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.id
     *
     * @return the value of product_card.id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.id
     *
     * @param id the value for product_card.id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.product_id
     *
     * @return the value of product_card.product_id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.product_id
     *
     * @param productId the value for product_card.product_id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.card_contents
     *
     * @return the value of product_card.card_contents
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public String getCardContents() {
        return cardContents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.card_contents
     *
     * @param cardContents the value for product_card.card_contents
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setCardContents(String cardContents) {
        this.cardContents = cardContents == null ? null : cardContents.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.status
     *
     * @return the value of product_card.status
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.status
     *
     * @param status the value for product_card.status
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.order_id
     *
     * @return the value of product_card.order_id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.order_id
     *
     * @param orderId the value for product_card.order_id
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.active_start_time
     *
     * @return the value of product_card.active_start_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Date getActiveStartTime() {
        return activeStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.active_start_time
     *
     * @param activeStartTime the value for product_card.active_start_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setActiveStartTime(Date activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.active_end_time
     *
     * @return the value of product_card.active_end_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Date getActiveEndTime() {
        return activeEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.active_end_time
     *
     * @param activeEndTime the value for product_card.active_end_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setActiveEndTime(Date activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.create_time
     *
     * @return the value of product_card.create_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.create_time
     *
     * @param createTime the value for product_card.create_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_card.update_time
     *
     * @return the value of product_card.update_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_card.update_time
     *
     * @param updateTime the value for product_card.update_time
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table product_card
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        productId("product_id", "productId", "BIGINT", false),
        cardContents("card_contents", "cardContents", "VARCHAR", false),
        status("status", "status", "INTEGER", false),
        orderId("order_id", "orderId", "BIGINT", false),
        activeStartTime("active_start_time", "activeStartTime", "TIMESTAMP", false),
        activeEndTime("active_end_time", "activeEndTime", "TIMESTAMP", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table product_card
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}