function con (){
	$(".side-menu li ul li").removeClass("active");
}
function index(){
	$(".side-menu").children("li").eq(0).children("ul").children("li").eq(0).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function shgl(){
	$(".side-menu").children("li").eq(0).addClass("active").children("ul").children("li").eq(1).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function shsh(){
	$(".side-menu").children("li").eq(0).addClass("active").children("ul").children("li").eq(2).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function tscx(){
	$(".side-menu").children("li").eq(0).addClass("active").children("ul").children("li").eq(3).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function djjl(){
	$(".side-menu").children("li").eq(0).addClass("active").children("ul").children("li").eq(4).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function spgl(){
	$(".side-menu").children("li").eq(1).addClass("active").children("ul").children("li").eq(0).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function jsjgsz(){
	$(".side-menu").children("li").eq(1).addClass("active").children("ul").children("li").eq(1).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function ejjgsz(){
	$(".side-menu").children("li").eq(1).addClass("active").children("ul").children("li").eq(2).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function splxsz(){
	$(".side-menu").children("li").eq(1).addClass("active").children("ul").children("li").eq(3).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function pccx(){
	$(".side-menu").children("li").eq(2).addClass("active").children("ul").children("li").eq(0).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function jsjl(){
	$(".side-menu").children("li").eq(2).addClass("active").children("ul").children("li").eq(1).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function txmx(){
	$(".side-menu").children("li").eq(3).addClass("active").children("ul").children("li").eq(0).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function shzjmx(){
	$(".side-menu").children("li").eq(3).addClass("active").children("ul").children("li").eq(1).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function jslrmx(){
	$(".side-menu").children("li").eq(3).addClass("active").children("ul").children("li").eq(2).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function rxsfxbb(){
	$(".side-menu").children("li").eq(4).addClass("active").children("ul").children("li").eq(0).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function spxsbb(){
	$(".side-menu").children("li").eq(4).addClass("active").children("ul").children("li").eq(1).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function shjsbb(){
	$(".side-menu").children("li").eq(4).addClass("active").children("ul").children("li").eq(2).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function gygl(){
	$(".side-menu").children("li").eq(5).addClass("active").children("ul").children("li").eq(0).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function qxsz(){
	$(".side-menu").children("li").eq(5).addClass("active").children("ul").children("li").eq(1).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function zyczrz(){
	$(".side-menu").children("li").eq(5).addClass("active").children("ul").children("li").eq(2).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function wzsz(){
	$(".side-menu").children("li").eq(6).addClass("active").children("ul").children("li").eq(0).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
function kfsz(){
	$(".side-menu").children("li").eq(6).addClass("active").children("ul").children("li").eq(1).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}function ipsz(){
	$(".side-menu").children("li").eq(6).addClass("active").children("ul").children("li").eq(2).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}function wzgs(){
	$(".side-menu").children("li").eq(6).addClass("active").children("ul").children("li").eq(3).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}function mjjsjg(){
	$(".side-menu").children("li").eq(0).addClass("active").children("ul").children("li").eq(5).addClass("active");
	$(".child_menu li.active").parent().slideDown().parent().addClass("active");
}
$(function(){
 	$('.form-group .btn').on('click', function(){
		webToast("提交成功","middle",3000);
		
   });
   $('.demo1').on('click', function(){
		webToast("提交成功","middle",3000);

   });
   
   $('#demo2').on('click', function(){
		popTipShow.alert('弹窗标题','自定义弹窗内容，居左对齐显示，告知需要确认的信息等', ['知道了'],
			function(e){
			  //callback 处理按钮事件		  
			  var button = $(e.target).attr('class');
			  if(button == 'ok'){
				//按下确定按钮执行的操作
				//todo ....
				this.hide();
			  }	
			}
		);
   });
   
   $('.demo3').on('click', function(){
		popTipShow.confirm('删除提示','您确定要删除本条记录',['确 定','取 消'],
			function(e){
			  //callback 处理按钮事件
			  var button = $(e.target).attr('class');
			  if(button == 'ok'){
				//按下确定按钮执行的操作
				//todo ....				
				this.hide();
				setTimeout(function() {
					webToast("操作成功","top", 2000);
				}, 300);
			  }

			  if(button == 'cancel') {
				//按下取消按钮执行的操作
				//todo ....
				this.hide();
				setTimeout(function() {
					webToast("您选择“取消”了","bottom", 2000);
				}, 300);
			  }
			}
		);
   });
   
   $('#demo4').on('click', function(){
		var html = "<label>姓名：<input class='confirm_input' placeholder='请输入'></label>";
		popTipShow.confirm('弹窗标题',html,['确 定','取 消'],
			function(e){
			  //callback 处理按钮事件
			  var button = $(e.target).attr('class');
			  if(button == 'ok'){
				if(null==$(".confirm_input").val() || ""==$(".confirm_input").val()){
					webToast("姓名不能为空！","bottom", 3000);
					return;
				}	
				
				this.hide();
				setTimeout(function() {
					webToast($(".confirm_input").val(),"bottom", 3000);
				}, 300);
				
				//按下确定按钮执行的操作
				//todo ....								
			  }

			  if(button == 'cancel') {
				//按下取消按钮执行的操作
				//todo ....
				this.hide();
				setTimeout(function() {
					webToast("您选择“取消”了","top", 2000);
				}, 300);
			  }
			}
		);
   });
   
});
