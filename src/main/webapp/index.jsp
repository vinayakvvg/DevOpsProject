<%
	String a, b, result;
    a = (String) request.getAttribute("inp1");
    b = (String) request.getAttribute("inp2");
    result  = (String) request.getAttribute("opt");
    
    if(a == null){
    	a = "";
    }
    
    if(b == null){
    	b = "";
    }
    
    if(result == null){
    	result = "";
    }
%>

<html>
	<head>
		<title>DevOps Project Application</title>
		<style>
			input{margin-right:5%; vertical-align:middle;}
			span{margin-right:5%; vertical-align:middle;}
			body{text-align: center}
		</style>
	</head>
	<body>
		<h2 style="margin-top:30px;">DevOps Project Application</h2>
		<form method="post" action="App">
			<p>
         		<input type = "text" name = "inp1" placeholder = "Input 1" value="<%=a%>"/>
         		<span style="font-size:35px;" >+</span>
         		<input type = "text" name = "inp2" placeholder = "Input 2" value="<%=b%>"/>
         		<input type = "submit" value = "Submit"/>
         		<input type = "text" name = "opt" size = 50 value="<%=result%>" placeholder = "Sum or Display error messages for incorrect data"/>
         	</p>
      </form>
	</body>
</html>