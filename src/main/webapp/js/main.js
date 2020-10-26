
function clic(name, capital, region, subregion, alpha2Code, languages) {
	document.getElementById("countryName").innerHTML = name;
	document.getElementById("countryCapital").innerHTML = capital;
	document.getElementById("countryRegion").innerHTML = region;
	document.getElementById("countrySubregion").innerHTML = subregion;
	document.getElementById("countryLangs").innerHTML = languages;

	getCountryFlag(alpha2Code);

	countryCounter(name, capital, region, subregion, alpha2Code, languages);
}

function getCountryFlag(alpha2Code) {
	var flag = document.getElementById("flagElement");

	flag.src = "https://www.countryflags.io/" + alpha2Code + "/shiny/64.png";
}

function countryCounter(countryName, capital, region, subregion, alpha2Code, languages) {
	
	selector = `#dlCountryCounter :contains('${countryName}')`
	selectedList = $(selector);


	if (!selectedList.length) {			//New country selected
		var countryDiv = document.createElement("DIV");
		countryDiv.id = countryName + "CounterDiv";
		
		countryDiv.onclick = function() {
			clic(countryName, capital, region, subregion, alpha2Code, languages);
			getCountryFlag(alpha2Code);
		}
		
		
		var countryElement = document.createElement("DT");
		countryElement.id = countryName + "List";
		countryElement.innerHTML = countryName;
		var countryCounter = document.createElement("DD");
		countryCounter.id = countryName + "Counter";
		countryCounter.value = 1;
		countryCounter.innerHTML = "";
		countryDiv.appendChild(countryElement);
		countryDiv.appendChild(countryCounter);

		var dlCountryCounter = document.getElementById("dlCountryCounter");
		dlCountryCounter.appendChild(countryDiv);

		sortCountries(dlCountryCounter);
	} else {							//Country previously selected
		var countryCounter = document.getElementById(countryName + "Counter");
		var counter = countryCounter.value;
		counter++;
		countryCounter.innerHTML = counter;
		countryCounter.value = counter;
	}
}

// Code based on: http://jsfiddle.net/MabhY/
function sortCountries(dl) {
	var lis = dl.querySelectorAll("DIV");

	lis = Array.prototype.slice.call(lis).sort(function(a, b) {
		return a.textContent.toLowerCase().localeCompare(b.textContent.toLowerCase());
	}).forEach(function(e) {
		dl.appendChild(e);
	});

}