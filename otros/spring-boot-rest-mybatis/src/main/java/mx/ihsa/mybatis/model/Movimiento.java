package mx.ihsa.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Movimiento {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.movimiento.id_mov_cta
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    private Integer idMovCta;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.movimiento.id_cta
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    private Integer idCta;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.movimiento.fch_cre
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    private Date fchCre;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.movimiento.id_tip_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    private Integer idTipMov;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.movimiento.mnt_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    private BigDecimal mntMov;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.movimiento.dsc_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    private String dscMov;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.movimiento.id_mov_cta
     *
     * @return the value of public.movimiento.id_mov_cta
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public Integer getIdMovCta() {
        return idMovCta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.movimiento.id_mov_cta
     *
     * @param idMovCta the value for public.movimiento.id_mov_cta
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setIdMovCta(Integer idMovCta) {
        this.idMovCta = idMovCta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.movimiento.id_cta
     *
     * @return the value of public.movimiento.id_cta
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public Integer getIdCta() {
        return idCta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.movimiento.id_cta
     *
     * @param idCta the value for public.movimiento.id_cta
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setIdCta(Integer idCta) {
        this.idCta = idCta;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.movimiento.fch_cre
     *
     * @return the value of public.movimiento.fch_cre
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public Date getFchCre() {
        return fchCre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.movimiento.fch_cre
     *
     * @param fchCre the value for public.movimiento.fch_cre
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setFchCre(Date fchCre) {
        this.fchCre = fchCre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.movimiento.id_tip_mov
     *
     * @return the value of public.movimiento.id_tip_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public Integer getIdTipMov() {
        return idTipMov;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.movimiento.id_tip_mov
     *
     * @param idTipMov the value for public.movimiento.id_tip_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setIdTipMov(Integer idTipMov) {
        this.idTipMov = idTipMov;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.movimiento.mnt_mov
     *
     * @return the value of public.movimiento.mnt_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public BigDecimal getMntMov() {
        return mntMov;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.movimiento.mnt_mov
     *
     * @param mntMov the value for public.movimiento.mnt_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setMntMov(BigDecimal mntMov) {
        this.mntMov = mntMov;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.movimiento.dsc_mov
     *
     * @return the value of public.movimiento.dsc_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public String getDscMov() {
        return dscMov;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.movimiento.dsc_mov
     *
     * @param dscMov the value for public.movimiento.dsc_mov
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    public void setDscMov(String dscMov) {
        this.dscMov = dscMov;
    }
}