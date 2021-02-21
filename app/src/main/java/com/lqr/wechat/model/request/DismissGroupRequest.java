package com.lqr.wechat.model.request;

/**
 * Created by Chris on 16/1/29.
 *
 */
public class DismissGroupRequest {

    private String groupId;

    public DismissGroupRequest(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
