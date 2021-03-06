package com.gandalf.lottery.dao.entity;

public class OpPermissionGroup {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column op_permission_group.permission_group_id
     *
     * @abatorgenerated
     */
    private Long permissionGroupId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column op_permission_group.group_name
     *
     * @abatorgenerated
     */
    private String groupName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column op_permission_group.order_num
     *
     * @abatorgenerated
     */
    private Integer orderNum;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column op_permission_group.permission_group_id
     *
     * @return the value of op_permission_group.permission_group_id
     *
     * @abatorgenerated
     */
    public Long getPermissionGroupId() {
        return permissionGroupId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column op_permission_group.permission_group_id
     *
     * @param permissionGroupId the value for op_permission_group.permission_group_id
     *
     * @abatorgenerated
     */
    public void setPermissionGroupId(Long permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column op_permission_group.group_name
     *
     * @return the value of op_permission_group.group_name
     *
     * @abatorgenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column op_permission_group.group_name
     *
     * @param groupName the value for op_permission_group.group_name
     *
     * @abatorgenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column op_permission_group.order_num
     *
     * @return the value of op_permission_group.order_num
     *
     * @abatorgenerated
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column op_permission_group.order_num
     *
     * @param orderNum the value for op_permission_group.order_num
     *
     * @abatorgenerated
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}