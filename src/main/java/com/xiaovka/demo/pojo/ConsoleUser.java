package com.xiaovka.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述:console_user表的实体类
 *
 * @author: wuhao
 * @创建时间: 2018-05-28
 */
public class ConsoleUser implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4536702676039330344L;

    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String userName;

    /**
     *
     */
    private String pwd;

    /**
     *
     */
    private String realName;

    /**
     *
     */
    private String phone;

    /**
     * 1:启用    2:禁用
     */
    private Integer state;

    /**
     * 0:正常    1:已删除
     */
    private Integer deleted;

    /**
     *
     */
    private Integer createBy;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date doneTime;

    /**
     *
     */
    private Date lastLoginTime;
    /**
     * 用户token
     */
    private String token;

    private Date expireTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 1:启用    2:禁用
     *
     * @return state 1:启用    2:禁用
     */
    public Integer getState() {
        return state;
    }

    /**
     * 1:启用    2:禁用
     *
     * @param state 1:启用    2:禁用
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 0:正常    1:已删除
     *
     * @return deleted 0:正常    1:已删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 0:正常    1:已删除
     *
     * @param deleted 0:正常    1:已删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * @return create_by
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return done_time
     */
    public Date getDoneTime() {
        return doneTime;
    }

    /**
     * @param doneTime
     */
    public void setDoneTime(Date doneTime) {
        this.doneTime = doneTime;
    }

    /**
     * @return last_login_time
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }
}