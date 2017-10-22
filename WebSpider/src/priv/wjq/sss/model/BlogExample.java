package priv.wjq.sss.model;

import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andWIdIsNull() {
            addCriterion("w_id is null");
            return (Criteria) this;
        }

        public Criteria andWIdIsNotNull() {
            addCriterion("w_id is not null");
            return (Criteria) this;
        }

        public Criteria andWIdEqualTo(Integer value) {
            addCriterion("w_id =", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotEqualTo(Integer value) {
            addCriterion("w_id <>", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThan(Integer value) {
            addCriterion("w_id >", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_id >=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThan(Integer value) {
            addCriterion("w_id <", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThanOrEqualTo(Integer value) {
            addCriterion("w_id <=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdIn(List<Integer> values) {
            addCriterion("w_id in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotIn(List<Integer> values) {
            addCriterion("w_id not in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdBetween(Integer value1, Integer value2) {
            addCriterion("w_id between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotBetween(Integer value1, Integer value2) {
            addCriterion("w_id not between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andBTitleIsNull() {
            addCriterion("b_title is null");
            return (Criteria) this;
        }

        public Criteria andBTitleIsNotNull() {
            addCriterion("b_title is not null");
            return (Criteria) this;
        }

        public Criteria andBTitleEqualTo(String value) {
            addCriterion("b_title =", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotEqualTo(String value) {
            addCriterion("b_title <>", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleGreaterThan(String value) {
            addCriterion("b_title >", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleGreaterThanOrEqualTo(String value) {
            addCriterion("b_title >=", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLessThan(String value) {
            addCriterion("b_title <", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLessThanOrEqualTo(String value) {
            addCriterion("b_title <=", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleLike(String value) {
            addCriterion("b_title like", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotLike(String value) {
            addCriterion("b_title not like", value, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleIn(List<String> values) {
            addCriterion("b_title in", values, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotIn(List<String> values) {
            addCriterion("b_title not in", values, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleBetween(String value1, String value2) {
            addCriterion("b_title between", value1, value2, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBTitleNotBetween(String value1, String value2) {
            addCriterion("b_title not between", value1, value2, "bTitle");
            return (Criteria) this;
        }

        public Criteria andBViewnumIsNull() {
            addCriterion("b_viewNum is null");
            return (Criteria) this;
        }

        public Criteria andBViewnumIsNotNull() {
            addCriterion("b_viewNum is not null");
            return (Criteria) this;
        }

        public Criteria andBViewnumEqualTo(Integer value) {
            addCriterion("b_viewNum =", value, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumNotEqualTo(Integer value) {
            addCriterion("b_viewNum <>", value, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumGreaterThan(Integer value) {
            addCriterion("b_viewNum >", value, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_viewNum >=", value, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumLessThan(Integer value) {
            addCriterion("b_viewNum <", value, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumLessThanOrEqualTo(Integer value) {
            addCriterion("b_viewNum <=", value, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumIn(List<Integer> values) {
            addCriterion("b_viewNum in", values, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumNotIn(List<Integer> values) {
            addCriterion("b_viewNum not in", values, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumBetween(Integer value1, Integer value2) {
            addCriterion("b_viewNum between", value1, value2, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBViewnumNotBetween(Integer value1, Integer value2) {
            addCriterion("b_viewNum not between", value1, value2, "bViewnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumIsNull() {
            addCriterion("b_commentNum is null");
            return (Criteria) this;
        }

        public Criteria andBCommentnumIsNotNull() {
            addCriterion("b_commentNum is not null");
            return (Criteria) this;
        }

        public Criteria andBCommentnumEqualTo(Integer value) {
            addCriterion("b_commentNum =", value, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumNotEqualTo(Integer value) {
            addCriterion("b_commentNum <>", value, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumGreaterThan(Integer value) {
            addCriterion("b_commentNum >", value, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_commentNum >=", value, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumLessThan(Integer value) {
            addCriterion("b_commentNum <", value, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumLessThanOrEqualTo(Integer value) {
            addCriterion("b_commentNum <=", value, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumIn(List<Integer> values) {
            addCriterion("b_commentNum in", values, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumNotIn(List<Integer> values) {
            addCriterion("b_commentNum not in", values, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumBetween(Integer value1, Integer value2) {
            addCriterion("b_commentNum between", value1, value2, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBCommentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("b_commentNum not between", value1, value2, "bCommentnum");
            return (Criteria) this;
        }

        public Criteria andBUrlIsNull() {
            addCriterion("b_url is null");
            return (Criteria) this;
        }

        public Criteria andBUrlIsNotNull() {
            addCriterion("b_url is not null");
            return (Criteria) this;
        }

        public Criteria andBUrlEqualTo(String value) {
            addCriterion("b_url =", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlNotEqualTo(String value) {
            addCriterion("b_url <>", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlGreaterThan(String value) {
            addCriterion("b_url >", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlGreaterThanOrEqualTo(String value) {
            addCriterion("b_url >=", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlLessThan(String value) {
            addCriterion("b_url <", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlLessThanOrEqualTo(String value) {
            addCriterion("b_url <=", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlLike(String value) {
            addCriterion("b_url like", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlNotLike(String value) {
            addCriterion("b_url not like", value, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlIn(List<String> values) {
            addCriterion("b_url in", values, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlNotIn(List<String> values) {
            addCriterion("b_url not in", values, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlBetween(String value1, String value2) {
            addCriterion("b_url between", value1, value2, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBUrlNotBetween(String value1, String value2) {
            addCriterion("b_url not between", value1, value2, "bUrl");
            return (Criteria) this;
        }

        public Criteria andBTagsIsNull() {
            addCriterion("b_tags is null");
            return (Criteria) this;
        }

        public Criteria andBTagsIsNotNull() {
            addCriterion("b_tags is not null");
            return (Criteria) this;
        }

        public Criteria andBTagsEqualTo(String value) {
            addCriterion("b_tags =", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsNotEqualTo(String value) {
            addCriterion("b_tags <>", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsGreaterThan(String value) {
            addCriterion("b_tags >", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsGreaterThanOrEqualTo(String value) {
            addCriterion("b_tags >=", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsLessThan(String value) {
            addCriterion("b_tags <", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsLessThanOrEqualTo(String value) {
            addCriterion("b_tags <=", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsLike(String value) {
            addCriterion("b_tags like", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsNotLike(String value) {
            addCriterion("b_tags not like", value, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsIn(List<String> values) {
            addCriterion("b_tags in", values, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsNotIn(List<String> values) {
            addCriterion("b_tags not in", values, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsBetween(String value1, String value2) {
            addCriterion("b_tags between", value1, value2, "bTags");
            return (Criteria) this;
        }

        public Criteria andBTagsNotBetween(String value1, String value2) {
            addCriterion("b_tags not between", value1, value2, "bTags");
            return (Criteria) this;
        }

        public Criteria andBSortIsNull() {
            addCriterion("b_sort is null");
            return (Criteria) this;
        }

        public Criteria andBSortIsNotNull() {
            addCriterion("b_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBSortEqualTo(String value) {
            addCriterion("b_sort =", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortNotEqualTo(String value) {
            addCriterion("b_sort <>", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortGreaterThan(String value) {
            addCriterion("b_sort >", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortGreaterThanOrEqualTo(String value) {
            addCriterion("b_sort >=", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortLessThan(String value) {
            addCriterion("b_sort <", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortLessThanOrEqualTo(String value) {
            addCriterion("b_sort <=", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortLike(String value) {
            addCriterion("b_sort like", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortNotLike(String value) {
            addCriterion("b_sort not like", value, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortIn(List<String> values) {
            addCriterion("b_sort in", values, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortNotIn(List<String> values) {
            addCriterion("b_sort not in", values, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortBetween(String value1, String value2) {
            addCriterion("b_sort between", value1, value2, "bSort");
            return (Criteria) this;
        }

        public Criteria andBSortNotBetween(String value1, String value2) {
            addCriterion("b_sort not between", value1, value2, "bSort");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeIsNull() {
            addCriterion("b_issueTime is null");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeIsNotNull() {
            addCriterion("b_issueTime is not null");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeEqualTo(String value) {
            addCriterion("b_issueTime =", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeNotEqualTo(String value) {
            addCriterion("b_issueTime <>", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeGreaterThan(String value) {
            addCriterion("b_issueTime >", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeGreaterThanOrEqualTo(String value) {
            addCriterion("b_issueTime >=", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeLessThan(String value) {
            addCriterion("b_issueTime <", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeLessThanOrEqualTo(String value) {
            addCriterion("b_issueTime <=", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeLike(String value) {
            addCriterion("b_issueTime like", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeNotLike(String value) {
            addCriterion("b_issueTime not like", value, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeIn(List<String> values) {
            addCriterion("b_issueTime in", values, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeNotIn(List<String> values) {
            addCriterion("b_issueTime not in", values, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeBetween(String value1, String value2) {
            addCriterion("b_issueTime between", value1, value2, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBIssuetimeNotBetween(String value1, String value2) {
            addCriterion("b_issueTime not between", value1, value2, "bIssuetime");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeIsNull() {
            addCriterion("b_authorHome is null");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeIsNotNull() {
            addCriterion("b_authorHome is not null");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeEqualTo(String value) {
            addCriterion("b_authorHome =", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeNotEqualTo(String value) {
            addCriterion("b_authorHome <>", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeGreaterThan(String value) {
            addCriterion("b_authorHome >", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeGreaterThanOrEqualTo(String value) {
            addCriterion("b_authorHome >=", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeLessThan(String value) {
            addCriterion("b_authorHome <", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeLessThanOrEqualTo(String value) {
            addCriterion("b_authorHome <=", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeLike(String value) {
            addCriterion("b_authorHome like", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeNotLike(String value) {
            addCriterion("b_authorHome not like", value, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeIn(List<String> values) {
            addCriterion("b_authorHome in", values, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeNotIn(List<String> values) {
            addCriterion("b_authorHome not in", values, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeBetween(String value1, String value2) {
            addCriterion("b_authorHome between", value1, value2, "bAuthorhome");
            return (Criteria) this;
        }

        public Criteria andBAuthorhomeNotBetween(String value1, String value2) {
            addCriterion("b_authorHome not between", value1, value2, "bAuthorhome");
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