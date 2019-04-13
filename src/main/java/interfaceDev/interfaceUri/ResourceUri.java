package interfaceDev.interfaceUri;

public class ResourceUri {

    //账号验证接口
    public static final String getVeriﬁcationInfo="/resource/account/veriﬁcation";

    //账号密码变更接口
    public static final String isAccountChanged="/resource/account/isAccountChanged";

    //子集散点查询接口
    public static final String ﬁndSubDept="/resource/dept/ﬁndSubDept";

    //集散点代码查询接口
    public static final String findByCityCode ="/resource/dept/ﬁndByCityCode";

    //集散点信息查询接口
    public static final String getByDeptCode = "/resource/dept/getByDeptCode";

    //个人信息查询接口（userid）
    public static final String getInfo="/resource/res/getInfo";

    //个人信息查询接口（buid）
    public static final String getResource="/resource/res/getResource";

    //个人信息查询接口（username）
    public static final String getByUsername="/resource/res/getByUsername";

    //修改密码接口
    public static final String changePwd="/resource/res/changePwd";

    //集散点，电话查询接口
    public static final String findResInfo="/resource/res/getSimpleRes";

    //有效用户查询接口
    public static final String ﬁndAvailableUserByOrgCode="/resource/res/getAvailableUser";

    //城市代码查询接口
    public static final String getCityCodeByUsername="/resource/res/getCityCodeByUsername";

    //上下班状态修改接口
    public static final String  updateWorkStatus="/resource/res/updateWorkStatus";

    //用户校验接口
    public static final String checkUser="/resource/res/checkUser";

    //所属区域资源查询接口
    public static final String ﬁndByArea="/resource/res/ﬁndByArea";

    //短信验证码接口
    public static final String sendSmsCode="/resource/res/sendSmsCode";

    //验证码校验接口
    public static final String validateCode="/resource/res/validateCode";

    //重置密码接口
    public static final String resetPwd="/resource/res/resetPwd";

    //重置密码接口（RMDS）
    public static final String modifyPwd="/resource/res/modifyPwd";

}
