<%@ include file="header.jsp"%>
<div class="col-md-8 col-sm-6 col-xs-12 personal-info"
	style="padding-left: 200px;">
	
	<form:form action="addForum" commandName="addForum">

		<label for="forumTopic">Forum Topic:</label>
		<textarea class="form-control" name="forumTopic" rows="5"
			placeholder="Write Forum Here" id="forumTopic"></textarea>
		<br>
		<input type="submit" class="btn btn-success" value="Create Forum">

		<a href="<spring:url value="/userProfile"/>"
			class="btn btn-warning btn-large">Cancel</a>

	</form:form>
</div>