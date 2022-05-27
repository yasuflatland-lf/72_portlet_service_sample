<%@ include file="/init.jsp" %>

<!-- Action URLs -->
<portlet:actionURL var="testMethodURL" name="testMethod"/>

<h4>Test</h4>
<form action="<%=testMethodURL%>" method="POST">
    First <input type="text" name='<portlet:namespace/>first'>
    <input type="submit" value="SUBMIT">
</form>
