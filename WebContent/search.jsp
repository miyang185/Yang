<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>日期查询人数</title>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.code.js"></script>
<style>
 .a{
   margin-bottom: 20px;
  }
  .b{
    margin-top:45px;
    margin-bottom: 20px;
  }
  .c{
  width:300px;
  height:240px;
  background:rgb(195,195,195);
  position:absolute;
  top:30%;
  left:50%;
  transform:translaet(-50%,-50%);
  }
  .d{
   font-size:5px;
   color:black;
   font-family:"宋体";
  }
  .e{
   width:240px;
   height:30px;
   margin-left:30px;
   background-color:blue;
  }
  .f{
  margin-left:30px;
  margin-top:45px;
  margin-bottom: 20px;
  }
  .g{
  margin-left:30px;
  margin-bottom: 20px;
  }
</style>
</head>
<body>
<div class="c">
 <form action="tServlet?method=search"  method="post"  onsubmit="return check()">
  <div class="f">
  <label for="Date">日期:</label>
  <select name="Date">
  <option Select>[选择日期]</option>
  <option value="2020-03-20 13:09:36">3-20</option>
  </select>
  </div>
  
  <div>
  <input type="submit" class="e" value="&nbsp;查&nbsp;询&nbsp;">
  </div>
  </form>
</div>


</body>
</html>