<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>疫情分布图</title>
<!-- 使用单文件引入的方式使用ECharts.JS -->
<script src="echarts.js"></script>
</head>
<body>
<%
         Object message = request.getAttribute("message");
         if(message!=null && !"".equals(message)){
     
    %>
         <script type="text/javascript">
              alert("<%=request.getAttribute("message")%>");
         </script>
    <%} %>
     <div align="center">
        <h1 style="color: black;">疫情分布列表</h1>
        <table class="tb">
            <tr>
                <td>国家</td>
                <td>确诊人数</td>
                <td>疑似人数</td>
                <td>死亡人数</td>
                <td>治愈人数</td>
                <td>更新时间</td>
            </tr>
            <c:forEach items="${yis}" var="item">
                <tr>
                    <td>${item.countryname}</td>
                    <td>${item.confirmed}</td>
                    <td>${item.suspected}</td>
                    <td>${item.dead}</td>
                    <td>${item.healed}</td>
                    <td>${item.lastupdateTime}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
<div id="main" style="width: 600px;height:400px;"></div>
  <script type="text/javascript">
      // 基于准备好的dom，初始化echarts实例
      var myChart = echarts.init(document.getElementById('main'));

      var arr = new Array();
      var index = 0;
      <c:forEach items="${yis}" var="yi">
          arr[index++] = ${yi.confirmed};
      </c:forEach>

      // 指定图表的配置项和数据
      var option = {
          title: {
              text: '疫情分布图'
          },
          tooltip: {
              show: true
          },
          legend: {
              data:['各国确诊人数']
          },
          xAxis : [
              {
                  type : 'category',
                  data : [
                      <c:forEach items="${yis}" var="y">
                      ["${y.countryname}"],
                      </c:forEach>
                  ]
              }
          ],
          yAxis : [
              {
                  type : 'value'
              }
          ],
          series : [
              {
                  name:'confirmed',
                  type:'bar',
                  data: arr
              }
          ]
      };
       
      // 使用刚指定的配置项和数据显示图表。
      myChart.setOption(option);
  </script>

</body>
</html>