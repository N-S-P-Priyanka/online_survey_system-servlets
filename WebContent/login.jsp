<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<html lang="en"><head>

  <meta charset="UTF-8">

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
  
<style>
@import url(https://fonts.googleapis.com/css?family=Bree+Serif);
/* the important bits */
body{
text-align: center;
}
li {
  perspective: 400px;
}

.info {
  transform: rotate3d(1, 0, 0, 90deg);
  width: 100%;
  height: 100%;
  padding: 150px;
  position: absolute;
  top: 0;
  left: 0;
  border-radius: 4px;
  pointer-events: none;
  background-color: rgba(26, 188, 156, 0.9);
}

.in-top .info {
  transform-origin: 50% 0%;
  -webkit-animation: in-top 300ms ease 0ms 1 forwards;
          animation: in-top 300ms ease 0ms 1 forwards;
}

.in-right .info {
  transform-origin: 100% 0%;
  -webkit-animation: in-right 300ms ease 0ms 1 forwards;
          animation: in-right 300ms ease 0ms 1 forwards;
}

.in-bottom .info {
  transform-origin: 50% 100%;
  -webkit-animation: in-bottom 300ms ease 0ms 1 forwards;
          animation: in-bottom 300ms ease 0ms 1 forwards;
}

.in-left .info {
  transform-origin: 0% 0%;
  -webkit-animation: in-left 300ms ease 0ms 1 forwards;
          animation: in-left 300ms ease 0ms 1 forwards;
}

.out-top .info {
  transform-origin: 50% 0%;
  -webkit-animation: out-top 300ms ease 0ms 1 forwards;
          animation: out-top 300ms ease 0ms 1 forwards;
}

.out-right .info {
  transform-origin: 100% 50%;
  -webkit-animation: out-right 300ms ease 0ms 1 forwards;
          animation: out-right 300ms ease 0ms 1 forwards;
}

.out-bottom .info {
  transform-origin: 50% 100%;
  -webkit-animation: out-bottom 300ms ease 0ms 1 forwards;
          animation: out-bottom 300ms ease 0ms 1 forwards;
}

.out-left .info {
  transform-origin: 0% 0%;
  -webkit-animation: out-left 300ms ease 0ms 1 forwards;
          animation: out-left 300ms ease 0ms 1 forwards;
}

@-webkit-keyframes in-top {
  from {
    transform: rotate3d(-1, 0, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}

@keyframes in-top {
  from {
    transform: rotate3d(-1, 0, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}
@-webkit-keyframes in-right {
  from {
    transform: rotate3d(0, -1, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}
@keyframes in-right {
  from {
    transform: rotate3d(0, -1, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}
@-webkit-keyframes in-bottom {
  from {
    transform: rotate3d(1, 0, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}
@keyframes in-bottom {
  from {
    transform: rotate3d(1, 0, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}
@-webkit-keyframes in-left {
  from {
    transform: rotate3d(0, 1, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}
@keyframes in-left {
  from {
    transform: rotate3d(0, 1, 0, 90deg);
  }
  to {
    transform: rotate3d(0, 0, 0, 0deg);
  }
}
@-webkit-keyframes out-top {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(-1, 0, 0, 104deg);
  }
}
@keyframes out-top {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(-1, 0, 0, 104deg);
  }
}
@-webkit-keyframes out-right {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(0, -1, 0, 104deg);
  }
}
@keyframes out-right {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(0, -1, 0, 104deg);
  }
}
@-webkit-keyframes out-bottom {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(1, 0, 0, 104deg);
  }
}
@keyframes out-bottom {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(1, 0, 0, 104deg);
  }
}
@-webkit-keyframes out-left {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(0, 1, 0, 104deg);
  }
}
@keyframes out-left {
  from {
    transform: rotate3d(0, 0, 0, 0deg);
  }
  to {
    transform: rotate3d(0, 1, 0, 104deg);
  }
}
/* you can ignore this ones */
ul {
  padding: 0;
  margin: 0 0 50px;
}
ul:after {
  content: "";
  display: table;
  clear: both;
}

li {
  position: relative;
  float: right;
  width: 200px;
  height: 10px;
  margin: 5px;
  padding: 0;
  list-style: none;
}
li a {
  display: inline-block;
  vertical-align: top;
  text-decoration: none;
  border-radius: 4px;
}
li h3 {
  margin: 0;
  font-size: 16px;
  color: rgba(255, 255, 255, 0.9);
}
li p {
  font-size: 12px;
  line-height: 1.5;
  color: rgba(255, 255, 255, 0.8);
}
li .normal {
  width: 100%;
  height: 100%;
  background-color: #ECF0F1;
  color: rgba(52, 73, 94, 0.6);
  box-shadow: inset 0 2px 20px #e6ebed;
  text-align: center;
  font-size: 50px;
  line-height: 200px;
}
li .normal svg {
  pointer-events: none;
  width: 50px;
}
li .normal svg path {
  fill: rgba(52, 73, 94, 0.2);
}

* {
  box-sizing: border-box;
}

body {
  background-color: #fff;
}

h1 {
  margin: 0 auto 5px;
  text-align: center;
}

h3 {
  font-family: "Bree Serif", serif;
}

.container {
  width: 840px;
  margin: 0 auto;
}

header {
  font-family: "Bree Serif", serif;
  text-align: center;
  margin: 10px 10px 25px;
  color: #34495E;
}
header p {
  margin: 0;
  color: rgba(52, 73, 94, 0.4);
}


</style>

  <script>
  window.console = window.console || function(t) {};
</script>

  
  
  <script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
  
</script>


</head>

<body translate="no">

<header>
<h1 style="text-align:left; color: #ff9933; padding-top: 0px">Online Survey</h1>
<ul>
  <li><a href="logout.jsp">Logout</a></li>
  <li><a href="contactus.html">ContactUs</a></li>
  <li><a href="aboutus.html">AboutUs</a></li>
  <li><a href="index.html">Home</a></li>
</ul>
<br><br>
<h1>
<%
      if (session != null) {
         if (session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            out.print("Welcome, " + name);
         } else {
            response.sendRedirect("login.html");
         }
      }
   %>
   </h1>
    <h1>Choose A Template...</h1>
</header>
<div class="container" style="width:92%">
  <ul >
    <li style="width:450px; height:450px">
      <a class="normal" href="responses2.html">
        <img src="3.png" width="450" height="450">
      </a>
      <div class="info">
        <h3>Course Feedback Survey Form</h3>
        <p>Click here to use this template</p>
      </div>
    </li>
    <li style="width:450px; height:450px">
      <a class="normal" href="responses1.html">
        <img src="2.png" width="450" height="450">
      </a>
      <div class="info">
        <h3>Hotel Service Feedback Survey Form</h3>
        <p>Click here to use this template</p>
      </div>
    </li>
    <li style="width:450px; height:450px">
      <a class="normal" href="responses.html">
        <img src="1.png" width="450" height="450">
      </a>
      <div class="info">
        <h3>App Service Feedback Survey Form</h3>
        <p>Click here to use this template</p>
      </div>
    </li>
    <li style="width:450px; height:450px">
      <a class="normal" href="form0.html">
        <img src="6.png" width="450" height="450">
        </a>
      <div class="info">
        <h3>Create A Form From Scratch</h3>
        <p>Click here to use this template</p>
      </div>
    </li>
    <li style="width:450px; height:450px">
      <a class="normal" href="responses4.html">
        <img src="5.png" width="450" height="450">
      </a>
      <div class="info">
        <h3>Student Feedback Survey Form</h3>
        <p>Click here to use this template</p>
      </div>
    </li>
    <li style="width:450px; height:450px">
      <a class="normal" href="responses3.html">
        <img src="4.png" width="450" height="450">
      </a>
      <div class="info">
        <h3>Empployee Feedback Survey Form</h3>
        <p>Click here to use this template</p>
      </div>
    </li>
  </ul>
</div>
    <script src="https://cpwebassets.codepen.io/assets/common/stopExecutionOnTimeout-8216c69d01441f36c0ea791ae2d4469f0f8ff5326f00ae2d00e4bb7d20e24edb.js"></script>

  
      <script id="rendered-js">
// - Noel Delgado | @pixelia_me

const nodes = [].slice.call(document.querySelectorAll('li'), 0);
const directions = { 0: 'top', 1: 'right', 2: 'bottom', 3: 'left' };
const classNames = ['in', 'out'].map(p => Object.values(directions).map(d => `${p}-${d}`)).reduce((a, b) => a.concat(b));

const getDirectionKey = (ev, node) => {
  const { width, height, top, left } = node.getBoundingClientRect();
  const l = ev.pageX - (left + window.pageXOffset);
  const t = ev.pageY - (top + window.pageYOffset);
  const x = l - width / 2 * (width > height ? height / width : 1);
  const y = t - height / 2 * (height > width ? width / height : 1);
  return Math.round(Math.atan2(y, x) / 1.57079633 + 5) % 4;
};

class Item {
  constructor(element) {
    this.element = element;
    this.element.addEventListener('mouseover', ev => this.update(ev, 'in'));
    this.element.addEventListener('mouseout', ev => this.update(ev, 'out'));
  }

  update(ev, prefix) {
    this.element.classList.remove(...classNames);
    this.element.classList.add(`${prefix}-${directions[getDirectionKey(ev, this.element)]}`);
  }}


nodes.forEach(node => new Item(node));
//# sourceURL=pen.js
    </script>

  




 
</body></html>