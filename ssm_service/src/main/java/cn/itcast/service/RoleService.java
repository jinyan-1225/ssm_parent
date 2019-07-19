package cn.itcast.service;

import cn.itcast.domain.Permission;
import cn.itcast.domain.Role;

import java.util.List;

public interface RoleService {
    /**
     * 查询所有的角色
     *
     * @return
     */
    public List<Role> findAll();

    /**
     * 添加一个角色
     *
     * @param role
     */
    public void save(Role role);

    /**
     * 给role添加Permission
     *
     * @param roleId
     * @param permissionIds
     */
    void addPermissionToRole(String roleId, String[] permissionIds);

    /**
     * 根据id查询role
     *
     * @param roleId
     * @return
     */
    public Role findById(String roleId);

    List<Permission> findOtherPermissions(String roleId) throws Exception;
}
