package api.service.li.dao.model;

import com.ai.ecp.frame.vo.BaseCriteria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DemoCriteria extends BaseCriteria implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected String suffix = "";

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public DemoCriteria() {
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

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNull() {
            addCriterion("ENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andEntnameIsNotNull() {
            addCriterion("ENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntnameEqualTo(String value) {
            addCriterion("ENTNAME =", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotEqualTo(String value) {
            addCriterion("ENTNAME <>", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThan(String value) {
            addCriterion("ENTNAME >", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTNAME >=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThan(String value) {
            addCriterion("ENTNAME <", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLessThanOrEqualTo(String value) {
            addCriterion("ENTNAME <=", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameLike(String value) {
            addCriterion("ENTNAME like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotLike(String value) {
            addCriterion("ENTNAME not like", value, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameIn(List<String> values) {
            addCriterion("ENTNAME in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotIn(List<String> values) {
            addCriterion("ENTNAME not in", values, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameBetween(String value1, String value2) {
            addCriterion("ENTNAME between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andEntnameNotBetween(String value1, String value2) {
            addCriterion("ENTNAME not between", value1, value2, "entname");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andRegnumIsNull() {
            addCriterion("REGNUM is null");
            return (Criteria) this;
        }

        public Criteria andRegnumIsNotNull() {
            addCriterion("REGNUM is not null");
            return (Criteria) this;
        }

        public Criteria andRegnumEqualTo(String value) {
            addCriterion("REGNUM =", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumNotEqualTo(String value) {
            addCriterion("REGNUM <>", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumGreaterThan(String value) {
            addCriterion("REGNUM >", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumGreaterThanOrEqualTo(String value) {
            addCriterion("REGNUM >=", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumLessThan(String value) {
            addCriterion("REGNUM <", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumLessThanOrEqualTo(String value) {
            addCriterion("REGNUM <=", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumLike(String value) {
            addCriterion("REGNUM like", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumNotLike(String value) {
            addCriterion("REGNUM not like", value, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumIn(List<String> values) {
            addCriterion("REGNUM in", values, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumNotIn(List<String> values) {
            addCriterion("REGNUM not in", values, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumBetween(String value1, String value2) {
            addCriterion("REGNUM between", value1, value2, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegnumNotBetween(String value1, String value2) {
            addCriterion("REGNUM not between", value1, value2, "regnum");
            return (Criteria) this;
        }

        public Criteria andRegaddressIsNull() {
            addCriterion("REGADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRegaddressIsNotNull() {
            addCriterion("REGADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRegaddressEqualTo(String value) {
            addCriterion("REGADDRESS =", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotEqualTo(String value) {
            addCriterion("REGADDRESS <>", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressGreaterThan(String value) {
            addCriterion("REGADDRESS >", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressGreaterThanOrEqualTo(String value) {
            addCriterion("REGADDRESS >=", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLessThan(String value) {
            addCriterion("REGADDRESS <", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLessThanOrEqualTo(String value) {
            addCriterion("REGADDRESS <=", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLike(String value) {
            addCriterion("REGADDRESS like", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotLike(String value) {
            addCriterion("REGADDRESS not like", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressIn(List<String> values) {
            addCriterion("REGADDRESS in", values, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotIn(List<String> values) {
            addCriterion("REGADDRESS not in", values, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressBetween(String value1, String value2) {
            addCriterion("REGADDRESS between", value1, value2, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotBetween(String value1, String value2) {
            addCriterion("REGADDRESS not between", value1, value2, "regaddress");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeIsNull() {
            addCriterion("CUSTOMREGCODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeIsNotNull() {
            addCriterion("CUSTOMREGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeEqualTo(String value) {
            addCriterion("CUSTOMREGCODE =", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeNotEqualTo(String value) {
            addCriterion("CUSTOMREGCODE <>", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeGreaterThan(String value) {
            addCriterion("CUSTOMREGCODE >", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMREGCODE >=", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeLessThan(String value) {
            addCriterion("CUSTOMREGCODE <", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMREGCODE <=", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeLike(String value) {
            addCriterion("CUSTOMREGCODE like", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeNotLike(String value) {
            addCriterion("CUSTOMREGCODE not like", value, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeIn(List<String> values) {
            addCriterion("CUSTOMREGCODE in", values, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeNotIn(List<String> values) {
            addCriterion("CUSTOMREGCODE not in", values, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeBetween(String value1, String value2) {
            addCriterion("CUSTOMREGCODE between", value1, value2, "customregcode");
            return (Criteria) this;
        }

        public Criteria andCustomregcodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMREGCODE not between", value1, value2, "customregcode");
            return (Criteria) this;
        }

        public Criteria andRegcustomIsNull() {
            addCriterion("REGCUSTOM is null");
            return (Criteria) this;
        }

        public Criteria andRegcustomIsNotNull() {
            addCriterion("REGCUSTOM is not null");
            return (Criteria) this;
        }

        public Criteria andRegcustomEqualTo(String value) {
            addCriterion("REGCUSTOM =", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomNotEqualTo(String value) {
            addCriterion("REGCUSTOM <>", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomGreaterThan(String value) {
            addCriterion("REGCUSTOM >", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomGreaterThanOrEqualTo(String value) {
            addCriterion("REGCUSTOM >=", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomLessThan(String value) {
            addCriterion("REGCUSTOM <", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomLessThanOrEqualTo(String value) {
            addCriterion("REGCUSTOM <=", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomLike(String value) {
            addCriterion("REGCUSTOM like", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomNotLike(String value) {
            addCriterion("REGCUSTOM not like", value, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomIn(List<String> values) {
            addCriterion("REGCUSTOM in", values, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomNotIn(List<String> values) {
            addCriterion("REGCUSTOM not in", values, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomBetween(String value1, String value2) {
            addCriterion("REGCUSTOM between", value1, value2, "regcustom");
            return (Criteria) this;
        }

        public Criteria andRegcustomNotBetween(String value1, String value2) {
            addCriterion("REGCUSTOM not between", value1, value2, "regcustom");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeIsNull() {
            addCriterion("INSPECTIONREGCODE is null");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeIsNotNull() {
            addCriterion("INSPECTIONREGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeEqualTo(String value) {
            addCriterion("INSPECTIONREGCODE =", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeNotEqualTo(String value) {
            addCriterion("INSPECTIONREGCODE <>", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeGreaterThan(String value) {
            addCriterion("INSPECTIONREGCODE >", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTIONREGCODE >=", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeLessThan(String value) {
            addCriterion("INSPECTIONREGCODE <", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeLessThanOrEqualTo(String value) {
            addCriterion("INSPECTIONREGCODE <=", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeLike(String value) {
            addCriterion("INSPECTIONREGCODE like", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeNotLike(String value) {
            addCriterion("INSPECTIONREGCODE not like", value, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeIn(List<String> values) {
            addCriterion("INSPECTIONREGCODE in", values, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeNotIn(List<String> values) {
            addCriterion("INSPECTIONREGCODE not in", values, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeBetween(String value1, String value2) {
            addCriterion("INSPECTIONREGCODE between", value1, value2, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andInspectionregcodeNotBetween(String value1, String value2) {
            addCriterion("INSPECTIONREGCODE not between", value1, value2, "inspectionregcode");
            return (Criteria) this;
        }

        public Criteria andReginspectionIsNull() {
            addCriterion("REGINSPECTION is null");
            return (Criteria) this;
        }

        public Criteria andReginspectionIsNotNull() {
            addCriterion("REGINSPECTION is not null");
            return (Criteria) this;
        }

        public Criteria andReginspectionEqualTo(String value) {
            addCriterion("REGINSPECTION =", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionNotEqualTo(String value) {
            addCriterion("REGINSPECTION <>", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionGreaterThan(String value) {
            addCriterion("REGINSPECTION >", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionGreaterThanOrEqualTo(String value) {
            addCriterion("REGINSPECTION >=", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionLessThan(String value) {
            addCriterion("REGINSPECTION <", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionLessThanOrEqualTo(String value) {
            addCriterion("REGINSPECTION <=", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionLike(String value) {
            addCriterion("REGINSPECTION like", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionNotLike(String value) {
            addCriterion("REGINSPECTION not like", value, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionIn(List<String> values) {
            addCriterion("REGINSPECTION in", values, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionNotIn(List<String> values) {
            addCriterion("REGINSPECTION not in", values, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionBetween(String value1, String value2) {
            addCriterion("REGINSPECTION between", value1, value2, "reginspection");
            return (Criteria) this;
        }

        public Criteria andReginspectionNotBetween(String value1, String value2) {
            addCriterion("REGINSPECTION not between", value1, value2, "reginspection");
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