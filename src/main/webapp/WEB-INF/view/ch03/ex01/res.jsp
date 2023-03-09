<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!-- url을쓰면 value주소를 절대주소로바꿔준다 -->
<!-- css,js,img 파일들은 브라우저가 자동으로 request를 보낸다. -->
<script src='<c:url value="/res/alert.js"/>'></script>
<link rel='stylesheet' href='<c:url value="/res/box.css"/>'/>
<img src='<c:url value="/res/duke.gif"/>'/>

<div></div>