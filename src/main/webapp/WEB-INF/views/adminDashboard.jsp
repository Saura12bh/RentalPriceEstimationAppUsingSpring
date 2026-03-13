

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String user=(String)session.getAttribute("un");
if(user==null)
{
response.sendRedirect("lg");
}
%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>admin Dashboard</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css" />
<!-- SweetAlert2 Library -->
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body class="bg-dark text-light">
	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
		<div class="container-fluid">
			<a class="navbar-brand fw-bold" href="#">Rental Price Predication
				System</a>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<!-- Sidebar -->
			<div class="col-md-3 col-lg-2 bg-secondary min-vh-100 p-3">
				<h5 class="text-center mb-4">Menu</h5>
				<marquee behavior="" direction="" scrollamount="4">
					Welcome  ${un} </marquee>
				<div class="nav flex-column">
					<button class="btn btn-outline-light mb-2"
						onclick="showSection('addForm')">Add Property</button>
					<button class="btn btn-outline-light mb-2"
						onclick="showSection('searchForm');">Display Property</button>
					<button class="btn btn-outline-light"
						onclick="(showSection('displayData'), display());">
						Display User</button>
					<a class="btn btn-danger mt-5" href="logout">Log Out</a>
				</div>
			</div>

			<!-- Main Content -->
			<div class="col-md-9 col-lg-10 p-4">
				<!-- Add Expenditure -->
				<div id="addForm" class="section">
					<div class="row align-items-center">
						<div class="col-md-2"></div>
						<div class="col-md-7">
							<h3 class="mb-3">Add Property</h3>
							<form id="houseForm">

								<div class="mb-3">
									<label class="form-label">Enter State</label> <input
										type="text" id="state" autofocus="autofocus"
										class="form-control bg-dark text-light border-light" />
								</div>

								<div class="mb-3">
									<label class="form-label">Enter City</label> <input type="text"
										id="city" class="form-control bg-dark text-light border-light" />
								</div>

								<div class="mb-3">
									<label class="form-label">Enter Location</label> <input
										type="text" id="location"
										class="form-control bg-dark text-light border-light" />
								</div>

								<div class="mb-3">
									<label class="form-label">Enter Size (sq ft)</label> <input
										type="number" id="size"
										class="form-control bg-dark text-light border-light" />
								</div>

								<div class="mb-3">
									<label class="form-label">Enter Number of Bedrooms</label> <input
										type="number" id="bedrooms"
										class="form-control bg-dark text-light border-light" />
								</div>

								<div class="mb-3">
									<label class="form-label">Enter Number of Bathrooms</label> <input
										type="number" id="bathrooms"
										class="form-control bg-dark text-light border-light" />
								</div>

								<div class="mb-3">
									<label class="form-label">Enter Distance of Metro (in
										m)</label> <input type="number" id="metro"
										class="form-control bg-dark text-light border-light" />
								</div>

								<div class="mt-3">
									<label class="form-label">Parking</label> <select
										class="form-select bg-dark text-light border-light"
										id="parking">
										<option value="">-- Select --</option>
										<option value="Yes">Yes</option>
										<option value="No">No</option>
									</select>
								</div>

								<div class="mb-3 mt-3">
									<label class="form-label">Enter Price</label> <input
										type="number" id="price"
										class="form-control bg-dark text-light border-light" />
								</div>

								<button type="submit" class="btn btn-outline-primary me-5 mt-4">
									Submit</button>

								<button type="button" class="btn btn-outline-primary mt-4"
									onclick="clearFields()">Clear</button>

							</form>
						</div>
					</div>
				</div>

				<!-- Search -->
				<div id="searchForm" class="section d-none">


					<div class="container mt-5">
						<h2 class="mb-4">Property List</h2>

						<!-- Search Section -->
						<div class="row mb-4">
							<div class="col-md-4">
								<label class="form-label">Search By City</label> <input
									type="text"
									class="form-control bg-dark text-light border-secondary"
									placeholder="Enter city" />
							</div>

							<div class="col-md-2 d-flex align-items-end">
								<button type="button" class="btn btn-primary w-100">Search</button>
							</div>
						</div>

						<!-- Property Table -->
						<table class="table table-dark table-striped table-bordered">
							<thead>
								<tr>
									<th>Property ID</th>
									<th>State</th>
									<th>City</th>
									<th>Location</th>
									<th>Area (sqft)</th>
									<th>Bedrooms</th>
									<th>Bathrooms</th>
									<th>Parking</th>
									<th>Metro Distance</th>
									<th>Price</th>
									<th>Actions</th>
								</tr>
							</thead>

							<tbody>
								<tr>
									<td>1</td>
									<td>Maharashtra</td>
									<td>Pune</td>
									<td>Hinjewadi</td>
									<td>950</td>
									<td>2</td>
									<td>2</td>
									<td>Yes</td>
									<td>1.5 km</td>
									<td>₹18,000</td>
									<td><a href="updateProperty.jsp?id=1"
										class="btn btn-warning btn-sm">Update</a> <a
										href="#" class="btn btn-danger btn-sm">Delete</a></td>
								</tr>

								<tr>
									<td>2</td>
									<td>Maharashtra</td>
									<td>Mumbai</td>
									<td>Andheri</td>
									<td>600</td>
									<td>1</td>
									<td>1</td>
									<td>No</td>
									<td>0.8 km</td>
									<td>₹25,000</td>
									<td><a href="updateProperty.jsp?id=2"
										class="btn btn-warning btn-sm">Update</a> <a
										href="#" class="btn btn-danger btn-sm">Delete</a></td>
								</tr>
							</tbody>
						</table>
					</div>

				</div>

				<!-- Display User -->
				<div id="displayData" class="section d-none">

					<div class="container mt-5">
						<h2 class="mb-4">User List</h2>

						<table class="table table-dark table-striped table-bordered">
							<thead>
								<tr>
									<th>User ID</th>
									<th>Name</th>
									<th>Email</th>
									<th>Contact</th>
									<th>Role</th>
									<th>Action</th>
								</tr>
							</thead>

							<tbody id="tb">
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="./js/Main.js"></script>
	<script>

document.getElementById("houseForm").addEventListener("submit", saveHouse);

function saveHouse(event)
{
event.preventDefault();

let state=document.getElementById("state").value.trim();
let city=document.getElementById("city").value.trim();
let location=document.getElementById("location").value.trim();
let size=document.getElementById("size").value;
let bedrooms=document.getElementById("bedrooms").value;
let bathrooms=document.getElementById("bathrooms").value;
let metro=document.getElementById("metro").value;
let parking=document.getElementById("parking").value;
let price=document.getElementById("price").value;


// validation

if(state=="")
{
alert("State required");
return;
}

if(city=="")
{
alert("City required");
return;
}

if(location=="")
{
alert("Location required");
return;
}

if(size<=0)
{
alert("Enter valid size");
return;
}

if(bedrooms<=0)
{
alert("Enter bedrooms");
return;
}

if(bathrooms<=0)
{
alert("Enter bathrooms");
return;
}

if(metro<0)
{
alert("Enter metro distance");
return;
}

if(parking=="")
{
alert("Select parking option");
return;
}

if(price<=0)
{
alert("Enter price");
return;
}


// object

let houseData={
state:state,
city:city,
location:location,
size:size,
bedrooms:bedrooms,
bathrooms:bathrooms,
metro:metro,
parking:parking,
price:price
};


// fetch API

fetch("saveHouse",
{
method:"POST",

headers:
{
"Content-Type":"application/json"
},

body:JSON.stringify(houseData)

})

.then(response=>response.text())

.then(data=>{
alert(data);
document.getElementById("houseForm").reset();
})

.catch(error=>{
alert("Error : "+error);
});

}



// clear function

function clearFields()
{
document.getElementById("houseForm").reset();
}

function showSection(sectionId) {
	  const sections = document.querySelectorAll(".section");
	  sections.forEach((sec) => sec.classList.add("d-none"));
	  document.getElementById(sectionId).classList.remove("d-none");
	}
	
//display user
function display()
{
	fetch("display").	
	then((res)=>{
		if(!res.ok)
			{
			return res.json().then((err)=>{
				throw err;
			});
			}
		return res.json();
	}).
	then((data)=>{   //ya data madhe back end vrun yenari list ahe
		let tb=document.getElementById("tb");
		tb.innerHTML="";
		data.forEach((ele)=>{  //yethe pratek emp cha data yeto 
			let tr=document.createElement("tr");
			let tdid=document.createElement("td");
			tdid.innerText=ele.eid;
			let tdn=document.createElement("td");
			tdn.innerText=ele.ename;
			let tds=document.createElement("td");
			tds.innerText=ele.sal;
			
			tr.appendChild(tdid);
			tr.appendChild(tdn);
			tr.appendChild(tds);
			
			tb.appendChild(tr);    
		});
	}).
	catch((err)=>{
		alert(err.message);
	});
}

</script>
</body>
</html>
