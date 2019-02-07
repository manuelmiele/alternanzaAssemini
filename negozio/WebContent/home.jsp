<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>                                                                 
       <title>StoGame</title>                                                                
        <meta charset="utf-8">                                                                 
        <meta name="viewport" content="width=device-width, initial-scale=1">                                                                 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">         
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>                
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>                                                                            
        <meta name="viewport" content="width=device-width, initial-scale=1">                                                              
        <style>.footer {    position: fixed;    left: 0;    bottom: 0;    width: 100%;    background-color: red;    color: white;    text-align: center;    border-top: 3px solid black;    }                                                                
        </style>        
    <style>.header {left: 0;bottom: 0;    width: 100%;    background-color: red;    color: black;    text-align: center;    border-bottom: 3px solid black;    }                                                                
	</style>                                                
</head> 
<body>
<div class="header">                                                              
          <div class="container">                                                                               
            <div class="page-header">                                                                                               
              <h1 align="center"><h1></h1>                                                                                                              
                <div  class="row">                                                                                  
                  <a href="#">                                                                                                                                   
                    <div class="col-md-4" style="background-color:black;" align="center">                                                                                                                                                                                                      
                      <img src="images/Logo.jpg"height="10%"width="30%">                                                                                                                                                
                    </div>                </a>                                                                                                                                       
                  <div class="col-md-4">                                                                                                                                  
                    <br>
                    <form action="ArticoloNomeServlet.java" method="POST">                                                                                                                                    
                    <label for="search" value="ricerca" class="structural">                                                                                                                                    
                    </label>                                                                                                                                    
                    <input type="search" id="ricerca" name="ricerca" value="ricerca" class="txt" size="40%">                                                                                                                                    
                    <button>                                                                                                                                                  
                      <span class="glyphicon glyphicon-search" aria-hidden="true">                                                                                                                                                  
                      </span></button></form>                                                                                                                           
                  </div>                                                                                                                                                                                        
                  <div class="col-md-4" style="background-color:black;" align="center">                                                                                                                                  
                    <img src="images/Logo.jpg"height="10%"width="30%">                                                                                                                      
                  </div>                                                                                                        
                </div></h1>                                                                                      
            </div>                                                                      
          </div>        
        </div>                                                              
        <div style="min-height:5%" class="footer">                                                                                                     
          <div class="container">
          Numero assistenza:                                                
            <span class="glyphicon glyphicon-earphone">                                        
            </span> 000-000-0000                                                             
          </div>                                                                                                                               
        </div>                                                                                   
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->                  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>                                              
    <!-- Include all compiled plugins (below), or include individual files as needed -->                  
<script src="js/bootstrap.min.js"></script>   
</body>
</html>