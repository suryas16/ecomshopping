$(function(){
	//solving active menu
	switch(menu){
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'About Us':
			$('#contact').addClass('active');
			break;
		case 'All Products':
			$('#listProducs').addClass('active');
			break;	
		default:
			$('#listProducts').addClass('active');
			$('#a_'+menu).addClass('active');
			break;
			
	}
});