let tags = $('.tag').children('li');

console.log(tags);

$.each(tags, function(index,item) {
	item.prepend("#");	
});

$('.subject').click(function() {
	
});