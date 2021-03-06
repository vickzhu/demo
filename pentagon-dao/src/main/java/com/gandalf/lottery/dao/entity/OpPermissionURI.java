package com.gandalf.lottery.dao.entity;

public class OpPermissionURI {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column op_permission_uri.permission_id
     *
     * @abatorgenerated
     */
    private Long permissionId;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column op_permission_uri.resource_uri
     *
     * @abatorgenerated
     */
    private String resourceURI;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column op_permission_uri.permission_id
     *
     * @return the value of op_permission_uri.permission_id
     *
     * @abatorgenerated
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column op_permission_uri.permission_id
     *
     * @param permissionId the value for op_permission_uri.permission_id
     *
     * @abatorgenerated
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column op_permission_uri.resource_uri
     *
     * @return the value of op_permission_uri.resource_uri
     *
     * @abatorgenerated
     */
    public String getResourceURI() {
        return resourceURI;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column op_permission_uri.resource_uri
     *
     * @param resourceURI the value for op_permission_uri.resource_uri
     *
     * @abatorgenerated
     */
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }
}