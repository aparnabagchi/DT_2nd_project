<%@ include file="header.jsp"%>
<section style="padding-left: 200px;">
	<div class="col-md-10 col-sm-8 col-xs-12 personal-info"
		style="padding-left: 20px; background-color: lightgreen;">
		<p style="font-size: 30px;">${discuss.forumTopic}</p>
		<h2>By ${discuss.forumUser}</h2>
		<h2 align="right">on ${discuss.date}</h2>

		<hr>
		<c:if test="${not empty comment}">

			<c:forEach var="c" items="${comment}">
				<table>
					<tr>
						<td>
							<p style="font-size: 20px;">${c.message}</p></td>
							<td><h3>By ${c.username}</h3></td>
						<td>	<h2 align="right">on ${c.date}</h2>
						</td>
					</tr>
				</table>
			</c:forEach>
		</c:if>
		<form:form action="addComment" commandName="addComment">

			<textarea class="form-control" name="message" rows="5"
				placeholder="Write Your Comment Here" id="message"></textarea>
			<input type="hidden" name="formId" value="${discuss.id}" />
			<br>
			<input type="submit" class="btn btn-success" value="Submit">
		</form:form>
	</div>

</section>