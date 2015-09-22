/**
 * 
 */



function replaceGetMessage(){
	
	document.getElementById('message').innerHTML='HELLO';
}
function access(func){
	
	func();
}

var employee = {
		
		firstName: 'Saurabh',
		lastName:'Pandey',
		netSalary:function(){
			alert('Total Salary');
		}
		
};
employee.netSalary();
var btnClickRef = document.getElementById('btnClick');

var eventHandler = function(){
	
	employee.firstName = 'sauran';
	alert(employee.firstName);
	employee.netSalary();
	
};


btnClickRef.addEventListener( "click", eventHandler);

function name(firstName,lastName){
	
	this.firstname = firstName;
	this.lastName = lastName;
	
	this.fullName = function(){
		
		return this.firstname + ' ' + this.lastName;
		
		
	};
	
}

nm  = new name('xyz','abc');

alert(nm.fullName());

alert(new Date());





