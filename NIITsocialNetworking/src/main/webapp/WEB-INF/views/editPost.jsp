<%@include file="header.jsp" %>

<div class="col-md-8 col-sm-6 col-xs-12 personal-info"
	style="padding-left: 200px;">
	
	<form:form action="edit/${post.id}" commandName="post">
	<label for="postUser">Username:</label>
		<input type="text" name="postUser" class="form-control"
			value="${post.postUser}" id="postUser" disabled="disabled">

		<label for="title">Title:</label>
		<input type="text" name="title" class="form-control"
			value="${post.title}" id="title">


		<label for="comment">Comment:</label>
		<form:textarea path="content" class="form-control" name="content" rows="5"
			 id="comment" />
		<br>
		<input type="submit" class="btn btn-success" value="Edit Post">

		<a href="<spring:url value="/post"/>"
			class="btn btn-warning btn-large">Cancel</a>

	</form:form>
</div>