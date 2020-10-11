<%@page import = "java.sql.DriverManager" %>
<%@page import = "java.sql.Connection" %>
<%@page import = "java.sql.Statement" %>
<%@page import = "java.sql.ResultSet" %>
<!doctype html>
<html>
	<head>
		<title>SEARCH PAGE</title>
		<link rel = "stylesheet" href = "navbar.css">
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> <!--apply navigationbar-->
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
		<link rel = "stylesheet" href = "search.css">
		<script type = "text/javascript" src = "search.js"></script>
		<script>
		//This function is for searching the element present in the table
		function myFunction() {
			//declare variables
			var input, filter, table, tr, td, td1, i, txtValue, txtValue1;
			input = document.getElementById("myInput");
			filter = input.value.toUpperCase();
			table = document.getElementById("myTable");
			tr = table.getElementsByTagName("tr");
			for(i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[1];
				td1 = tr[i].getElementsByTagName("td")[2];
				if(td || td1) {
					txtValue = td.textContent || td.innerText;
					txtValue1 = td1.textContent || td1.innerText;
					if(txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					}
					else if(txtValue1.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					}
					else {
						tr[i].style.display = "none";
					}
				}
			}
		}
		</script>	
	</head>
	<body>
		<nav class = "navbar navbar-inverse">
			<div class = "container-fluid">
				<ul class = "nav navbar-nav">
					<li><a href = "CustomerHomePage.jsp" ><i class = "fa fa-home">HOME</i></a></li>
					<li><a href = "search.jsp"><i class = "fa fa-search">SEARCH</i></a></li>
					<li><a href = "cart.jsp"><i class = "fa fa-shopping-cart">CART</i></a></li>
					<li><a href = "profile.jsp"><i class = "fa fa-user">PROFILE</i></a></li>
				</ul>
				<ul class = "nav navbar-nav navbar-right">
					<li><a href = "#">
						<form action = "CustomerLogout">
							<button type = "submit" value = "LOGOUT"><i class = "fa fa-sign-out">LOGOUT</i></button>
						</form>
					</a></li>
				</ul>
		</div>
		</nav>
		<div class = "boxcontainer">
			<table class = "elementscontainer">
				<tr>
					<td><input type = "text" id = "myInput" onkeyup = "myFunction()" placeholder = "search for resturant or food item" class = "search"></td>
					<td><a href = "#"><i class = "fa fa-search"></a></td>
				</tr>
			</table>
		</div>
		<center>
		<h3>PLZ SELECT THE CHECKBOX TO FORWARD THE ORDER</h3>
		<table id = "myTable">
			<thead>
			<tr class = "header">
				<th style = "width : 15%">Item ID</th>
				<th style = "width : 25%">Item Name</th>
				<th style = "width : 30%">Restaurant Name</th>
				<th style = "width : 10%">Price</th>
				<th style = "width : 10%">Quantity</th>
			</tr>
			</thead>
			<tbody>
			<%
				String driverName = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/";
				String dbName = "demo";
				String userName = "root";
				String password = "divya";
				try {
					Class.forName(driverName);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				Connection con = null;
				Statement st = null;
				ResultSet rs = null;
			%>
			<% 
				try {
					con = DriverManager.getConnection(url+dbName,userName,password);
					st = con.createStatement();
					String query = "select * from fooditem";
					rs = st.executeQuery(query);
					while(rs.next()) {
			%>
			<tr>
				<td><input type = "checkbox"><%=rs.getInt(1) %></td>
				<td><%=rs.getString(2) %></td>
				<td><%=rs.getString(3) %></td>
				<td><%=rs.getInt(4) %></td>
				<td><input type = "number" style = "width : 2em"></td>
			</tr>
			<%
					} 
				} catch(Exception e) {
					e.printStackTrace();
				}
			%> 
		</tbody>
		</table>
		</center>
	</body>
</html>