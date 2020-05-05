<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="<c:url value="/resources/style.css"/>">
        <title>Candy Shop Application </title>
    </head>
    <body>
        <h1>Candy Shop Application</h1>
        
        <main>
            
        <nav>
            <ul>
                <li><a href="#index">Index</a></li>
                <li><a href="candy#GetcandyWithStockLessThanFive">GetcandyWithStockLessThanFive</a></li>
                <li><a href="candylist#BuyCandy">BuyCandy</a></li>
                <li><a href="shoplist#GetCandyByShop">GetCandyByshop</a></li>
            </ul>
        </nav>
       
        <div class="content">
            <section id="index">
              <h1>Welcome To CandyShop, Please select Your Option</h1>
                
            </section>
        
            <section id="GetcandyWithStockLessThanFive">
              <h2>GetcandyWithStockLessThanFive</h2>
              <div align ="center">
                <h1>Candy Details</h1>
                <form:form>
                <table border="1" >
                <thead>
                <tr >
                <th>CandyId</th>
                <th>CandyName</th>
                <th>CandyPrice</th>
                <th>CandyStock</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="candy" items="${candyList}">
                <tr >
                <td>${candy.candyId}</td>
                <td>${candy.candyName}</td>
                <td>${candy.price }</td>
                <td>${candy.stock }</td>
                </tr>
                </c:forEach>
                </tbody>
                
                </table>
                </form:form>
                 <a href="/candy"><button type="button">Refresh</button></a>
                </div>
               
            </section>
            
            <section id="BuyCandy">
              <h2>BuyCandy</h2>
              <div align ="center">
                <h1>Candy Details</h1>
                <form:form>
                <table border="1" >
                <thead>
                <tr >
                <th>CandyId</th>
                <th>CandyName</th>
                <th>CandyPrice</th>
                <th>CandyStock</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="candy" items="${candies}">
                <tr >
                <td>${candy.candyId}</td>
                <td>${candy.candyName}</td>
                <td>${candy.price }</td>
                <td>${candy.stock }</td>
                </tr>
                </c:forEach>
                </tbody>
                
                </table>
                </form:form>
                
                
                </div>
                <div align="center">
		
		<hr />
		<br> 
		<form action="/purchasecandy" >
			Select Candy id :&nbsp;
			 <select  name="candyId" > 
				<c:forEach var="candy" items="${candies}">
					<option value="${candy.candyId}">${candy.candyId}</option>
				</c:forEach>
			</select> <br /> <br /> 
		<input type= "number" name="quantity">
			<button type="submit" >Submit</button>
		</form>
		
	</div>
            </section>
            
            <section id="GetCandyByShop">
              <h2>GetCandyByShop</h2>
              <div align="center">
              <form action="getcandybyshopid" >
			Select Shop id :&nbsp;
			 <select  name="shopId" > 
				<c:forEach var="shop" items="${shoplist}">
					<option value="${shop.shopId}">${shop.shopId}</option>
				</c:forEach>
			</select> <br /> <br /> 
		
			<button type="submit" >Submit</button>
		</form>
		</div>
            </section>
          </div>
          <aside>ASIDE</aside>
        </main>
    </body>
</html>
    
<!--
<!DOCTYPE html>
<html>
    <head>
       
        <title>Candy Shop Application</title>
        <link rel="stylesheet" href="<c:url value="/resources/style.css"/>">
    </head>
    <body>
        <h1>Candy Shop</h1>
        
<div>
<form >
    
    <a href="/candy"><button type="button">Get Candies with Less Stock Less Than Five</button></a>
    &nbsp;&nbsp;&nbsp; 
    <a href="/purchasecandy/" ><button type="button">Purchase Candy</button></a>
    &nbsp;&nbsp;&nbsp; 
    <a href="/getcandybyshop/" ><button type="button">Get Candy By shop</button></a>
    
</form>
</div>

    </body>
</html>-->