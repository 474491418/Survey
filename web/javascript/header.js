/**
 * Created by envy15 on 2015/4/12 0012.
 */
$(function () {
    $('.regFormCheck').bootstrapValidator({

        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            message: 'The username is not valid',
            name: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        min: 4,
                        max: 20
                    },
                    regexp: {
                        message: "您的用户名必须由4到20位的字母和数字组成",
                        regexp: /^[a-z]+[0-9]+/
                    }
                    , remote: {
                        type: "post",
                        url: "/ajax/RegAction_isUserReg.action",
                        dataType:"text",

                        message: "用户名已被注册"
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        min: 3

                    },
                    regexp: {
                        message: '请输入正确的电子邮箱',
                        regexp: /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/
                    }
                }

            },
            passWord: {

                validators: {
                    notEmpty: {}
                    ,
                    stringLength: {
                        min: 4,
                        max: 20
                    },
                    identical: {
                        field: ' confirm_password',
                        message: "两次输入的密码必须相同"
                    }
                    ,

                    regexp: {
                        message: "您的密码必须由4到20位的字母和数字组成",
                        regexp: /^[a-zA-Z]+[0-9]+/
                    }
                }
            }
            ,
            confirm_password: {
                validators: {
                    notEmpty: {}
                    ,
                    identical: {
                        field: 'password',
                        message: "两次输入的密码必须相同"
                    }
                }
            }


        }
    }).on('success.form.bv', function (e) {
        ;
        //阻止表单提交
        e.preventDefault();
        //获得表单实例
        var $form = $(e.target);
        //得到bootstrapValidator实例  从而实现点击的表单验证
        var bv = $form.data('bootstrapValidator');


        // Use Ajax to submit form data
        //$.post($form.attr('action'), $form.serialize(), function(result) {//post方法
        //    console.log(result);
        //   },'json');
        var username = $('#inUserName').val();//提交前保存用户的名字,用于生成cookie，否则在success里再取名字就成空的了
        $.ajax({//ajax提交
            type: "post",
            url: $form.attr('action'),
            data: $form.serialize(),
            beforeSend: function () {
                $('#loading').modal('show');
                $('#reg').find('button').eq(2).button('disable');

            },
            success: function (result) {
                alert("注册成功");
                $.cookie('user', username);
                $('#member').html($.cookie('user'));
                $('#member ,#login_exit').show();
                $('#reg_a,#login_a').hide();
                setTimeout(function () {
                    $('#loading').modal('toggle');
                    $('#reg').modal('toggle');//隐藏modal
                }, 100);

                //   window.location.href="add.php";//跳转
            }


        });
    });


});