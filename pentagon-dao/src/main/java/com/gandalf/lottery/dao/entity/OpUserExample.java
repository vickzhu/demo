package com.gandalf.lottery.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gandalf.framework.ibatis.BaseQuery;
import com.gandalf.lottery.common.constant.EnableEnum;

public class OpUserExample extends BaseQuery {

    /**
     * 
     */
    private static final long serialVersionUID = -4463919586449816502L;

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    protected String          orderByClause;

    /**
     * This field was generated by Abator for iBATIS. This field corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    protected List            oredCriteria;

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    public OpUserExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    protected OpUserExample(OpUserExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
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
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_user
     * 
     * @abatorgenerated
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS. This class corresponds to the database table op_user
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List values) {
            addCriterion("user_id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List values) {
            addCriterion("user_id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return this;
        }

        public Criteria andUsernameIn(List values) {
            addCriterion("username in", values, "username");
            return this;
        }

        public Criteria andUsernameNotIn(List values) {
            addCriterion("username not in", values, "username");
            return this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return this;
        }

        public Criteria andPasswordIn(List values) {
            addCriterion("password in", values, "password");
            return this;
        }

        public Criteria andPasswordNotIn(List values) {
            addCriterion("password not in", values, "password");
            return this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return this;
        }

        public Criteria andRealNameIn(List values) {
            addCriterion("real_name in", values, "realName");
            return this;
        }

        public Criteria andRealNameNotIn(List values) {
            addCriterion("real_name not in", values, "realName");
            return this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return this;
        }

        public Criteria andTelephoneIn(List values) {
            addCriterion("telephone in", values, "telephone");
            return this;
        }

        public Criteria andTelephoneNotIn(List values) {
            addCriterion("telephone not in", values, "telephone");
            return this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return this;
        }

        public Criteria andEmailIn(List values) {
            addCriterion("email in", values, "email");
            return this;
        }

        public Criteria andEmailNotIn(List values) {
            addCriterion("email not in", values, "email");
            return this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("department_id =", value, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("department_id <>", value, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("department_id >", value, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("department_id >=", value, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("department_id <", value, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("department_id <=", value, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdIn(List values) {
            addCriterion("department_id in", values, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdNotIn(List values) {
            addCriterion("department_id not in", values, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("role_id =", value, "roleId");
            return this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "roleId");
            return this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("role_id >", value, "roleId");
            return this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "roleId");
            return this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("role_id <", value, "roleId");
            return this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "roleId");
            return this;
        }

        public Criteria andRoleIdIn(List values) {
            addCriterion("role_id in", values, "roleId");
            return this;
        }

        public Criteria andRoleIdNotIn(List values) {
            addCriterion("role_id not in", values, "roleId");
            return this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return this;
        }

        public Criteria andEnableEqualTo(EnableEnum value) {
            addCriterion("enable =", value, "enable");
            return this;
        }

        public Criteria andEnableNotEqualTo(EnableEnum value) {
            addCriterion("enable <>", value, "enable");
            return this;
        }

        public Criteria andEnableGreaterThan(EnableEnum value) {
            addCriterion("enable >", value, "enable");
            return this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(EnableEnum value) {
            addCriterion("enable >=", value, "enable");
            return this;
        }

        public Criteria andEnableLessThan(EnableEnum value) {
            addCriterion("enable <", value, "enable");
            return this;
        }

        public Criteria andEnableLessThanOrEqualTo(EnableEnum value) {
            addCriterion("enable <=", value, "enable");
            return this;
        }

        public Criteria andEnableIn(List values) {
            addCriterion("enable in", values, "enable");
            return this;
        }

        public Criteria andEnableNotIn(List values) {
            addCriterion("enable not in", values, "enable");
            return this;
        }

        public Criteria andEnableBetween(EnableEnum value1, EnableEnum value2) {
            addCriterion("enable between", value1, value2, "enable");
            return this;
        }

        public Criteria andEnableNotBetween(EnableEnum value1, EnableEnum value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeIn(List values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeNotIn(List values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpIn(List values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpNotIn(List values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateIn(List values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateNotIn(List values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return this;
        }

        public Criteria andGmtUpdateIsNull() {
            addCriterion("gmt_update is null");
            return this;
        }

        public Criteria andGmtUpdateIsNotNull() {
            addCriterion("gmt_update is not null");
            return this;
        }

        public Criteria andGmtUpdateEqualTo(Date value) {
            addCriterion("gmt_update =", value, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateNotEqualTo(Date value) {
            addCriterion("gmt_update <>", value, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateGreaterThan(Date value) {
            addCriterion("gmt_update >", value, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_update >=", value, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateLessThan(Date value) {
            addCriterion("gmt_update <", value, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_update <=", value, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateIn(List values) {
            addCriterion("gmt_update in", values, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateNotIn(List values) {
            addCriterion("gmt_update not in", values, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateBetween(Date value1, Date value2) {
            addCriterion("gmt_update between", value1, value2, "gmtUpdate");
            return this;
        }

        public Criteria andGmtUpdateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_update not between", value1, value2, "gmtUpdate");
            return this;
        }
    }
}
