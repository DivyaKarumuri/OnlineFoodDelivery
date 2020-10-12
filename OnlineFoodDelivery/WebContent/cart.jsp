<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<%@page import="java.sql.*"%>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>project</title>
	<link rel="stylesheet" type="text/css" href="cart.css">
	<script type="text/javascript" src="./cart.js"></script>
</head>
<body>
	<%
	try {
		int temp=0,temp1=0,temp2=0, x=0, g_total=0 ,dc_total=0,d_total=0;
		Connection con = null;
		PreparedStatement ps = null;
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "demo";
		String userName = "root";
		String password = "divya";
		Class.forName(driverName);
		con = DriverManager.getConnection(url+dbName,userName,password);
		ps = con.prepareStatement("select * from  tab_items");
		ResultSet rs = ps.executeQuery();
		
	%>
	<%=rs.getFetchSize() %>
	<div class="container">
		<div class="heading">
			<h1>
      			<span class="logo">s</span> Food Cart
    		</h1>
    			<a href="CustomerHomePage.jsp" class="visibility-cart transition">X</a>    
		</div>
		
		<div class="cart transition">
			<a href="search.jsp" class="btn btn-update">Update cart</a>
			<button id="clear_cart" class="btn btn-update" style=" float: left;background:blue">Clear Cart</button>
			<%if(rs.next()) {%>
			<div class="products-table" id="products-table">
				<div class="products-th">
					
					<h3 class="product-title">ITEMS</h3>
					<h3 class="price">PRICE</h3>
					<h3 class="quantity">QUANTITY</h3>
					<h3 class="total">TOTAL</h3>
					<h3 class="remove"></h3>
				</div>
				
				<div class="products-td">
					<%
					do{ 
						x=x+1;
					%> 
						<div class="products-row" id="products-row"  >
							<div class="product-title">
								<%=rs.getString(2) %>
							</div>
							<div class="price" id="price"><%=rs.getDouble(3) %></div>
							<div class="quantity">
								<!-- <button id="substract" ><b><</b></button> -->
								<div id="number" style="display: inline-flex;"><%=rs.getInt(4)%></div>
								<!-- <button id="add" ><b>></b></button> -->
							</div>
							<div class="total" id="total"><%=temp=rs.getInt(3)+rs.getInt(4) %></div>
							<div class="remove">
								<!-- <button id="remove-item"><b>X</b></button> -->
							</div>
						</div>
					<%
						temp1 = rs.getInt(5);
						temp2 = rs.getInt(6);
						if(x>1){
							g_total = temp+g_total;
							dc_total = temp1+dc_total;
							d_total = temp2+d_total;
							
						} else {
							g_total=temp;
							dc_total = temp1;
							d_total = temp2;
							
						}
					
					}while(rs.next());
					%>
				</div>
				<div class="products-tf">
				     <h3 class="gtotal"> GRAND TOTAL</h3>
				     <h3 class="g-total" id="g-total"><%= g_total %></h3>
				     <h3 class="remove"></h3>
			    </div>
			    <div class="products-tf" >
				     <h3 class="gtotal">TOTAL DELIVERY CHARGE</h3>
				     <h3 class="g-total" id="dc-total"><%= dc_total %></h3>
				     <h3 class="remove"></h3>
			    </div>
			    <div class="products-tf" >
				     <h3 class="gtotal">TOTAL DISCOUNT</h3>
				     <h3 class="g-total" id="d-total"><%= d_total %></h3>
				     <h3 class="remove"></h3>
			    </div>
			    <div class="products-tf">
				     <h3 class="gtotal">OVERALL GRAND TOTAL</h3>
				     <h3 class="g-total" id="og-total"><%=g_total+dc_total-d_total %></h3>
				     <h3 class="remove"></h3>
			    </div>   
			</div>
			<div class="hidden empty-cart" id= "empty-cart" >
					<img src="images\empty-cart.jpg"style="width: 700px; height: 350px;"></img>
			</div> 
			<% } else {%>
				 <div class="empty-cart" id= "empty-cart" >
					<img src="images\empty-cart.jpg"style="width: 700px; height: 350px;"></img>
				</div> 
			<% }%>
			<a href="#" class="btn btn-update">Place Order</a>
		</div>
	</div>
	<%
		
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	%>
	<script type="text/javascript">
		var valuecount;
		var priceAmt;
		var totalAmt;
		var x =0 ;
		document.querySelector("#clear_cart").addEventListener("click" , fun3 );
		function fun3(){
			if(x<1){
				var y = confirm("Do you need to empty the cart");
				if(y){
					x++;
					document.getElementById("products-table").classList.add("hidden");
					document.getElementById("empty-cart").classList.remove("hidden");		
				}
			} else {
				alert("Already Cart is Empty");
			}
		}
		document.querySelector("#add").addEventListener("click" , fun1 );
		function fun1(){
			valuecount = parseInt(document.getElementById("number").innerHTML);
		    priceAmt = parseInt(document.getElementById("price").innerHTML);
		    totalAmt = parseInt(document.getElementById("g-total").innerHTML);
		    valuecount++;
		    document.getElementById("number").innerHTML = valuecount;
		    document.getElementById("total").innerHTML = valuecount*priceAmt;
		    document.getElementById("g-total").innerHTML = totalAmt+priceAmt;
		}
		document.querySelector("#substract").addEventListener('click' , fun2);
		
		function fun2(){
		    valuecount = parseInt(document.getElementById("number").innerHTML);
		    priceAmt = parseInt(document.getElementById("price").innerHTML);
		    totalAmt = parseInt(document.getElementById("g-total").innerHTML);
			if(valuecount > 1){
		    	--valuecount;
		    	document.getElementById("g-total").innerHTML = totalAmt-priceAmt;
			}
			document.getElementById("number").innerHTML = valuecount;
		    document.getElementById("total").innerHTML = valuecount*priceAmt;
		}
	</script>

</body>

</html>