<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>



<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Report Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
    crossorigin="anonymous">
  </head>
<body>
<div class="container">
  <h3 class="mb-3 pt-3">Report Application</h3>
  
  <form:form action="search" modelAttribute="search" method="POST">
  <table>
  <tr>
       <td>Plan Name:</td>
       <td>
       <form:select path="planeName">
       <form:option value="">--Select--</form:option>
       <form:options items="${names }"/>
       
       </form:select>
       </td>
       
       <td>Plan Status:</td>
       
       <td>
       <form:select path="planstatus">
       <form:option value=" ">--Select--</form:option>
       <form:options items= "${status}"/>
       </form:select>
       </td>
       
       <td>Gender:</td>
       <td>
       <form:select path="gender">
       <form:option value="gender">--Select--</form:option>
       <form:option value="Male">Male</form:option>
       <form:option value="Female">Female</form:option>
       </form:select>
       </td>
       
  </tr>
  <tr>
     <td>Start Date:</td>
     <td><form:input path="StartDate" type="date"
     data-date-format="yyyy-mm-dd"/></td>
  
     <td>End Date:</td>
     <td><form:input path="EndDate" type="date"
     data-date-format="yyyy-mm-dd"/></td>
  </tr>
  <tr>
   <td>
   <input type="submit" value="Search" class="btn btn-primary"/>
   </td>
  </tr>
  
  </table>
  </form:form>
  <table class="table table-striped table-hover">
      <thead>
      <tr>
            <th>Id</th>
            <th>Holder Name</th>
            <th>Plan Name</th>
            <th>plan Status</th>
            <th>Start Date</th>
            <th>End Date</th>
       </tr>
      </thead>
      <tbody>
      <c:foreach items="${plans}" var="plan" varStatus="index" >
      <tr>
        <td>${plan.citizenId}</td>
        <td>${plan.CitizenName}</td>
        <td>${plan.planName}</td>
        <td>${plan.planstatus}</td>
        <td>${plan.planeStartDate}</td>
        <td>${plan.planEndDate}</td>
      </tr>
      </c:foreach>
      </tbody>
  </table>
  <hr/>
  Export:   <a href=" ">Excel</a>      <a href=" "> Pdf </a>
  <hr/>
   
    </div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" 
  integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" 
  crossorigin="anonymous"></script>
</body>
</html>