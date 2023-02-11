<%@ page import="com.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
</head>
<body>
<div id="create-student" class="content scaffold-create" role="main">
    <g:form resource="${this.student}" method="PUT">
        <fieldset class="form">
            <f:all bean="student"/>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="edit" class="save" value="Edit" />
        </fieldset>
    </g:form>
</div>
</body>
</html>