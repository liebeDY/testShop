<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="login.css">
    <!-- <link rel="stylesheet" href="bootstrap.css"> -->
    <title>Document</title>
</head>
<body>
    <div class="container">
        
        <div class="logo_container">
            <a href="#">
                <img class="logo_img" src="images/logo.png">
            </a>
        </div>

        <div class="login_container" >
            <form method="post" class="login_form" action="${pageContext.request.contextPath }/member/login">
                
                <div class="id_area">
                    <input type="text" class="id" id="id" name="id" placeholder="아이디를 입력하세요" />
                </div>

                <div class="id_check"></div>
                
                <div class="pw_area">
                    <input type="text" class="pwd" id="pwd" name="pwd" placeholder="비밀번호를 입력하세요" />
                </div>

                <div class="pw_check"></div>

                <div class="login">
                    <input type="submit" alt="로그인" value="로그인" class="login_btn" />
                </div>

                <div class="register_area">
                    <span>
                        <a class="register" href="reg_agree">회원가입</a>
                    </span>
                    <span>
                        <a class="find_pw" href="#"> 비밀번호 찾기</a>
                    </span>
                </div>
            </form>
        </div>

        <!-- copyright -->
        <div id="copyright">
            <p class="copyright">&copy; 2021 Portfolio Web Site </p>
        </div>
    </div>


</body>
</html>