<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PM Project</title>
</head>
<body>
<p style="background-image:url('E:\Downloads\image.jpg')">
<a href="Show Details" >Show Details</a>
	<h1 style="color: red;">Prime Minister Details</h1>
	<form action="pm" method="post">
		<fieldset>
			<legend> Name: </legend>
			<div>
				<input type="text" id="name" name="Name">
			</div>
		</fieldset>
		<fieldset>
			<legend> Country:</legend>
			<div>
				<input type="text" id="country" name="Country">
			</div>
		</fieldset>
		<fieldset>
			<legend>Date of Birth</legend>
			<label for="birthday">birthday</label>
			 <input type="date" id="birthday" name="birthday">
		</fieldset>

		<fieldset>
			<legend> Marriage Status :</legend>
			<div>
				<input type="radio" id="Unmarried" value="Unmarried" name="MStatus">
				<label for="Unmarried">Unmarried</label>
			</div>

			<div>
				<input type="radio" id="Married" value="married" name="MStatus">
				<label for="Married">Married</label>
			</div>

			<div>
				<input type="radio" id="Bramhachari" value="Bramhachari" name="MStatus">
				<label for="Bramhachari">Bramhachari</label>
			</div>
		</fieldset>

		<fieldset>
			<legend> Party</legend>
			<select id="Party" name="Party">
				<option selected="selected">BJP</option>
				<option selected="selected">Congress</option>
				<option selected="selected">Others</option>
			</select>
		</fieldset>

		<fieldset>
			<legend>Gender:</legend>
			<div>
				<input type="radio" id="Male" value="Male" name="Gender"> <label
					for="Male">Male</label><br>
			</div>

			<div>
				<input type="radio" id="Female" value="Female" name="Gender">
				<label for="Female">Female</label><br>
			</div>

			<div>
				<input type="radio" id="others" value="others" name="Gender">
				<label for="others">Others</label><br>
			</div>
		</fieldset>

		<fieldset>
			<legend>Period As:</legend>
			Period: <input type="text" name="Period" ><br><br>
		</fieldset>
		<fieldset>
			<legend>Times Represented</legend>
			<select id="time" name="time">
				<option selected="selected">1</option>
				<option selected="selected">2</option>
				<option selected="selected">3</option>
			</select>
		</fieldset>
		<fieldset>
			<input type="submit"  value="Save">
		</fieldset>
	</form>
</body>
</html>