package com.examination.hspf.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileExample() {
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

        public Criteria andOriginNameIsNull() {
            addCriterion("origin_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginNameIsNotNull() {
            addCriterion("origin_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginNameEqualTo(String value) {
            addCriterion("origin_name =", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotEqualTo(String value) {
            addCriterion("origin_name <>", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThan(String value) {
            addCriterion("origin_name >", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameGreaterThanOrEqualTo(String value) {
            addCriterion("origin_name >=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThan(String value) {
            addCriterion("origin_name <", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLessThanOrEqualTo(String value) {
            addCriterion("origin_name <=", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameLike(String value) {
            addCriterion("origin_name like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotLike(String value) {
            addCriterion("origin_name not like", value, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameIn(List<String> values) {
            addCriterion("origin_name in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotIn(List<String> values) {
            addCriterion("origin_name not in", values, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameBetween(String value1, String value2) {
            addCriterion("origin_name between", value1, value2, "originName");
            return (Criteria) this;
        }

        public Criteria andOriginNameNotBetween(String value1, String value2) {
            addCriterion("origin_name not between", value1, value2, "originName");
            return (Criteria) this;
        }

        public Criteria andNewNameIsNull() {
            addCriterion("new_name is null");
            return (Criteria) this;
        }

        public Criteria andNewNameIsNotNull() {
            addCriterion("new_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewNameEqualTo(String value) {
            addCriterion("new_name =", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotEqualTo(String value) {
            addCriterion("new_name <>", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameGreaterThan(String value) {
            addCriterion("new_name >", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_name >=", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameLessThan(String value) {
            addCriterion("new_name <", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameLessThanOrEqualTo(String value) {
            addCriterion("new_name <=", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameLike(String value) {
            addCriterion("new_name like", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotLike(String value) {
            addCriterion("new_name not like", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameIn(List<String> values) {
            addCriterion("new_name in", values, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotIn(List<String> values) {
            addCriterion("new_name not in", values, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameBetween(String value1, String value2) {
            addCriterion("new_name between", value1, value2, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotBetween(String value1, String value2) {
            addCriterion("new_name not between", value1, value2, "newName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameIsNull() {
            addCriterion("suffix_name is null");
            return (Criteria) this;
        }

        public Criteria andSuffixNameIsNotNull() {
            addCriterion("suffix_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixNameEqualTo(String value) {
            addCriterion("suffix_name =", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameNotEqualTo(String value) {
            addCriterion("suffix_name <>", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameGreaterThan(String value) {
            addCriterion("suffix_name >", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameGreaterThanOrEqualTo(String value) {
            addCriterion("suffix_name >=", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameLessThan(String value) {
            addCriterion("suffix_name <", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameLessThanOrEqualTo(String value) {
            addCriterion("suffix_name <=", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameLike(String value) {
            addCriterion("suffix_name like", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameNotLike(String value) {
            addCriterion("suffix_name not like", value, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameIn(List<String> values) {
            addCriterion("suffix_name in", values, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameNotIn(List<String> values) {
            addCriterion("suffix_name not in", values, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameBetween(String value1, String value2) {
            addCriterion("suffix_name between", value1, value2, "suffixName");
            return (Criteria) this;
        }

        public Criteria andSuffixNameNotBetween(String value1, String value2) {
            addCriterion("suffix_name not between", value1, value2, "suffixName");
            return (Criteria) this;
        }

        public Criteria andModidIsNull() {
            addCriterion("modid is null");
            return (Criteria) this;
        }

        public Criteria andModidIsNotNull() {
            addCriterion("modid is not null");
            return (Criteria) this;
        }

        public Criteria andModidEqualTo(Integer value) {
            addCriterion("modid =", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotEqualTo(Integer value) {
            addCriterion("modid <>", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidGreaterThan(Integer value) {
            addCriterion("modid >", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidGreaterThanOrEqualTo(Integer value) {
            addCriterion("modid >=", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidLessThan(Integer value) {
            addCriterion("modid <", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidLessThanOrEqualTo(Integer value) {
            addCriterion("modid <=", value, "modid");
            return (Criteria) this;
        }

        public Criteria andModidIn(List<Integer> values) {
            addCriterion("modid in", values, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotIn(List<Integer> values) {
            addCriterion("modid not in", values, "modid");
            return (Criteria) this;
        }

        public Criteria andModidBetween(Integer value1, Integer value2) {
            addCriterion("modid between", value1, value2, "modid");
            return (Criteria) this;
        }

        public Criteria andModidNotBetween(Integer value1, Integer value2) {
            addCriterion("modid not between", value1, value2, "modid");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("up_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("up_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterion("up_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterion("up_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterion("up_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("up_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterion("up_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("up_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterion("up_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterion("up_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterion("up_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("up_time not between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Double value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Double value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Double value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Double value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Double value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Double> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Double> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Double value1, Double value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Double value1, Double value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
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

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(Integer value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(Integer value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(Integer value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(Integer value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(Integer value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<Integer> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<Integer> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(Integer value1, Integer value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(Integer value1, Integer value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
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