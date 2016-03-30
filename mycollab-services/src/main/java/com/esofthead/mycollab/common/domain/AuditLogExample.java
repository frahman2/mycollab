/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ucd")
public class AuditLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public AuditLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
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
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    @SuppressWarnings("ucd")
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

        public Criteria andObjectClassIsNull() {
            addCriterion("object_class is null");
            return (Criteria) this;
        }

        public Criteria andObjectClassIsNotNull() {
            addCriterion("object_class is not null");
            return (Criteria) this;
        }

        public Criteria andObjectClassEqualTo(String value) {
            addCriterion("object_class =", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotEqualTo(String value) {
            addCriterion("object_class <>", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassGreaterThan(String value) {
            addCriterion("object_class >", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassGreaterThanOrEqualTo(String value) {
            addCriterion("object_class >=", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassLessThan(String value) {
            addCriterion("object_class <", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassLessThanOrEqualTo(String value) {
            addCriterion("object_class <=", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassLike(String value) {
            addCriterion("object_class like", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotLike(String value) {
            addCriterion("object_class not like", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassIn(List<String> values) {
            addCriterion("object_class in", values, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotIn(List<String> values) {
            addCriterion("object_class not in", values, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassBetween(String value1, String value2) {
            addCriterion("object_class between", value1, value2, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotBetween(String value1, String value2) {
            addCriterion("object_class not between", value1, value2, "objectClass");
            return (Criteria) this;
        }

        public Criteria andPosteddateIsNull() {
            addCriterion("posteddate is null");
            return (Criteria) this;
        }

        public Criteria andPosteddateIsNotNull() {
            addCriterion("posteddate is not null");
            return (Criteria) this;
        }

        public Criteria andPosteddateEqualTo(Date value) {
            addCriterion("posteddate =", value, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateNotEqualTo(Date value) {
            addCriterion("posteddate <>", value, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateGreaterThan(Date value) {
            addCriterion("posteddate >", value, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateGreaterThanOrEqualTo(Date value) {
            addCriterion("posteddate >=", value, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateLessThan(Date value) {
            addCriterion("posteddate <", value, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateLessThanOrEqualTo(Date value) {
            addCriterion("posteddate <=", value, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateIn(List<Date> values) {
            addCriterion("posteddate in", values, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateNotIn(List<Date> values) {
            addCriterion("posteddate not in", values, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateBetween(Date value1, Date value2) {
            addCriterion("posteddate between", value1, value2, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteddateNotBetween(Date value1, Date value2) {
            addCriterion("posteddate not between", value1, value2, "posteddate");
            return (Criteria) this;
        }

        public Criteria andPosteduserIsNull() {
            addCriterion("posteduser is null");
            return (Criteria) this;
        }

        public Criteria andPosteduserIsNotNull() {
            addCriterion("posteduser is not null");
            return (Criteria) this;
        }

        public Criteria andPosteduserEqualTo(String value) {
            addCriterion("posteduser =", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserNotEqualTo(String value) {
            addCriterion("posteduser <>", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserGreaterThan(String value) {
            addCriterion("posteduser >", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserGreaterThanOrEqualTo(String value) {
            addCriterion("posteduser >=", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserLessThan(String value) {
            addCriterion("posteduser <", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserLessThanOrEqualTo(String value) {
            addCriterion("posteduser <=", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserLike(String value) {
            addCriterion("posteduser like", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserNotLike(String value) {
            addCriterion("posteduser not like", value, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserIn(List<String> values) {
            addCriterion("posteduser in", values, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserNotIn(List<String> values) {
            addCriterion("posteduser not in", values, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserBetween(String value1, String value2) {
            addCriterion("posteduser between", value1, value2, "posteduser");
            return (Criteria) this;
        }

        public Criteria andPosteduserNotBetween(String value1, String value2) {
            addCriterion("posteduser not between", value1, value2, "posteduser");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNull() {
            addCriterion("sAccountId is null");
            return (Criteria) this;
        }

        public Criteria andSaccountidIsNotNull() {
            addCriterion("sAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andSaccountidEqualTo(Integer value) {
            addCriterion("sAccountId =", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotEqualTo(Integer value) {
            addCriterion("sAccountId <>", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThan(Integer value) {
            addCriterion("sAccountId >", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sAccountId >=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThan(Integer value) {
            addCriterion("sAccountId <", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidLessThanOrEqualTo(Integer value) {
            addCriterion("sAccountId <=", value, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidIn(List<Integer> values) {
            addCriterion("sAccountId in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotIn(List<Integer> values) {
            addCriterion("sAccountId not in", values, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidBetween(Integer value1, Integer value2) {
            addCriterion("sAccountId between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andSaccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("sAccountId not between", value1, value2, "saccountid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("module like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("module not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andActivitylogidIsNull() {
            addCriterion("activityLogId is null");
            return (Criteria) this;
        }

        public Criteria andActivitylogidIsNotNull() {
            addCriterion("activityLogId is not null");
            return (Criteria) this;
        }

        public Criteria andActivitylogidEqualTo(Integer value) {
            addCriterion("activityLogId =", value, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidNotEqualTo(Integer value) {
            addCriterion("activityLogId <>", value, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidGreaterThan(Integer value) {
            addCriterion("activityLogId >", value, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityLogId >=", value, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidLessThan(Integer value) {
            addCriterion("activityLogId <", value, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidLessThanOrEqualTo(Integer value) {
            addCriterion("activityLogId <=", value, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidIn(List<Integer> values) {
            addCriterion("activityLogId in", values, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidNotIn(List<Integer> values) {
            addCriterion("activityLogId not in", values, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidBetween(Integer value1, Integer value2) {
            addCriterion("activityLogId between", value1, value2, "activitylogid");
            return (Criteria) this;
        }

        public Criteria andActivitylogidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityLogId not between", value1, value2, "activitylogid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_audit_log
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 22 23:27:22 ICT 2016
     */
    @SuppressWarnings("ucd")
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_audit_log
     *
     * @mbggenerated Tue Mar 22 23:27:22 ICT 2016
     */
    @SuppressWarnings("ucd")
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