package com.syrigmophonia.glaxy.dao;

import com.syrigmophonia.glaxy.pojo.UserInfoDTO;
import com.syrigmophonia.glaxy.pojo.recruitDataDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SearchcrecruitDao {
    @Select("select * from recruitdata")
    public List<recruitDataDto> SerchrecruitData();

    @Select("select * from recruitdata WHERE id=#{id}")
    public recruitDataDto Serchrecruit(@Param("id") int id);

    @Update("UPDATE recruitdata SET duty=#{duty},dutyName=#{dutyName},treatment=#{treatment},iphone=#{iphone},`describe`=#{describe},studytype=#{studytype} WHERE id=#{id}")
    public void ChangeChrecruitData(@Param("id") int id,@Param("duty") String duty, @Param("dutyName") String dutyName, @Param("treatment") String treatment, @Param("iphone") String iphone, @Param("describe") String describe,@Param("studytype") String studytype);

    @Delete("DELETE FROM recruitdata WHERE id=#{id}")
    public void Deleterecruit(@Param("id") int id);

    @Insert("INSERT INTO recruitdata(duty,dutyName,treatment,iphone,`describe`,studytype,sid) VALUES(#{duty},#{dutyName},#{treatment},#{iphone},#{describe},#{studytype},#{sid}) ")
    public void InsertChrecruitData(@Param("duty") String duty, @Param("dutyName") String dutyName, @Param("treatment") String treatment, @Param("iphone") String iphone, @Param("describe") String describe,@Param("studytype") String studytype,@Param("sid") int sid);

    @Select("select * from recruitdata WHERE sid=#{sid}")
    public List<recruitDataDto> SerchrecruitList(@Param("sid") int sid);

}
