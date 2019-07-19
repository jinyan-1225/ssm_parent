package cn.itcast.service;

import cn.itcast.domain.Role;
import cn.itcast.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    /**
     * 查询所有的角色
     * @return
     * @throws Exception
     */
    public List<UserInfo> findAll() throws Exception;

    /**
     * 添加角色
     * @param user
     */
    public void save(UserInfo user);

    /**
     * 查询详细信息
     * @param id
     * @return
     */
    public UserInfo findById(String id);

    /**
     * 根据用户的id去查询这个用户不具有的角色
     * @param userId
     * @return
     */
  public List<Role> findOtherRoles (String userId );


  public void addRoleToUser (String  userId ,String[] roleIds);

}
