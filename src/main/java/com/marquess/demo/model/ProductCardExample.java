package com.marquess.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public ProductCardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andCardContentsIsNull() {
            addCriterion("card_contents is null");
            return (Criteria) this;
        }

        public Criteria andCardContentsIsNotNull() {
            addCriterion("card_contents is not null");
            return (Criteria) this;
        }

        public Criteria andCardContentsEqualTo(String value) {
            addCriterion("card_contents =", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsNotEqualTo(String value) {
            addCriterion("card_contents <>", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsGreaterThan(String value) {
            addCriterion("card_contents >", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsGreaterThanOrEqualTo(String value) {
            addCriterion("card_contents >=", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsLessThan(String value) {
            addCriterion("card_contents <", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsLessThanOrEqualTo(String value) {
            addCriterion("card_contents <=", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsLike(String value) {
            addCriterion("card_contents like", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsNotLike(String value) {
            addCriterion("card_contents not like", value, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsIn(List<String> values) {
            addCriterion("card_contents in", values, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsNotIn(List<String> values) {
            addCriterion("card_contents not in", values, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsBetween(String value1, String value2) {
            addCriterion("card_contents between", value1, value2, "cardContents");
            return (Criteria) this;
        }

        public Criteria andCardContentsNotBetween(String value1, String value2) {
            addCriterion("card_contents not between", value1, value2, "cardContents");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeIsNull() {
            addCriterion("active_start_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeIsNotNull() {
            addCriterion("active_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeEqualTo(Date value) {
            addCriterion("active_start_time =", value, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeNotEqualTo(Date value) {
            addCriterion("active_start_time <>", value, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeGreaterThan(Date value) {
            addCriterion("active_start_time >", value, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("active_start_time >=", value, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeLessThan(Date value) {
            addCriterion("active_start_time <", value, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("active_start_time <=", value, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeIn(List<Date> values) {
            addCriterion("active_start_time in", values, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeNotIn(List<Date> values) {
            addCriterion("active_start_time not in", values, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeBetween(Date value1, Date value2) {
            addCriterion("active_start_time between", value1, value2, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("active_start_time not between", value1, value2, "activeStartTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeIsNull() {
            addCriterion("active_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeIsNotNull() {
            addCriterion("active_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeEqualTo(Date value) {
            addCriterion("active_end_time =", value, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeNotEqualTo(Date value) {
            addCriterion("active_end_time <>", value, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeGreaterThan(Date value) {
            addCriterion("active_end_time >", value, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("active_end_time >=", value, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeLessThan(Date value) {
            addCriterion("active_end_time <", value, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("active_end_time <=", value, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeIn(List<Date> values) {
            addCriterion("active_end_time in", values, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeNotIn(List<Date> values) {
            addCriterion("active_end_time not in", values, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeBetween(Date value1, Date value2) {
            addCriterion("active_end_time between", value1, value2, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andActiveEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("active_end_time not between", value1, value2, "activeEndTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_card
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 06 16:21:59 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_card
     *
     * @mbg.generated Thu Dec 06 16:21:59 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}