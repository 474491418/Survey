$(function () {
    $('#reg_a').bind('click', function () {
        $('#reg').modal({//modal设置后面的遮罩
            backdrop: 'static'
        });
    });
    if ($.cookie('user')) {//根据cookie判断右上角登陆是什么值
        $('#member').html($.cookie('user'));//把cookie的值放到member中显示出来
        $('#member ,#login_exit').show();
        $('#reg_a,#login_a').hide();
    } else {
        $('#member ,#login_exit').hide();
        $('#reg_a,#login_a').show();
    }
    $('#form-cancel').bind('click', function () {//按取消键触发 并且重置表格

        $('.regFormCheck').bootstrapValidator('disableSubmitButtons', false).
            bootstrapValidator('resetForm', true);
    });
    $('#login_exit').bind('click', function () {
        $('#member ,#login_exit').hide();
        $('#reg_a,#login_a').show();

    });
});