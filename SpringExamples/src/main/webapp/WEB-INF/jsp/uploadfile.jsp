<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>File Upload</title></head>
<body>

        <form  method="post" enctype="multipart/form-data" action="/upload">
         Upload file&nbsp;
           <input type="file" name="fileToUpload" id="fileToUpload"><br><br>
    <input type="submit" value="Upload " name="submit">
        </form>
</body>
</html>
