package mx.ihsa.mybatis.mapper;

import java.util.List;
import mx.ihsa.mybatis.model.Tipomovimiento;
import mx.ihsa.mybatis.model.TipomovimientoExample;
import org.apache.ibatis.annotations.Param;

public interface TipomovimientoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    long countByExample(TipomovimientoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int deleteByExample(TipomovimientoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int deleteByPrimaryKey(Integer idTipMov);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int insert(Tipomovimiento record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int insertSelective(Tipomovimiento record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    List<Tipomovimiento> selectByExample(TipomovimientoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    Tipomovimiento selectByPrimaryKey(Integer idTipMov);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") Tipomovimiento record, @Param("example") TipomovimientoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int updateByExample(@Param("record") Tipomovimiento record, @Param("example") TipomovimientoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int updateByPrimaryKeySelective(Tipomovimiento record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tipomovimiento
     *
     * @mbg.generated Fri Feb 22 12:24:36 CST 2019
     */
    int updateByPrimaryKey(Tipomovimiento record);
}