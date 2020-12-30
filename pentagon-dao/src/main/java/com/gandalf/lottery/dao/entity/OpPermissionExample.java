package com.gandalf.lottery.dao.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gandalf.framework.ibatis.BaseQuery;

public class OpPermissionExample extends BaseQuery {

    private static final long serialVersionUID = -7766669508852052613L;

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    protected String          orderByClause;

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    protected List            oredCriteria;

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public OpPermissionExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    protected OpPermissionExample(OpPermissionExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
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
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS. This class corresponds to the database table op_permission
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return this;
        }

        public Criteria andPermissionIdEqualTo(Long value) {
            addCriterion("permission_id =", value, "permissionId");
            return this;
        }

        public Criteria andPermissionIdNotEqualTo(Long value) {
            addCriterion("permission_id <>", value, "permissionId");
            return this;
        }

        public Criteria andPermissionIdGreaterThan(Long value) {
            addCriterion("permission_id >", value, "permissionId");
            return this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("permission_id >=", value, "permissionId");
            return this;
        }

        public Criteria andPermissionIdLessThan(Long value) {
            addCriterion("permission_id <", value, "permissionId");
            return this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Long value) {
            addCriterion("permission_id <=", value, "permissionId");
            return this;
        }

        public Criteria andPermissionIdIn(List values) {
            addCriterion("permission_id in", values, "permissionId");
            return this;
        }

        public Criteria andPermissionIdNotIn(List values) {
            addCriterion("permission_id not in", values, "permissionId");
            return this;
        }

        public Criteria andPermissionIdBetween(Long value1, Long value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return this;
        }

        public Criteria andPermissionIdNotBetween(Long value1, Long value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return this;
        }

        public Criteria andPermissionGroupIdIsNull() {
            addCriterion("permission_group_id is null");
            return this;
        }

        public Criteria andPermissionGroupIdIsNotNull() {
            addCriterion("permission_group_id is not null");
            return this;
        }

        public Criteria andPermissionGroupIdEqualTo(Long value) {
            addCriterion("permission_group_id =", value, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdNotEqualTo(Long value) {
            addCriterion("permission_group_id <>", value, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdGreaterThan(Long value) {
            addCriterion("permission_group_id >", value, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("permission_group_id >=", value, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdLessThan(Long value) {
            addCriterion("permission_group_id <", value, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("permission_group_id <=", value, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdIn(List values) {
            addCriterion("permission_group_id in", values, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdNotIn(List values) {
            addCriterion("permission_group_id not in", values, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdBetween(Long value1, Long value2) {
            addCriterion("permission_group_id between", value1, value2, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("permission_group_id not between", value1, value2, "permissionGroupId");
            return this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("permission_name is null");
            return this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("permission_name is not null");
            return this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("permission_name =", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("permission_name <>", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("permission_name >", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("permission_name >=", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("permission_name <", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("permission_name <=", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("permission_name like", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("permission_name not like", value, "permissionName");
            return this;
        }

        public Criteria andPermissionNameIn(List values) {
            addCriterion("permission_name in", values, "permissionName");
            return this;
        }

        public Criteria andPermissionNameNotIn(List values) {
            addCriterion("permission_name not in", values, "permissionName");
            return this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("permission_name between", value1, value2, "permissionName");
            return this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("permission_name not between", value1, value2, "permissionName");
            return this;
        }

        public Criteria andMenuResourceIdIsNull() {
            addCriterion("menu_resource_id is null");
            return this;
        }

        public Criteria andMenuResourceIdIsNotNull() {
            addCriterion("menu_resource_id is not null");
            return this;
        }

        public Criteria andMenuResourceIdEqualTo(Long value) {
            addCriterion("menu_resource_id =", value, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdNotEqualTo(Long value) {
            addCriterion("menu_resource_id <>", value, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdGreaterThan(Long value) {
            addCriterion("menu_resource_id >", value, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_resource_id >=", value, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdLessThan(Long value) {
            addCriterion("menu_resource_id <", value, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("menu_resource_id <=", value, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdIn(List values) {
            addCriterion("menu_resource_id in", values, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdNotIn(List values) {
            addCriterion("menu_resource_id not in", values, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdBetween(Long value1, Long value2) {
            addCriterion("menu_resource_id between", value1, value2, "menuResourceId");
            return this;
        }

        public Criteria andMenuResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("menu_resource_id not between", value1, value2, "menuResourceId");
            return this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return this;
        }

        public Criteria andOrderNumIn(List values) {
            addCriterion("order_num in", values, "orderNum");
            return this;
        }

        public Criteria andOrderNumNotIn(List values) {
            addCriterion("order_num not in", values, "orderNum");
            return this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return this;
        }
    }
}