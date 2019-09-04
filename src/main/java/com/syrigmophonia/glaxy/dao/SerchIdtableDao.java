package com.syrigmophonia.glaxy.dao;

import com.syrigmophonia.glaxy.pojo.viteaDataDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SerchIdtableDao {
    @Update("INSERT Idtable(rid,sid) VALUES(#{rid},#{sid})")
    public void ChangeViteaData(@Param("rid") int rid, @Param("sid") int sid);

    @Select("select v.id,`name`,sex,dutyName,treatment,`describe`,studytype,iphone,v.sid from viteatable as v,idtable as i where v.sid = i.rid and i.sid =#{sid}")
    public List<viteaDataDto> SerchData(@Param("sid") int sid);
}
