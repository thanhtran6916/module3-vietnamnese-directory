<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 9/27/2021
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      .container {
        width: 500px;
        margin: 100px auto;
      }
      .container form {
        text-align: center;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <form action="/ServletSearch" method="get">
        <h2>Vietnamese Dictionary</h2>
        <input type="text" placeholder="Enter your word: " name="input">
        <button>Search</button>
      </form>
    </div>
  </body>
</html>
