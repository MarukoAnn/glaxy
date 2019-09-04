package com.syrigmophonia.glaxy.dao;

import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface viteatableDao {
//    @Select("select * from viteaTable WHERE sid=#{sid}")
//    public List<viteaDataDto> SerchviteaList(@Param("sid") int sid);

    @Select("select * from viteaTable")
    public List<viteaDataDto> SerchviteaData();

    @Select("select * from viteaTable WHERE id=#{id}")
    public viteaDataDto SerchviteaListData(@Param("id") int id);

    @Insert("INSERT INTO viteaTable(name,dutyName,treatment,studytype,`describe`,sex,iphone,sid) VALUES(#{name},#{dutyName},#{treatment},#{studytype},#{describe},#{sex},#{iphone},#{sid}) ")
    public void InsertviteaData(@Param("name") String name, @Param("dutyName") String dutyName, @Param("treatment") String treatment,@Param("studytype") String studytype,@Param("describe") String describe, @Param("sex") String sex,@Param("iphone") String iphone, @Param("sid") int sid);


}
