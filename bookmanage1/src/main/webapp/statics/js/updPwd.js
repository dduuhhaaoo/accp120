$(function () {
    $("#pwd").bind("blur", function () {
        //获取值
        $.ajax({
            url: "/users/pwdyz.html",//请求的url
            type: "GET",//请求类型
            data: {pwd: $(this).val()},//请求参数
            dataType: "json",//ajax接口（请求url）返回的数据类型
            contentType: "application/json;charset=utf-8",
            success: function (data) {//data：返回数据（json对象）
                if (data.NumberName == "empty") {//参数APKName为空，错误提示
                    alert("密码不能为空！");
                } else if (data.NumberName == "exist") {//账号不可用，错误提示
                    alert("源密码不正确！");
                } else if (data.NumberName == "noexist") {//账号可用，正确提示
                    alert("密码正确！");
                }
            },
            error: function (data) {//当访问时候，404，500 等非200的错误状态码
                alert("1111111！");
            }
        });
    });

});

