<%@ include file="header.jsp"%>
<style>
#post{
    padding-left: 100px;
    
}

</style>
<div id="post">
<h2 style="color: blue;font-size: 35px;">
  All BLOGS
</h2>
<c:if test="${not empty posts}">
<c:forEach var="post" items="${posts}">
<p style="color: blue;font-size: 25px;">BLOG Title: ${post.title}</p>
<P style="color: green;font-size: 20px;">Message :${post.content}</P>
<p>By :${post.postUser} at &nbsp;${post.date}</p>
<p>
				<span class="badge">${count}</span>
				
			</p>
</c:forEach>
</c:if>
<c:if test="${pageContext.request.userPrincipal.name == null}">
	<p>
		Please <a href="<c:url value="/login" />">Sign in</a> to post comment
	</p>
</c:if>
<c:if test="${pageContext.request.userPrincipal.name == 'Aparna'}">
	<p>
		<a
					href="<spring:url value="/editPost?id=${post.id }" />"
					class="btn btn-warning"> <span
					class="glyphicon-info-sign glyphicon"> </span> Edit
				</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				 <a href="<spring:url value="/delete?id=${post.id }" />"
					class="btn btn-danger"> <span
					class="glyphicon-info-sign glyphicon"> </span> Delete
				</a>
	</p>
</c:if>

</div>