package com.big.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author Yin
 * @date 2024-10-14 16:10
 */
//@Mapper
public interface AccountMapper {

    @Update("update tb_account set money=money+#{money} where accountName=#{accountName}")
    void incrMoney(@Param("accountName") String accountName, @Param("money") Integer money);
    @Update("update tb_account set money=money-#{money} where accountName=#{accountName}")
    void decrMoney(@Param("accountName") String accountName, @Param("money") Integer money);
}
