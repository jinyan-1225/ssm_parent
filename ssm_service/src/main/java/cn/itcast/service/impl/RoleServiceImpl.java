package cn.itcast.service.impl;

import cn.itcast.dao.RoleDao;
import cn.itcast.domain.Permission;
import cn.itcast.domain.Role;
import cn.itcast.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roledao;

    @Override
    public List<Role> findAll() {
        return roledao.findAll();
    }

    @Override
    public void save(Role role) {
        roledao.save(role);
    }

    @Override
    public Role findById(String roleId) {
        return roledao.findById(roleId);
    }


    @Override
    public void addPermissionToRole(String roleId, String[] permissionIds) {
        for (String permissionId : permissionIds) {
            roledao.addPermissionToRole(roleId, permissionId);
        }
    }

    @Override
    public List<Permission> findOtherPermissions(String roleId) {
        return roledao.findOtherPermissions(roleId);
    }


}
