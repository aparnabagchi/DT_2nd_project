<%@ include file="header.jsp" %>
<script type="text/javascript">
noty('<a href="http://www.jqueryscript.net/tags.php?/Notification/">Notification</a> Title','Message Body');
</script>

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
              <li><a href="createForum">Forum_Page</a></li>
              
             
              <li><a href="editUser">Update Profile</a></li>
              <li><a href="post">All BLOGS</a></li>
              <li><a href="newPost">New BLOGS</a></li>
              <li><a href="myPosts">My BLOGS</a></li>
              <li><a href="Chat">Chat</a></li>
              <li><a href="allForums">All Forums</a></li>
            </ul>
			<br><br>
			<div class="StoreCataloge">
            <h2>Current News</h2>
			<div style="height: 250px;width: 179px; border:1px solid blue; ">
			<marquee  scrollamount="2" direction="up" loop="true" onmouseover="stop()" onmouseout="start()">
			<p>Your test has been scheduled</p>
			<p>Get In touch with friends</p>
			<p>Check your Test Score</p>
			<p>Manage your Performance</p>
			<p>Participate in Quizes</p>
			<p>Earn with referals</p>
			<p>NITET on 25th January</p>
			<p>Bhavishya Jyoti Schollarship</p>
			</marquee>
			</div>
			</div>
          </div>
          <!--Store Catalog End-->
          
         
        </div>
        <!--Left Pane End-->
        <!--Middle Pane Begin-->
        <div class="MiddlePane">
         
          <!--Product Listing Pane Begin-->
           <div class="col-md-6 col-md-4 col-md-4">
      <div class="text-center">
        <img src="${pageContext.request.contextPath}/resources/images/${pageContext.request.userPrincipal.name}.png" class="avatar img-circle img-thumbnail" alt="avatar">
        <h2>Hello Dear : ${pageContext.request.userPrincipal.name}</h2>
      
      </div>
    </div>
    <br>
    <br>
        <!--Middle Pane end-->
        
        
             </div>
    </div>
    
</div>
<div class="ContentFooter">
<%@ include file="footer.jsp" %>
</div>