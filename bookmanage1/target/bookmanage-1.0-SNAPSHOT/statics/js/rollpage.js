function page_nav(frm, num) {
    frm.pageIndex.value = num;
    frm.submit();
}

function exits() {

    var msg = "确定退出系统！";
    if (confirm(msg) == true) {
        window.location.href = "/users/openLogin.html";
        return true;
    } else {
        return false;
    }

}

$(function () {
    $('tr:even').css("backgroundColor", "#00884d");
    $("#father").submit(function () {

        var password = $("#password").val();
        if (password == "") {
            alert("密码不能为空");
            return false;
        } else if (password.length < 6) {
            alert("密码要大于6为");
            return false;
        }
        var repassword = $("#repasswords").val();
        if (repassword == "") {
            alert("密码不能为空");
            return false;
        } else if (password.length < 6) {
            alert("密码要大于6为");
            return false;
        } else if (repassword == password) {
            alert("密码不一致");
            return false;
        }
        return true;

    })
})
