<%@ include file="header.jsp"%>
<div class="ContentWrapper">
	<div class="contenttopCurve"></div>
	<div class="ContentMiddleTile">
		<div class="ContentInnerWrapper">
			<!--Left Pane Begin-->
			<div class="LeftPane">
				<!--Store Catalog Begin-->
				<div class="StoreCataloge">
					<h2>Quick Links</h2>
					<ul>
						<li><a href="#">Home</a></li>
						<li><a href="#">About Us</a></li>
						<li><a href="#">Services</a></li>
						<li><a href="#">Portfolio</a></li>
						<li><a href="#">Our Team</a></li>
						<li><a href="#">Vision</a></li>
						<li><a href="Chat">Chat</a></li>
					</ul>
					<br>
					<br>
					<div class="StoreCataloge">
						<h2>Current News</h2>
						<table height=150 width=182 border=1>

						</table>
					</div>
				</div>
				<!--Store Catalog End-->


			</div>
			<!--Left Pane End-->
			<!--Middle Pane Begin-->
			<div class="MiddlePane">

				<form:form action="application" method="POST">
					<input type="text" name="username" value="${myName}">
					<input type="submit" value="Join Chat">
				</form:form>
			</div>

		</div>

	</div>