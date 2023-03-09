<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<form method='post' encType='multipart/form-data'>
	<label>이름: <input type='text' name='username'/></label><br>
	<label>나이: <input type='number' name='age'/></label><br>
	<label>얼굴: <input type='file' name='face'/></label><br>
	<input type='submit'/>
</form>
<!-- 바이너리를 주고받을때 매서드 포스트 인코딩타입 멀티마트 인풋타입 파일 -->
