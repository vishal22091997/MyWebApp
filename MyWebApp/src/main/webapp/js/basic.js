/**
 * 
 */
var xml = new XMLHttpRequest();

function fetchResults(){
	var data = document.getElementById('searchBox');
	console.log(data.value);
	xml.open("GET", "SearchProducts?text="+data.value, true);
	xml.onload = function(){
		console.log("reached");
		if(true){
			var query = JSON.parse(xml.responseText);
			console.log("reached inside function");
			var listing = document.getElementById('searchDropDown');
			listing.innerHTML = "";
			for(i=0;i<query.length;i++){
				var href = "SingleProduct?id="+query[i].id;
				listing.innerHTML += '<a href='+href+'>'+query[i].name+'</a>';
				console.log(i); 
			}
		}
	}
	xml.send();
	 
}