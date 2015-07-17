<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Add Holiday</title>
</head>

<body>
	<form method="post" action="addholiday">
   
    <input name="challan" type="hidden" value="<%=request.getParameter("challan")%>" size="10" maxlength="10" /> <br />	
	
	Challan No. : <%=request.getParameter("challan")%>
	
	<br/>
	Select Year:
 		<select name="year">
		  <option value="0">Select</option>
		  <option value="2013">2013</option>
		  <option value="2014">2014</option>
		  <option value="2015">2015</option>
		  <option value="2016">2016</option>
		  <option value="2017">2017</option>
		</select>  <br />
	
	
	Select Month:
		<select name="month" >
			<option value="0">Select</option>
			<option value="1">January</option>
			<option value="2">February</option>
			<option value="3">March</option>
			<option value="4">April</option>
			<option value="5">May</option>
			<option value="6">June</option>
			<option value="7">July</option>
			<option value="8">August</option>
			<option value="9">Setember</option>
			<option value="10">October</option>
			<option value="11">November</option>
			<option value="12">December</option>
		</select><br />
		
	Enter No. of Holiday:
		<input name="holiday" type="text" value="" size="10" maxlength="10" /> 
		
	<input name="submit" type="submit" value="Add" />	
		

	</form>		
</body>
</html>
