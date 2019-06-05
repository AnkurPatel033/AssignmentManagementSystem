function emailValidation()
{
   
	var validateEmail=document.getElementById("email").value;
	console.log(validateEmail);
	var warnigEmail=document.getElementById("emailWarning");
    var url="http://localhost:8071/assignmentt/emailValidation/"+validateEmail;
    warnigEmail.innerHTML="User already exist..";
    var xmlHttp=new XMLHttpRequest();
    xmlHttp.onreadystatechange=function()
	{
		if(xmlHttp.readtState==4 && xmlHttp.status==200)
			{
			consol.log(xmlHttp.responseText);
			}
		
		console.log("Ankur");
	}


	xmlHttp.open('GET',url,true);
	xmlHttp.send();
	
	
}