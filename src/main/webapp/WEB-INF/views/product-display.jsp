<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sneaker Stroll</title>
    <!-- CSS-link -->
    <link rel="stylesheet" href="resources/style2.css">

    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@100;200;300;400;500;600;700&display=swap" rel="stylesheet">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<link rel="stylesheet"
  href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
</head>
<body>

    <header>
        <a href="#" class="logo"><img src="logo.png" alt=""></a>
        

        <ul class="navmenu">
            <li><a href="#">home</a></li>
            <li><a href="#">shop</a></li>
            <li><a href="#">products</a></li>
            <li><a href="#">page</a></li>
            <li><a href="#">Docs</a></li>
        </ul>

        <div class="nav-icon">
            <a href="#"><i class='bx bx-search'></i></a>
            <a href="#"><i class='bx bx-user' ></i></a>
            <a href="display-cart"><i class='bx bx-cart' ></i></a>

            <div class="bx bx-menu" id="menu-icon"></div>
        </div>
    </header>

    

    <!-- trending-products-section -->
    <section class="trending-product" id="trending">
    <c:forEach var="item" items="${list}">
        <div class="center-text">
            <h2>SNEAKER <span>STROLL</span></h2>
        </div>

        <div class="products">
            <div class="row">
                <img src="resources/images/${item.s_id}.jpg" alt="">
            </div>
            <div class="price">
                <h4>${item.name}</h4>
                <p>Rs. ${item.price}</p>
                <br>
                
                <label for="size-select">Size:</label>
                <select id="size-select" name="size">
                    <option value="S">S</option>
                    <option value="M">M</option>
                    <option value="L">L</option>
                    <option value="XL">XL</option>
                </select>
                <br>
                <br>
                <label for="size-select">Quantity :</label>
                <select id="size-select" name="Quantity">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                </select>
                <br>
                <br>
                <div class="buttons">
                <div class="action_btn">
                
                <a href="add-to-cart?s_id=${item.s_id}"><button name="submit" class="action_btn cancel" type="submit" value="Add To Cart" onclick="myFunction2()">Add To Cart</button></a>
                <p id="saved"></p>
                </div>
                
                    <br>
                    <br>
            </div>
        </div>
        </c:forEach>
    </section>


    <!-- contact-section -->
    <section class="contact">
        <div class="contact-info">
            <div class="first-info">
                <img src="C:\Users\Sahil Arneja\Downloads\sneaker_Stroll_new-removebg-preview.png" alt="">

                <p>4150, Sector-23A ,Near the Northcap University<br>Gurugram, Haryana 122017</p>
                <p>01601348732</p>
                <p>Sneakerstroll@gmail.com</p>

                <div class="social-icon">
                    <a href="#"><i class='bx bxl-facebook'></i></a>
                    <a href="#"><i class='bx bxl-twitter' ></i></a>
                    <a href="#"><i class='bx bxl-instagram' ></i></a>
                    <a href="#"><i class='bx bxl-youtube' ></i></a>
                    <a href="#"><i class='bx bxl-linkedin' ></i></a>
                </div>
            </div>

            <div class="second-info">
                <h4>Support</h4>
                <p>Contact us</p>
                <p>About page</p>
                <p>Size Guide</p>
                <p>Shopping & Resturns</p>
                <p>Privacy</p>
            </div>

           

            <div class="third-info">
                <h4>Company</h4>
                <p>About</p>
                <p>Blog</p>
                <p>Affiliate</p>
                <p>Login</p>
            </div>

            <div class="five">
                <button type="submit" style="background-color:black; color:white; font-size:20px; padding:10px 20px;">Subscribe</button>

            </div>
        </div>
    </section>

    <div class="end-text">
        <p>Copyright © @2022. All Rights Reserved.Designd By Sneakerstroll.</p>
    </div>
    <script src="java.js"></script>
    
</body>
</html>