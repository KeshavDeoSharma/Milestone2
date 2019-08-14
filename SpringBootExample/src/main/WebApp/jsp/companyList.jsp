<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.keshav.SpringBootExample.model.Company"    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
    <title>Manage Company  Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="./jsp/table.css" rel="stylesheet">
</head>
<body>

<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>
<div class="container-fluid nav-container">
<div class="row">
 <div class="col-md-2">
  <img src="logo.webp">
 </div>
 <div class="col-md-8">
  <ul class="nav nav-pills nav-justified">
      <li class="nav-item active">
       <a data-toggle="pill" href="importData.html">Import Data</a>
      </li>
        <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Manage Company <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="addCompany.html">Add Company</a></li>
       <li><a href="manageCompany.html">Edit Company</a></li>
       <li><a href="ListCompany.html">List Company</a></li>
      </ul></li>
      <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Manage Exchange <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="AddStock.html">Add Stock Exchange</a></li>
       <li><a href="ListStock.html">List Stock Exchange</a></li>
      
      </ul></li>
      <li class="nav-item">
       <a data-toggle="pill" href="IpoPlanned.html">Ipo Details</a>
      </li>
   </ul>
 </div>
<div class="col-md-2">
   <button type="submit" class="btn btn-danger btn-md logout" onclick="location.href='Login.html'">Log Out</button>
 </div>
</div>
</div>
<div class="container">
 <div class="card card-container">
  <header>
   <div class="login-head">
    <h1 class="login-head-content">
     <i class="fa fa-user"></i> Company List
    </h1>
   </div>
  </header>
<div class="card card-container1">
  <table>
   <thead>
    <tr>
     <th>Company id</th>
     <th>Company Name</th>
     <th>Turnover</th>
     <th>CEO</th>
     <th>board of directors</th>
     <th>Sector id</th>
     <th>Breif WriteUp</th>
     <th>Stock Code</th>
    </tr>
   </thead>
   <tbody id="myTable">

<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
<tr>
<td><%= e.getCompanyId() %></td>
<td><%=e.getCompanyname() %></td>
<td><%=e.getTurnover() %></td>
<td><%=e.getCeo() %>></td>
<td><%= e.getBoardOfDirectors() %></td>
<td><%=e.getSectorid() %></td>
<td><%=e.getBreifwriteup() %></td>
<td><%=e.getStock_code() %></td>
</tr>
<% }%>

  </tbody>
  </table>
  </div>
  </div>
  </div>
 
  
</body>
      

</html>