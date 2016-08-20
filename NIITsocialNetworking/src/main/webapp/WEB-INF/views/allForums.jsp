<%@ include file="header.jsp" %>
	<style>
h1 {
	border-bottom: 3px solid #cc9900;
	color: #996600;
	font-size: 30px;
}

table, th, td {
	border: 1px solid grey;
	border-collapse: collapse;
	padding: 5px;
}

table tr:nth-child(odd) {
	background-color: #f1f1f1;
}

table tr:nth-child(even) {
	background-color: #ffffff;
}
</style>
<div style="padding-top: 50px;height: 400px;">
<table id="myTable" class="span5 center-table">
	
	<c:if test="${not empty forums}">

		<c:forEach var="forum" items="${forums}">
			<tr>
				<td>
				<div style="width: 700px;height: 100px;background: lightgreen;padding-left: 150px;">
				<a href="<spring:url value="/discussion?id=${forum.id}" />" style="font-size: 30px;">${forum.forumTopic}</a><br>
				
				By ${forum.forumUser} at ${forum.date} 
				</div>
				</td>
				<%-- <td><a href="<spring:url value="/message?id=${user.id}" />"
				class="btn btn-danger"> <span	class="glyphicon-info-sign glyphicon"> </span> Delete
			  </a></td> --%>
			</tr>
		</c:forEach>
	</c:if>
</table>
</div>
<%@ include file="footer.jsp" %>