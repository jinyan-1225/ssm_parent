package cn.itcast.dao;

import cn.itcast.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface MemberDao {
@Select("select * from Member where  id = #{id} ")
    public Member findById(String id) throws Exception;
}
