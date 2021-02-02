function board() {
    alert('눌렸어용')
}



// var num = 0;
// $(document).ready(function() {
//     $(".btn").click(function() {
//         $.post("/rep/write", {
//                 img_num: $("#img_num" + num).val(),
//                 writer_id: $("#writer_id" + num).val(),
//                 content: $("#content" + num).val()
//             })
//             .done(function(data) {
//                 //		    	alter(data);
//                 var items = eval("(" + data + ")"); //JSON 파일을 객체로 변환 
//                 var str = "";
//                 for (i = 0; i < items.length; i++) {
//                     str += items[i].content + "(작성자:" + items[i].writer_id + ")<br>";
//                 }
//                 //	    	alert(str);
//                 $("#div_" + items[0].img_num).html(str);
//             });
//     });
// });


$(document).ready(function() {

    $("#info").click(function() {
        // $.post("상세정보 요청할 url", {
        //     product_name: $("#product_name").val()
        // });

        // .done(function(data) {
        //     adf
        // });

        $("#product_info").css("background-color", " #86E57F");
        $("#review").css("background-color", "white");
        $("#return_info").css("background-color", " white");

        str = "안뇽";
        $("#board_contents_area").html(str);
    });


    $("#review").click(function() {
        $("#product_info").css("background-color", " white");
        $("#review").css("background-color", "#86E57F");
        $("#return_info").css("background-color", " white");
        str = "리뷰창입니다"

        $("#board_contents_area").html(str);
    });


    $("#info2").click(function() {
        $("#product_info").css("background-color", " white");
        $("#review").css("background-color", "white");
        $("#return_info").css("background-color", " #86E57F");


        str = "반품/교환 정보창입니다."

        $("#board_contents_area").html(str);
    });





});