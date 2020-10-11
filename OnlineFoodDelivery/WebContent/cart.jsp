<!DOCTYPE html>
<html>
	<head>
		<title>CART PAGE</title>
		<link rel = "stylesheet" href = "navbar.css"></link>
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>
		<link rel = "stylesheet" href = "https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"></link>
		<link rel="stylesheet" type="text/css" href="cart.css"></link>
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
		<div class="container">
		<div class="heading">
			<h1>
      			<span class="logo">s</span> Food Cart
    		</h1>
    			<a href="CustomerHomePage.jsp" class="visibility-cart transition">X</a>    
		</div>
		<div class="cart transition">
			<a href="#" class="btn btn-update">Update cart</a>
			<div class="products-table">
				<div class="products-th">
					
					<h3 class="product-title">ITEMS</h3>
					<h3 class="price">PRICE</h3>
					<h3 class="quantity">QUANTITY</h3>
					<h3 class="total">TOTAL</h3>
					<h3 class="remove"></h3>
				</div>
				<div class="products-td">
					<div class="products-row" id="products-row">
						<div class="product-title">
							Biryaani
						</div>
						<div class="price" id="price">100</div>
						<div class="quantity">
							<button id="substract"><b><</b></button>
							<div id="number" style="display: inline-flex;">1</div>
							<button id="add"><b>></b></button>
						</div>
						<div class="total" id="total">100</div>
						<div class="remove">
							<button id="remove-item"><b>X</b></button>
						</div>
					</div>
					<div class="hidden empty-cart" >
						<img src="Images/empty-cart.jpg"style="width: 900px; height: 450px;"hide></img>
					</div>
				</div>
				<div class="products-tf">
				     <h3 class="gtotal"> GRAND TOTAL</h3>
				     <h3 class="g-total" id="g-total">100</h3>
				     <h3 class="remove"></h3>
			    </div>
			</div>
			
			<a href="#" class="btn btn-update">Place Order</a>
		</div>
	</div>
	<script type="text/javascript">
		var valuecount;
		var priceAmt;
		var totalAmt;
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
