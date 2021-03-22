package com.hermes.db.model.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPlatformChannelAutoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPlatformChannelAutoExample() {
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelStatusIsNull() {
            addCriterion("channel_status is null");
            return (Criteria) this;
        }

        public Criteria andChannelStatusIsNotNull() {
            addCriterion("channel_status is not null");
            return (Criteria) this;
        }

        public Criteria andChannelStatusEqualTo(Integer value) {
            addCriterion("channel_status =", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusNotEqualTo(Integer value) {
            addCriterion("channel_status <>", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusGreaterThan(Integer value) {
            addCriterion("channel_status >", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_status >=", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusLessThan(Integer value) {
            addCriterion("channel_status <", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("channel_status <=", value, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusIn(List<Integer> values) {
            addCriterion("channel_status in", values, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusNotIn(List<Integer> values) {
            addCriterion("channel_status not in", values, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusBetween(Integer value1, Integer value2) {
            addCriterion("channel_status between", value1, value2, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_status not between", value1, value2, "channelStatus");
            return (Criteria) this;
        }

        public Criteria andChannelSortIsNull() {
            addCriterion("channel_sort is null");
            return (Criteria) this;
        }

        public Criteria andChannelSortIsNotNull() {
            addCriterion("channel_sort is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSortEqualTo(Integer value) {
            addCriterion("channel_sort =", value, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortNotEqualTo(Integer value) {
            addCriterion("channel_sort <>", value, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortGreaterThan(Integer value) {
            addCriterion("channel_sort >", value, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_sort >=", value, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortLessThan(Integer value) {
            addCriterion("channel_sort <", value, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortLessThanOrEqualTo(Integer value) {
            addCriterion("channel_sort <=", value, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortIn(List<Integer> values) {
            addCriterion("channel_sort in", values, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortNotIn(List<Integer> values) {
            addCriterion("channel_sort not in", values, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortBetween(Integer value1, Integer value2) {
            addCriterion("channel_sort between", value1, value2, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelSortNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_sort not between", value1, value2, "channelSort");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrIsNull() {
            addCriterion("channel_page_addr is null");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrIsNotNull() {
            addCriterion("channel_page_addr is not null");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrEqualTo(String value) {
            addCriterion("channel_page_addr =", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrNotEqualTo(String value) {
            addCriterion("channel_page_addr <>", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrGreaterThan(String value) {
            addCriterion("channel_page_addr >", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrGreaterThanOrEqualTo(String value) {
            addCriterion("channel_page_addr >=", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrLessThan(String value) {
            addCriterion("channel_page_addr <", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrLessThanOrEqualTo(String value) {
            addCriterion("channel_page_addr <=", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrLike(String value) {
            addCriterion("channel_page_addr like", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrNotLike(String value) {
            addCriterion("channel_page_addr not like", value, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrIn(List<String> values) {
            addCriterion("channel_page_addr in", values, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrNotIn(List<String> values) {
            addCriterion("channel_page_addr not in", values, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrBetween(String value1, String value2) {
            addCriterion("channel_page_addr between", value1, value2, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelPageAddrNotBetween(String value1, String value2) {
            addCriterion("channel_page_addr not between", value1, value2, "channelPageAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrIsNull() {
            addCriterion("channel_data_addr is null");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrIsNotNull() {
            addCriterion("channel_data_addr is not null");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrEqualTo(String value) {
            addCriterion("channel_data_addr =", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrNotEqualTo(String value) {
            addCriterion("channel_data_addr <>", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrGreaterThan(String value) {
            addCriterion("channel_data_addr >", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrGreaterThanOrEqualTo(String value) {
            addCriterion("channel_data_addr >=", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrLessThan(String value) {
            addCriterion("channel_data_addr <", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrLessThanOrEqualTo(String value) {
            addCriterion("channel_data_addr <=", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrLike(String value) {
            addCriterion("channel_data_addr like", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrNotLike(String value) {
            addCriterion("channel_data_addr not like", value, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrIn(List<String> values) {
            addCriterion("channel_data_addr in", values, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrNotIn(List<String> values) {
            addCriterion("channel_data_addr not in", values, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrBetween(String value1, String value2) {
            addCriterion("channel_data_addr between", value1, value2, "channelDataAddr");
            return (Criteria) this;
        }

        public Criteria andChannelDataAddrNotBetween(String value1, String value2) {
            addCriterion("channel_data_addr not between", value1, value2, "channelDataAddr");
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