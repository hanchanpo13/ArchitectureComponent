
package com.demo.xiaozhu.xzruntimepermissions.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.Log;
import android.util.SparseArray;


import com.demo.xiaozhu.xzruntimepermissions.permission.interfaces.DialogHandler;
import com.demo.xiaozhu.xzruntimepermissions.permission.listener.PermissionListener;
import com.demo.xiaozhu.xzruntimepermissions.permission.listener.RationaleListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @Description: 动态权限请求器
 * @Author: fengzeyuan
 * @Date: 17/6/23 下午2:53
 * @Version: 1.0
 */

public class XZPermissionRequest {

    static final int REQUEST_PERMISSION_RATIONALE = 1;
    static final int SETTING_PERMISSION_RATIONALE = 2;

    public static String PERMISSION_REQUEST_CODE = "PERMISSION_REQUEST_CODE";

    static SparseArray<XZPermissionRequest> mRequests = new SparseArray<>();

    private final Context mContext;

    private String[] mPermissions = new String[0];

    private int mRequestCode = -1;
    PermissionListener mCallback;
    RationaleListener mRationaleListener;
    boolean mShowTipAtFirst;

    List<String> getDeniedPermissions() {
        return mDeniedPermissions;
    }

    private List<String> mDeniedPermissions = new ArrayList<>();

    XZPermissionRequest(Context cx, boolean showTipAtFirst) {
        mContext = cx;
        mShowTipAtFirst = showTipAtFirst;
        this.mShowTipAtFirst =showTipAtFirst;
    }

    /**
     * 设置此次权限请求的请求码
     *
     * @param requestCode
     * @return
     */
    @NonNull
    public XZPermissionRequest requestCode(int requestCode) {
        mRequestCode = requestCode;
        return this;
    }

    /**
     * 输入需要检测的权限
     *
     * @param permissions
     * @return
     */
    @NonNull
    public XZPermissionRequest permission(String... permissions) {
        if(permissions!=null){
            mPermissions = permissions;
        }
        return this;
    }

    /**
     * 设置rationale弹窗的回调
     *
     * @param rationaleListener
     * @return
     */
    public XZPermissionRequest rationale(RationaleListener rationaleListener) {
        mRationaleListener = rationaleListener;
        return this;
    }

    /**
     * 设置回调逻辑
     *
     * @param callback
     * @return
     */
    public XZPermissionRequest callback(PermissionListener callback) {
        mCallback = callback;
        return this;
    }


    /**
     * 启动权限请求逻辑
     */
    public void request() {

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            // 6.0下安装时默认同意全部权限
            callBackResult();
            Log.d("XZPermission", "6.0以下系统，无需请求");
        } else {
            mDeniedPermissions = XZPermissionUtils.getDeniedPermissions(mContext, Arrays
                    .asList(mPermissions));
            if (XZPermissionUtils.isPermissionInManifest(mContext, mDeniedPermissions
                    .toArray(new String[mDeniedPermissions.size()]))) {
                if (!mDeniedPermissions.isEmpty()) {
                    mRequests.put(hashCode(), this);
                    // 跳到独立的activity中进行权限申请
                    Intent intent = new Intent(mContext, XZPermissionActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra(PERMISSION_REQUEST_CODE, hashCode());
                    mContext.startActivity(intent);
                } else {
                    // 所申请的权限均有
                    callBackResult();
                    Log.d("XZPermission", "权限已经申请，无需请求");
                }
            } else {
                callBackResult();
                Log.e("XZPermission", "请先在清单文件中注册相应权限");
            }
        }

    }

    private void release() {
        mRequests.remove(hashCode());
    }

    /**
     * 特殊权限申请成功后回调
     * @param permission
     */
    void onSpecialPermissionOk(String permission){
        mDeniedPermissions.remove(permission);
    }

    /**
     * 当有结果时回调
     */
    void callBackResult() {
        if (mCallback != null) {
            mDeniedPermissions = XZPermissionUtils
                    .getDeniedPermissions(mContext, mDeniedPermissions);
            if (!mDeniedPermissions.isEmpty()) {
                mCallback.onFailed(mRequestCode, mDeniedPermissions
                        .toArray(new String[mDeniedPermissions.size()]));
            } else {
                mCallback.onSucceed(mRequestCode, mPermissions);
            }
        }
        release();
    }

    boolean onRationale(DialogHandler rationaleHandler, int rationaleType) {
        if (mRationaleListener != null) {
            if (rationaleType == REQUEST_PERMISSION_RATIONALE) {
                mRationaleListener.showRequestPermissionRationale(mRequestCode, rationaleHandler);
            } else {
                mRationaleListener.showSettingPermissionRationale(mRequestCode, rationaleHandler);
            }
            return true;
        }
        return false;
    }

}
