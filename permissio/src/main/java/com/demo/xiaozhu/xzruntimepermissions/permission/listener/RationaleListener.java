package com.demo.xiaozhu.xzruntimepermissions.permission.listener;


import com.demo.xiaozhu.xzruntimepermissions.permission.interfaces.DialogHandler;

public interface RationaleListener {
    /**
     * 说明性质的弹窗
     * 当第一次权限请求被拒绝，第二次请求权限前，说明权限的重要性等
     *
     * @param requestCode      请求码
     * @param requestRationaleHandler 弹窗逻辑句柄
     */
    void showRequestPermissionRationale(int requestCode, DialogHandler requestRationaleHandler);

    /**
     * 引导性弹窗
     * 引导用户去系统设置中开启权限
     * @param requestCode 请求码
     * @param settingRationaleHandler 弹窗逻辑句柄
     */
    void showSettingPermissionRationale(int requestCode, DialogHandler settingRationaleHandler);
}
