<%--
  Created by IntelliJ IDEA.
  User: oseungpil
  Date: 2019-04-04
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
    <head>
        <tiles:insertAttribute name="include" />
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="bootstrapjs" />
    </head>
    <body>
    <div class="container">
        <tiles:insertAttribute name="nav" />
        <tiles:insertAttribute name="jumbotron" />
        <tiles:insertAttribute name="content" />
    </div>
    </body>
    <tiles:insertAttribute name="footer" />
</html>
