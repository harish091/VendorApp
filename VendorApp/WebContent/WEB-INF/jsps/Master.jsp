<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.navbar {
    overflow: hidden;
    background-color: #333;
    font-family: Arial;
}
.navbar a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
}

.navbar a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>


<div class="navbar">
  <a href="#home">Home</a>
  
  <!-- Location Menu options -->
  <div class="dropdown">
    <button class="dropbtn">Location 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regLoc">Register</a>
      <a href="getAllLocs">View All</a>
      
    </div>
  </div>
  <!-- Location Menu END -->
  
  
  <!-- VENDOR Menu options -->
  <div class="dropdown">
    <button class="dropbtn">Vendor 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="regVen">Register</a>
      <a href="getAllVens">View All</a>
    </div>
    <!-- VENDOR Menu options END -->
    </div>
    
    <div class="dropdown">
    <button class="dropbtn">Document 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="showDocs">Register</a>
    </div>
  </div>
</div>