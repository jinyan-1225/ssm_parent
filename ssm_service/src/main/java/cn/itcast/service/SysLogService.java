package cn.itcast.service;

import cn.itcast.domain.SysLog;

import java.util.List;

public interface SysLogService {
    public void save(SysLog log) throws Exception;
    public List<SysLog> findAll() throws Exception;
}
