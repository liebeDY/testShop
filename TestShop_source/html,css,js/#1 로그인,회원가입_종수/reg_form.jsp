<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="bootstrap.css">
    
    <!-- 다음 우편번호 검색 스크립트 -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/../daumPostCode.js"></script>
<script>
	$(document).ready(function() {
		$("#idCheck").click(function() {
			$.post("/member/idCheck",{id:$("#id").val()})
			.done(function(data) {
				$("#idResult").text(data);
			});
	
		$("#reg_form").click(function() {
			if($("#idResult").text().trim()=="사용가능"){
				$("form").submit();
			}else{
				alert("중복체크 먼저");
			}
		});
	
	});
	});
		
</script>	
	
	
</head>
<body>
    <div class="container">
        <div class="register_form">
            <h1> 회원가입 </h1>
        </div>
        <br /><br />
        <!--가입폼 시작-->
        <form method="post" class="form-horizontal" action="${pageContext.request.contextPath }/member/register">
            <!-- 아이디 -->
            <div class="form-group">
                <label for='userid' class="id_form col-md-6"> 아이디 </label>
                <div class="col-md-15">
                    <input type="text" name="id" id="id" class="form-control" required/>
               
               <input type="button" id="idCheck" value="id 중복체크">
<!--                <span id="idResult"></span> -->
               <br>
               
                </div>
            </div>

            <div class="form-group">
                <label for='"password"' class="col-md-6">  비밀번호</label>
                <div class="col-md-15">
                    <input type="password" name="pwd" id="pwd" class="form-control" required/>
                </div>
            </div>
    
            <div class="form-group">
                <label for='password_re' class="col-md-6">  비밀번호 확인</label>
                <div class="col-md-15">
                    <input type="password" name="user_pw_re" id="user_pw_re" class="form-control" required/>
                </div>
            </div>
    
            <div class="form-group">
                <label for='name' class="col-md-6">  이름 </label>
                <div class="col-md-15">
                    <input type="text" name="name" id="name" class="form-control" required/>
                </div>
            </div>
            <div class="form-group">
            <label for='nickname' class="col-md-6"> 닉네임</label>
            <div class="col-md-15">
            	<input type="text" name="nickname" id="nickname" class="form-control" required/>
            </div>
            </div>
    
            <div class="form-group">
                <label for='email' class="col-md-6">  이메일</label>
                <div class="col-md-15">
                    <input type="email" name="email" id="email" class="form-control" placeholder="ex) honggildong@naver.com" required/>
                </div>
            </div>
    
            <div class="form-group">
                <label for='tel' class="col-md-6">  연락처 </label>
                <div class="col-md-15">
                    <input type="tel" name="tel" id="tel" class="form-control" placeholder="'-'없이 입력" required/>
                </div>
            </div>
    
    
            <div class="form-group">
                <label for='postcode' class="col-md-6">우편번호</label>
                <div class="col-md-15 clearfix" id="post_container">
                    <input type="text" name="postcode" id="postcode" class="form-control pull-left" style='width: 30rem; margin-right: 5px'/>
                    <!-- 클릭 시, Javascript 함수 호출 : openDaumPostcode() -->
                    <input type='button' value='우편번호 찾기' class='btn btn-warning' id="btn1" onclick='execDaumPostcode("postcode", "addr1", "addr2")' required/>
                </div>
            </div>
    
            <div class="form-group">
                <label for='addr1' class="col-md-6">주소</label>
                <div class="col-md-15">
                    <input type="text" name="addr1" id="addr1" class="form-control" required/>
                </div>
            </div>
    
            <div class="form-group">
                <label for='addr2' class="col-md-6">상세주소</label>
                <div class="col-md-15">
                    <input type="text" name="addr2" id="addr2" class="form-control" required/>
                </div>
            </div>
    
    	<div class="form-group">
    		<label for='type' class="col-md-6">유형</label>
    		<div class="col-md-15">
    			<input type="radio" name="type" value="1">구매자
    			<input type="radio" name="type" value="2">판매자
    			<input type="radio" name="type" value="3">관리자<br />
    			</div>
    			</div>
    
            <div class="form-group" >
                <div class="col-md-20" id="btn_group">
                    <button type="submit" class="btn btn-primary" id="btn2">가입하기</button> 
                    <button type="reset" class="btn btn-danger" id="btn3">다시작성</button>
                </div>
            </div>
        </form>
        <!-- 가입폼 끝 -->
        
        
    </div>
</body>
</html>