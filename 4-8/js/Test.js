$('.slider').slick({
    autoplay: true,       //自動再生
    autoplaySpeed: 1500,  //自動再生のスピード
    speed: 600,           //スライドするスピード
    dots: true,           //スライド下のドット
    arrows: true,         //左右の矢印
    infinite: true,       //永久にループさせる
});


// 要素を取得
const zoom = document.querySelectorAll(".zoom");
const zoomback = document.getElementById("zoomback");
const zoomimg = document.getElementById("zoomimg");

// 一括でイベントリスナ
zoom.forEach(function(value) {
      value.addEventListener("click",kakudai);
      });

function kakudai(e) {
// 拡大領域を表示
zoomback.style.display = "flex";
// 押された画像のリンクを渡す
zoomimg.setAttribute("src",e.target.getAttribute("src"));
// 「deka」クラスを付与
zoomimg.classList.add("deka");
}


// 元に戻すイベントリスナを指定
zoomback.addEventListener("click",modosu);

// 拡大領域を無きものに
function modosu() {
zoomback.style.display = "none";
// 「deka」クラスを削除
zoomimg.classList.remove("deka")
}