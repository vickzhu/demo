package com.gandalf.lottery.dao.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gandalf.framework.ibatis.BaseQuery;

public class OpResourceExample extends BaseQuery {

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    protected List   oredCriteria;

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public OpResourceExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    protected OpResourceExample(OpResourceExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS. This class corresponds to the database table op_resource
     * 
     * @abatorgenerated
     */
    public static class Criteria {

        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0
                   || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return this;
        }

        public Criteria andResourceIdEqualTo(Long value) {
            addCriterion("resource_id =", value, "resourceId");
            return this;
        }

        public Criteria andResourceIdNotEqualTo(Long value) {
            addCriterion("resource_id <>", value, "resourceId");
            return this;
        }

        public Criteria andResourceIdGreaterThan(Long value) {
            addCriterion("resource_id >", value, "resourceId");
            return this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("resource_id >=", value, "resourceId");
            return this;
        }

        public Criteria andResourceIdLessThan(Long value) {
            addCriterion("resource_id <", value, "resourceId");
            return this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("resource_id <=", value, "resourceId");
            return this;
        }

        public Criteria andResourceIdIn(List values) {
            addCriterion("resource_id in", values, "resourceId");
            return this;
        }

        public Criteria andResourceIdNotIn(List values) {
            addCriterion("resource_id not in", values, "resourceId");
            return this;
        }

        public Criteria andResourceIdBetween(Long value1, Long value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return this;
        }

        public Criteria andResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return this;
        }

        public Criteria andResourceNameIsNull() {
            addCriterion("resource_name is null");
            return this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("resource_name is not null");
            return this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("resource_name =", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("resource_name <>", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("resource_name >", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("resource_name >=", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("resource_name <", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("resource_name <=", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("resource_name like", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("resource_name not like", value, "resourceName");
            return this;
        }

        public Criteria andResourceNameIn(List values) {
            addCriterion("resource_name in", values, "resourceName");
            return this;
        }

        public Criteria andResourceNameNotIn(List values) {
            addCriterion("resource_name not in", values, "resourceName");
            return this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("resource_name between", value1, value2, "resourceName");
            return this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("resource_name not between", value1, value2, "resourceName");
            return this;
        }

        public Criteria andResourceURIIsNull() {
            addCriterion("resource_uri is null");
            return this;
        }

        public Criteria andResourceURIIsNotNull() {
            addCriterion("resource_uri is not null");
            return this;
        }

        public Criteria andResourceURIEqualTo(String value) {
            addCriterion("resource_uri =", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURINotEqualTo(String value) {
            addCriterion("resource_uri <>", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURIGreaterThan(String value) {
            addCriterion("resource_uri >", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURIGreaterThanOrEqualTo(String value) {
            addCriterion("resource_uri >=", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURILessThan(String value) {
            addCriterion("resource_uri <", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURILessThanOrEqualTo(String value) {
            addCriterion("resource_uri <=", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURILike(String value) {
            addCriterion("resource_uri like", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURINotLike(String value) {
            addCriterion("resource_uri not like", value, "resourceURI");
            return this;
        }

        public Criteria andResourceURIIn(List values) {
            addCriterion("resource_uri in", values, "resourceURI");
            return this;
        }

        public Criteria andResourceURINotIn(List values) {
            addCriterion("resource_uri not in", values, "resourceURI");
            return this;
        }

        public Criteria andResourceURIBetween(String value1, String value2) {
            addCriterion("resource_uri between", value1, value2, "resourceURI");
            return this;
        }

        public Criteria andResourceURINotBetween(String value1, String value2) {
            addCriterion("resource_uri not between", value1, value2, "resourceURI");
            return this;
        }
    }
}
