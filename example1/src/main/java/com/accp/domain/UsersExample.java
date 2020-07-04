package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUlianIsNull() {
            addCriterion("ulian is null");
            return (Criteria) this;
        }

        public Criteria andUlianIsNotNull() {
            addCriterion("ulian is not null");
            return (Criteria) this;
        }

        public Criteria andUlianEqualTo(String value) {
            addCriterion("ulian =", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianNotEqualTo(String value) {
            addCriterion("ulian <>", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianGreaterThan(String value) {
            addCriterion("ulian >", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianGreaterThanOrEqualTo(String value) {
            addCriterion("ulian >=", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianLessThan(String value) {
            addCriterion("ulian <", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianLessThanOrEqualTo(String value) {
            addCriterion("ulian <=", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianLike(String value) {
            addCriterion("ulian like", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianNotLike(String value) {
            addCriterion("ulian not like", value, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianIn(List<String> values) {
            addCriterion("ulian in", values, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianNotIn(List<String> values) {
            addCriterion("ulian not in", values, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianBetween(String value1, String value2) {
            addCriterion("ulian between", value1, value2, "ulian");
            return (Criteria) this;
        }

        public Criteria andUlianNotBetween(String value1, String value2) {
            addCriterion("ulian not between", value1, value2, "ulian");
            return (Criteria) this;
        }

        public Criteria andUdateIsNull() {
            addCriterion("udate is null");
            return (Criteria) this;
        }

        public Criteria andUdateIsNotNull() {
            addCriterion("udate is not null");
            return (Criteria) this;
        }

        public Criteria andUdateEqualTo(String value) {
            addCriterion("udate =", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotEqualTo(String value) {
            addCriterion("udate <>", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThan(String value) {
            addCriterion("udate >", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateGreaterThanOrEqualTo(String value) {
            addCriterion("udate >=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThan(String value) {
            addCriterion("udate <", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLessThanOrEqualTo(String value) {
            addCriterion("udate <=", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateLike(String value) {
            addCriterion("udate like", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotLike(String value) {
            addCriterion("udate not like", value, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateIn(List<String> values) {
            addCriterion("udate in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotIn(List<String> values) {
            addCriterion("udate not in", values, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateBetween(String value1, String value2) {
            addCriterion("udate between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andUdateNotBetween(String value1, String value2) {
            addCriterion("udate not between", value1, value2, "udate");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUfzIsNull() {
            addCriterion("ufz is null");
            return (Criteria) this;
        }

        public Criteria andUfzIsNotNull() {
            addCriterion("ufz is not null");
            return (Criteria) this;
        }

        public Criteria andUfzEqualTo(String value) {
            addCriterion("ufz =", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzNotEqualTo(String value) {
            addCriterion("ufz <>", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzGreaterThan(String value) {
            addCriterion("ufz >", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzGreaterThanOrEqualTo(String value) {
            addCriterion("ufz >=", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzLessThan(String value) {
            addCriterion("ufz <", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzLessThanOrEqualTo(String value) {
            addCriterion("ufz <=", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzLike(String value) {
            addCriterion("ufz like", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzNotLike(String value) {
            addCriterion("ufz not like", value, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzIn(List<String> values) {
            addCriterion("ufz in", values, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzNotIn(List<String> values) {
            addCriterion("ufz not in", values, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzBetween(String value1, String value2) {
            addCriterion("ufz between", value1, value2, "ufz");
            return (Criteria) this;
        }

        public Criteria andUfzNotBetween(String value1, String value2) {
            addCriterion("ufz not between", value1, value2, "ufz");
            return (Criteria) this;
        }

        public Criteria andUswIsNull() {
            addCriterion("usw is null");
            return (Criteria) this;
        }

        public Criteria andUswIsNotNull() {
            addCriterion("usw is not null");
            return (Criteria) this;
        }

        public Criteria andUswEqualTo(String value) {
            addCriterion("usw =", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswNotEqualTo(String value) {
            addCriterion("usw <>", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswGreaterThan(String value) {
            addCriterion("usw >", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswGreaterThanOrEqualTo(String value) {
            addCriterion("usw >=", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswLessThan(String value) {
            addCriterion("usw <", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswLessThanOrEqualTo(String value) {
            addCriterion("usw <=", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswLike(String value) {
            addCriterion("usw like", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswNotLike(String value) {
            addCriterion("usw not like", value, "usw");
            return (Criteria) this;
        }

        public Criteria andUswIn(List<String> values) {
            addCriterion("usw in", values, "usw");
            return (Criteria) this;
        }

        public Criteria andUswNotIn(List<String> values) {
            addCriterion("usw not in", values, "usw");
            return (Criteria) this;
        }

        public Criteria andUswBetween(String value1, String value2) {
            addCriterion("usw between", value1, value2, "usw");
            return (Criteria) this;
        }

        public Criteria andUswNotBetween(String value1, String value2) {
            addCriterion("usw not between", value1, value2, "usw");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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