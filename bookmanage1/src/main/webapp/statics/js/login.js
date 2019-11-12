$(function () {
    $("#from").submit(function () {
        var name = $("#name").val();
        if (name == "") {
            alert("用户名不能为空");
            return false;
        }
        var password = $("#password").val();
        if (password == "") {
            alert("密码不能为空");
            return false;
        } else if (password.length < 6) {
            alert("密码要大于6为");
            return false;
        }
        return true;

    })
})