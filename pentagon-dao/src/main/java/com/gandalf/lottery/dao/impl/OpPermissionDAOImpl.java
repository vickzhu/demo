package com.gandalf.lottery.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.stereotype.Repository;

import com.gandalf.framework.ibatis.GandalfSqlMapClientDaoSupport;
import com.gandalf.framework.ibatis.PaginationQueryList;
import com.gandalf.lottery.dao.OpPermissionDAO;
import com.gandalf.lottery.dao.entity.OpPermission;
import com.gandalf.lottery.dao.entity.OpPermissionExample;

@Repository
public class OpPermissionDAOImpl extends GandalfSqlMapClientDaoSupport implements OpPermissionDAO {

    @Resource(name = "opPermissionIncrementer")
    private DataFieldMaxValueIncrementer keyIncrementer;

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public OpPermissionDAOImpl() {
        super();
    }

    public void insert(OpPermission record) {
        if (record.getPermissionId() == null) {
            record.setPermissionId(keyIncrementer.nextLongValue());
        }
        getSqlMapClientTemplate().insert("op_permission.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public int updateByPrimaryKey(OpPermission record) {
        int rows = getSqlMapClientTemplate().update("op_permission.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public int updateByPrimaryKeySelective(OpPermission record) {
        int rows = getSqlMapClientTemplate().update("op_permission.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public List selectByExample(OpPermissionExample example) {
        List list = getSqlMapClientTemplate().queryForList("op_permission.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public OpPermission selectByPrimaryKey(Long permissionId) {
        OpPermission key = new OpPermission();
        key.setPermissionId(permissionId);
        OpPermission record = (OpPermission) getSqlMapClientTemplate().queryForObject("op_permission.abatorgenerated_selectByPrimaryKey",
                                                                                      key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public int deleteByExample(OpPermissionExample example) {
        int rows = getSqlMapClientTemplate().delete("op_permission.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public int deleteByPrimaryKey(Long permissionId) {
        OpPermission key = new OpPermission();
        key.setPermissionId(permissionId);
        int rows = getSqlMapClientTemplate().delete("op_permission.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public int countByExample(OpPermissionExample example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("op_permission.abatorgenerated_countByExample",
                                                                           example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public int updateByExampleSelective(OpPermission record, OpPermissionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("op_permission.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS. This method corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    public int updateByExample(OpPermission record, OpPermissionExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("op_permission.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS. This class corresponds to the database table op_permission
     * 
     * @abatorgenerated
     */
    private static class UpdateByExampleParms extends OpPermissionExample {

        private Object record;

        public UpdateByExampleParms(Object record, OpPermissionExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * com.gandalf.lottery.dao.OpPermissionDAO#selectByPagination(com.gandalf.lottery.dao.entity.OpPermissionExample)
     */
    @Override
    public PaginationQueryList<OpPermission> selectByPagination(OpPermissionExample example) {

        return getSqlMapClientTemplate().queryForPagination("op_permission.abatorgenerated_countByExample",
                                                            "op_permission.selectByPagination", example);
    }
}
