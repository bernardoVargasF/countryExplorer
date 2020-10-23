var country = {};

function clic() {
	var name = document.getElementById("selectedCountryName");
	name.textContent = country;
	
	
	console.log("clicado: " + country);
	console.log("clicado: " + country.name);
	console.log("clicado: " + country.country.name);
	
}