package mx.ihsa.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class ClienteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public ClienteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
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
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
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

        public Criteria andIdCteIsNull() {
            addCriterion("id_cte is null");
            return (Criteria) this;
        }

        public Criteria andIdCteIsNotNull() {
            addCriterion("id_cte is not null");
            return (Criteria) this;
        }

        public Criteria andIdCteEqualTo(Integer value) {
            addCriterion("id_cte =", value, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteNotEqualTo(Integer value) {
            addCriterion("id_cte <>", value, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteGreaterThan(Integer value) {
            addCriterion("id_cte >", value, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cte >=", value, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteLessThan(Integer value) {
            addCriterion("id_cte <", value, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteLessThanOrEqualTo(Integer value) {
            addCriterion("id_cte <=", value, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteIn(List<Integer> values) {
            addCriterion("id_cte in", values, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteNotIn(List<Integer> values) {
            addCriterion("id_cte not in", values, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteBetween(Integer value1, Integer value2) {
            addCriterion("id_cte between", value1, value2, "idCte");
            return (Criteria) this;
        }

        public Criteria andIdCteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cte not between", value1, value2, "idCte");
            return (Criteria) this;
        }

        public Criteria andNomCteIsNull() {
            addCriterion("nom_cte is null");
            return (Criteria) this;
        }

        public Criteria andNomCteIsNotNull() {
            addCriterion("nom_cte is not null");
            return (Criteria) this;
        }

        public Criteria andNomCteEqualTo(String value) {
            addCriterion("nom_cte =", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteNotEqualTo(String value) {
            addCriterion("nom_cte <>", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteGreaterThan(String value) {
            addCriterion("nom_cte >", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteGreaterThanOrEqualTo(String value) {
            addCriterion("nom_cte >=", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteLessThan(String value) {
            addCriterion("nom_cte <", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteLessThanOrEqualTo(String value) {
            addCriterion("nom_cte <=", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteLike(String value) {
            addCriterion("nom_cte like", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteNotLike(String value) {
            addCriterion("nom_cte not like", value, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteIn(List<String> values) {
            addCriterion("nom_cte in", values, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteNotIn(List<String> values) {
            addCriterion("nom_cte not in", values, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteBetween(String value1, String value2) {
            addCriterion("nom_cte between", value1, value2, "nomCte");
            return (Criteria) this;
        }

        public Criteria andNomCteNotBetween(String value1, String value2) {
            addCriterion("nom_cte not between", value1, value2, "nomCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteIsNull() {
            addCriterion("ape_pat_cte is null");
            return (Criteria) this;
        }

        public Criteria andApePatCteIsNotNull() {
            addCriterion("ape_pat_cte is not null");
            return (Criteria) this;
        }

        public Criteria andApePatCteEqualTo(String value) {
            addCriterion("ape_pat_cte =", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteNotEqualTo(String value) {
            addCriterion("ape_pat_cte <>", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteGreaterThan(String value) {
            addCriterion("ape_pat_cte >", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteGreaterThanOrEqualTo(String value) {
            addCriterion("ape_pat_cte >=", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteLessThan(String value) {
            addCriterion("ape_pat_cte <", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteLessThanOrEqualTo(String value) {
            addCriterion("ape_pat_cte <=", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteLike(String value) {
            addCriterion("ape_pat_cte like", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteNotLike(String value) {
            addCriterion("ape_pat_cte not like", value, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteIn(List<String> values) {
            addCriterion("ape_pat_cte in", values, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteNotIn(List<String> values) {
            addCriterion("ape_pat_cte not in", values, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteBetween(String value1, String value2) {
            addCriterion("ape_pat_cte between", value1, value2, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApePatCteNotBetween(String value1, String value2) {
            addCriterion("ape_pat_cte not between", value1, value2, "apePatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteIsNull() {
            addCriterion("ape_mat_cte is null");
            return (Criteria) this;
        }

        public Criteria andApeMatCteIsNotNull() {
            addCriterion("ape_mat_cte is not null");
            return (Criteria) this;
        }

        public Criteria andApeMatCteEqualTo(String value) {
            addCriterion("ape_mat_cte =", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteNotEqualTo(String value) {
            addCriterion("ape_mat_cte <>", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteGreaterThan(String value) {
            addCriterion("ape_mat_cte >", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteGreaterThanOrEqualTo(String value) {
            addCriterion("ape_mat_cte >=", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteLessThan(String value) {
            addCriterion("ape_mat_cte <", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteLessThanOrEqualTo(String value) {
            addCriterion("ape_mat_cte <=", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteLike(String value) {
            addCriterion("ape_mat_cte like", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteNotLike(String value) {
            addCriterion("ape_mat_cte not like", value, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteIn(List<String> values) {
            addCriterion("ape_mat_cte in", values, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteNotIn(List<String> values) {
            addCriterion("ape_mat_cte not in", values, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteBetween(String value1, String value2) {
            addCriterion("ape_mat_cte between", value1, value2, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andApeMatCteNotBetween(String value1, String value2) {
            addCriterion("ape_mat_cte not between", value1, value2, "apeMatCte");
            return (Criteria) this;
        }

        public Criteria andTelCteIsNull() {
            addCriterion("tel_cte is null");
            return (Criteria) this;
        }

        public Criteria andTelCteIsNotNull() {
            addCriterion("tel_cte is not null");
            return (Criteria) this;
        }

        public Criteria andTelCteEqualTo(String value) {
            addCriterion("tel_cte =", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteNotEqualTo(String value) {
            addCriterion("tel_cte <>", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteGreaterThan(String value) {
            addCriterion("tel_cte >", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteGreaterThanOrEqualTo(String value) {
            addCriterion("tel_cte >=", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteLessThan(String value) {
            addCriterion("tel_cte <", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteLessThanOrEqualTo(String value) {
            addCriterion("tel_cte <=", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteLike(String value) {
            addCriterion("tel_cte like", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteNotLike(String value) {
            addCriterion("tel_cte not like", value, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteIn(List<String> values) {
            addCriterion("tel_cte in", values, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteNotIn(List<String> values) {
            addCriterion("tel_cte not in", values, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteBetween(String value1, String value2) {
            addCriterion("tel_cte between", value1, value2, "telCte");
            return (Criteria) this;
        }

        public Criteria andTelCteNotBetween(String value1, String value2) {
            addCriterion("tel_cte not between", value1, value2, "telCte");
            return (Criteria) this;
        }

        public Criteria andDirCteIsNull() {
            addCriterion("dir_cte is null");
            return (Criteria) this;
        }

        public Criteria andDirCteIsNotNull() {
            addCriterion("dir_cte is not null");
            return (Criteria) this;
        }

        public Criteria andDirCteEqualTo(String value) {
            addCriterion("dir_cte =", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteNotEqualTo(String value) {
            addCriterion("dir_cte <>", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteGreaterThan(String value) {
            addCriterion("dir_cte >", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteGreaterThanOrEqualTo(String value) {
            addCriterion("dir_cte >=", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteLessThan(String value) {
            addCriterion("dir_cte <", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteLessThanOrEqualTo(String value) {
            addCriterion("dir_cte <=", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteLike(String value) {
            addCriterion("dir_cte like", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteNotLike(String value) {
            addCriterion("dir_cte not like", value, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteIn(List<String> values) {
            addCriterion("dir_cte in", values, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteNotIn(List<String> values) {
            addCriterion("dir_cte not in", values, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteBetween(String value1, String value2) {
            addCriterion("dir_cte between", value1, value2, "dirCte");
            return (Criteria) this;
        }

        public Criteria andDirCteNotBetween(String value1, String value2) {
            addCriterion("dir_cte not between", value1, value2, "dirCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteIsNull() {
            addCriterion("id_edo_cte is null");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteIsNotNull() {
            addCriterion("id_edo_cte is not null");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteEqualTo(Integer value) {
            addCriterion("id_edo_cte =", value, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteNotEqualTo(Integer value) {
            addCriterion("id_edo_cte <>", value, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteGreaterThan(Integer value) {
            addCriterion("id_edo_cte >", value, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_edo_cte >=", value, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteLessThan(Integer value) {
            addCriterion("id_edo_cte <", value, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteLessThanOrEqualTo(Integer value) {
            addCriterion("id_edo_cte <=", value, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteIn(List<Integer> values) {
            addCriterion("id_edo_cte in", values, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteNotIn(List<Integer> values) {
            addCriterion("id_edo_cte not in", values, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteBetween(Integer value1, Integer value2) {
            addCriterion("id_edo_cte between", value1, value2, "idEdoCte");
            return (Criteria) this;
        }

        public Criteria andIdEdoCteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_edo_cte not between", value1, value2, "idEdoCte");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.cliente
     *
     * @mbg.generated do_not_delete_during_merge Fri Feb 22 12:24:36 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.cliente
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
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