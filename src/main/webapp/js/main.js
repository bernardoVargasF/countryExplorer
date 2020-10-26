function clic(name, capital, region, subregion, alpha2Code, languages) {
	document.getElementById("countryName").innerHTML = name;
	document.getElementById("countryCapital").innerHTML = capital;
	document.getElementById("countryRegion").innerHTML = region;
	document.getElementById("countrySubregion").innerHTML = subregion;
	document.getElementById("countryLangs").innerHTML = languages;

	getCountryFlag(alpha2Code);

	countryCounter(name);
}

function getCountryFlag(alpha2Code) {
	var flag = document.getElementById("flagElement");

	flag.src = "https://www.countryflags.io/" + alpha2Code + "/shiny/64.png";
}

function countryCounter(countryName) {

	selector = `#dlCountryCounter :contains('${countryName}')`
	selectedList = $(selector);

	if (selectedList.length) {			//Country previously selected
		var countryElement = document.getElementById(countryName + "List");
		if (countryElement.getElementsByTagName('DD').length > 0) {
			console.log("Tiene hijo");
			var counter = document.getElementById(countryName + "Counter");
			var count = counter.innerHTML;
			count++;
			counter.innerHTML = count;
		} else {
			console.log("No tiene hijo");
			var countryCount = document.createElement("DD");
			countryCount.id = countryName + "Counter";
			countryCount.innerHTML = 2;
			countryElement.appendChild(countryCount);
		}
	} else {							//New country selected
		var countryElement = document.createElement("DT");
		countryElement.id = countryName + "List";
		countryElement.innerHTML = countryName;
		var countryContainer = document.getElementById("dlCountryCounter");
		countryContainer.appendChild(countryElement);
	}

	orderDL(document.getElementById("dlCountryCounter"));
}

function orderDL(dl) {
	if (typeof dl == "string") {
		dl = document.getElementById(dl);
		
	}

	// Get the list items and setup an array for sorting
	var lis = dl.getElementsByTagName("DT");
	var lisCount = dl.getElementsByTagName("DD")
	var vals = [];
	var valsCount = [];

	// Populate the array
	for (var i = 0, l = lis.length; i < l; i++) {
		vals.push(lis[i].innerHTML);
		valsCount.push(lisCount[i].innerHTML);
	}

	// Sort it
	vals.sort();
	valsCount.sort();

	// Change the list on the page
	for (var i = 0, l = lis.length; i < l; i++) {
		lis[i].innerHTML = vals[i];
		lisCount[i].innerHTML = valsCount[i];		
	}
}