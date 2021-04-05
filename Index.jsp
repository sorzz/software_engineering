<%@ page import="ReadTextFromURL.java" %>

<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
          xmlns:c="http://java.sun.com/jsp/jstl/core"
          version="2.0">
<jsp:directive.page
          language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
<jsp:text><![CDATA[<!doctype html>]]></jsp:text>

<html>
<head>
  <meta charset="utf-8" />
  <link href="style.css" rel="stylesheet" title="Normal" />
  <title>Kalevala</title>
</head>
<body>

<p>...ja tästä se alkaa...</p>

<p>
<script>
    String[] allServiceNames = (String []) request.getAttribute(line);

    <%! 
        void someOutput() {
            out.println(line);
        }
    %>
</script>

</p>

<ol>
<c:forEach items="${someAttribute.someListOfObjects}" var=line>
  <li>${oneObject}</li>
</c:forEach>
</ol>

<!-- If this document uses JavaScript/JQuery, the <script> tags should be generated as
follows: -->
<![CDATA[<script type="text/javascript" src="scripts/lib/jquery-1.6.1.min.js"></script>]]>
<![CDATA[<script type="text/javascript" src="scripts/mainPage.js"></script>]]>

</body>
</html>
</jsp:root>